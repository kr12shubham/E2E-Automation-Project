package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObject.LoginPage;
import pageObject.landingPage;
import pageObject.portalHomePage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination extends base {

	@Given("^Initialize the chrome browser$")
	public void initialize_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = InitializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on the login button to land on the secure sign in page$")
	public void click_on_the_login_button_to_land_on_the_secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		landingPage l = new landingPage(driver);
		l.getlogin(driver).click();
	}

	@When("^User enters the credentials as username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_the_credentials_as_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lp = new LoginPage();
		lp.getemail(driver).sendKeys(arg1);
		lp.getpswd(driver).sendKeys(arg2);
		lp.getloginbutton(driver).click();
	}

	@SuppressWarnings("deprecation")
	@Then("^Varify that user is successfully logged in$")
	public void varify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		portalHomePage php= new portalHomePage(driver);
		Assert.assertTrue(php.getseachbox().isDisplayed());
	}
}

