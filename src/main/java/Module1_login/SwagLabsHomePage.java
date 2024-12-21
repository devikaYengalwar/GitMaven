package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{


	@FindBy(xpath = "//div[@class='app_logo']") WebElement logo;
	@FindBy(xpath = "//button[text()='Open Menu']")private WebElement openmenu;
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")private WebElement addtocart;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")private WebElement productName;
	
	public SwagLabsHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	/*public void logo(String expeText) 
	{
		String actuLogoText = logo.getText();
		if(actuLogoText.equals(expeText))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}*/
	public String getlogoText() 
	{
		String LogoText = logo.getText();
		return LogoText;
		
	}
	public String GetProductName() 
	{
		String ProductText = productName.getText();
		return ProductText;
	}
	
	
	public void clickonAddtoCart() 
	{
		addtocart.click();
	}
	public void ClickOnMenu() 
	{
		openmenu.click();
	}
}

