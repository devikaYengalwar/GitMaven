package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLogoutPage
{
@FindBy(xpath = "//a[@id='logout_sidebar_link']")private WebElement logout;

public SwagLabsLogoutPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
public void logout() 
{
	logout.click();
}
}
