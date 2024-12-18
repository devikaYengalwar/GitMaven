package Module1_login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_files.Base_Class1;
import Library_files.UtilityClass;
import Module1_login.SwagLabLoginPage;
import Module1_login.SwagLabsHomePage;
import Module1_login.SwagLabsLogoutPage;

public class SwagLabsTestClass1 extends Base_Class1 

{
	
	SwagLabLoginPage login;
	SwagLabsHomePage s1;
	SwagLabsLogoutPage s2;
	Sheet sh;
	int TCID;
	
	
	/*public void InitializeBrowser() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}*/
	@BeforeClass
public void openBrowser()throws InterruptedException, EncryptedDocumentException, IOException 
{
	
		InitializeBrowser();

		login=new SwagLabLoginPage(driver);
		s1=new SwagLabsHomePage(driver);
		s2=new SwagLabsLogoutPage(driver);
	
}
	@BeforeMethod
public void LoginPage() throws EncryptedDocumentException, IOException, InterruptedException 
{
		
	
	login.EnterUN (UtilityClass.getPFData("UI"));
	login.EnterPW(UtilityClass.getPFData("PW"));
	login.LoginBtn();
	Thread.sleep(1000);
}
	@Test void VerifyLogo() throws EncryptedDocumentException, IOException
	{
		TCID=101;
		String actuLogoText = s1.getlogoText();
		 String expLogoText =UtilityClass.getTestData(0, 2);
		Assert.assertEquals(actuLogoText, expLogoText,"Fail=Bothe result are same");
	}
	@AfterMethod
	public void Logout(ITestResult S1) throws InterruptedException, IOException 
	{
		//code for fail SS
		if(S1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.ScreenShot(driver, 101);
		}
		s1.ClickOnMenu();
		Thread.sleep(2000);
		s2.logout();
		
		Thread.sleep(2000);
	}
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}
		
	
	
	
}
