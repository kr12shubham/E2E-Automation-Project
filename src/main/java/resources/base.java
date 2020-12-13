package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	
	public WebDriver InitializeDriver() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\kumar\\eclipse-workspace\\E2Eproject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kumar\\Downloads\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().fullscreen();
		}
		else if(browserName== "firefox")
		{
			
		}
		else if(browserName== "IE")
		{
			
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	}
	public void getScreenShotPath()
	{
TakesScreenshot ts=	(TakesScreenshot) driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(source, new File())
	}

}
