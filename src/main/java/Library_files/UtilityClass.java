package Library_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
public static String getTestData(int rowIndex,int ColIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\Excel Sheet\\book.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	String value = sh.getRow(rowIndex).getCell(ColIndex).getStringCellValue();
	return value;
}
	public static void ScreenShot(WebDriver driver,int TCID) throws IOException 
	{
		File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Users\\Ballewar\\eclipse-workspace\\Selenium\\ScreenShot\\TestCaseId"+TCID+".jpg");
	
		FileHandler.copy(sr, Dest);
		
	}
	public static String getPFData(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Ballewar\\eclipse-workspace\\Selenium\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
	}

}
