package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	By email = By.cssSelector("input[id='user_email']");
	By pswd = By.cssSelector("input[id='user_password']");
	By loginbtn = By.xpath("//input[@type='submit']");

	public WebElement getemail(WebDriver driver) {
		this.driver = driver;
		return driver.findElement(email);
	}
	public WebElement getpswd(WebDriver driver) {
		this.driver = driver;
		return driver.findElement(pswd);
	}
	public WebElement getloginbutton(WebDriver driver) {
		this.driver = driver;
		return driver.findElement(loginbtn);
	}

}


