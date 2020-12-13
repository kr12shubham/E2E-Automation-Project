package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title= By.cssSelector("body:nth-child(2) section:nth-child(5) div.container div.text-center > h2:nth-child(1)");

	public landingPage(WebDriver driver)
	{
		this.driver= driver;
	}
	public WebElement getlogin(WebDriver driver)
	{
		return driver.findElement(signin);
		
	}
	public WebElement gettitle()
	{
		return driver.findElement(title);
		
	
	}
}
