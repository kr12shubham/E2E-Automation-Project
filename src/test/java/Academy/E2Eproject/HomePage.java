package Academy.E2Eproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.landingPage;
import resources.base;

public class HomePage extends base {
	@Test(dataProvider = "getData")
	public void demo(String username, String password, String text) throws IOException {
		driver = InitializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		landingPage l = new landingPage(driver);
		l.getlogin(driver).click();
		LoginPage lp = new LoginPage();
		lp.getemail(driver).sendKeys(username);
		lp.getpswd(driver).sendKeys(password);
		System.out.println(text);
		
		lp.getloginbutton(driver).click();
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "kumarershubham@gmail.com";
		data[0][1] = "shubham123";
		data[0][2] = "user1";

		data[1][0] = "shubham15001@gmail.com";
		data[1][1] = "shubham@123";
		data[1][2] = "user2";
		return data;
	}

}
