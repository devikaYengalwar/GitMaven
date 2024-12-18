package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 
{
	@Test
public void TC() throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	driver.quit();
} 
	
}

