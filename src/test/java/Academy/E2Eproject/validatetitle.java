package Academy.E2Eproject;

import java.io.IOException;

import org.testng.annotations.Test;

//import testng.framework.Assert;
import junit.framework.Assert;
import pageObject.landingPage;
import resources.base;

@SuppressWarnings("deprecation")
public class validatetitle extends base {

	@Test

	public void demo() throws IOException {
		driver = InitializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		landingPage l = new landingPage(driver);
		Assert.assertEquals(l.gettitle().getText(), "FEATURED COURSES");
		//Assert.assertEquals(l.gettitle().getText(), "ABC");
	}
}
