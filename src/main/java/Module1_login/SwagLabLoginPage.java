package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class SwagLabLoginPage
	{
		//Step1-Declaration of global variable with private access modifier with the annotation@
		
		@FindBy(xpath = "//input[@id='user-name']")private WebElement  UN;
		
		@FindBy(xpath = "//input[@name='password']")private WebElement PW;
		@FindBy(xpath = "//input[@type='submit']")private WebElement loginButton;
		@FindBy(xpath = "//div[@class='error-message-container error']")private WebElement ErrorMgs;
		WebDriver driver1;

		private WebDriver driver;
		
		//Step2-Initialization within constructor with public specifier
		
		public SwagLabLoginPage(WebDriver driver)
		{
			PageFactory.initElements( driver ,this);
			this.driver1=driver;
		}
		//Usages in method with public
		
		public void EnterUN(String UserName) 
		{
			
			UN.sendKeys(UserName);
		}
		public void EnterPW(String Password) 
		{
			PW.sendKeys(Password);
		}
		public void LoginBtn() 
		{
			loginButton.click();
		}
		public void VerifyErrorMgs(String expErrorMgs) 
		{
			String actuErrorMgs = ErrorMgs.getText();
			if(actuErrorMgs.contains(expErrorMgs))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		
	}

