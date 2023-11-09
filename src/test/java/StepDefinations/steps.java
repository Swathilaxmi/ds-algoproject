package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pageobjects.registerPage;
import Pageobjects.signinPage;
import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class steps {
WebDriver driver;
public registerPage rp;
public signinPage sp;


@Given("User Launch Chrome browser")
public void user_launch_chrome_browser() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  rp=new registerPage(driver);
	  sp=new signinPage(driver);
	  
}


//Register
	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		//WebDriverManager.chromedriver().setup();
	    driver.get("https://dsportalapp.herokuapp.com/");
	}

	@When("Click on Get Started")
	public void click_on_get_started() {
	    rp.getstartedbutton();
	   
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedMessage) {
	String actualMessage = sp.Pagetitle();
	System.out.println(actualMessage);
	Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	
	@When("User click on Register link")
	public void user_click_on_register_link() {
	    rp.registerbutton();
	}

	@When("User enters Username as {string} ,Password as {string} and Password confirmation as {string}")
	public void user_enters_username_as_password_as_and_password_confirmation_as(String username, String password, String passwordconfirmation) {
	    rp.enterTxtintoUsername(username);
	    rp.enterTxtintoPassword(password);
	    rp.enterTxtintoconfirmationPassword(passwordconfirmation);
	}

	@When("The user clicks on Register button")
	public void the_user_clicks_on_register_button() {
        rp.clickonRegisterButton();
	}

	//@Then("The user should be redirected to Homepage with the message {string}")
	//public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
	    
	//}

	//signin
	
	
	@When("User click on Sign in link")
	public void user_click_on_sign_in_link() throws InterruptedException {
		Thread.sleep(4000);
		sp.clickonsignin();
	    
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String username, String password) {
		sp.enterUsernameinSignin(username);
		sp.enterPasswordinSignin(password);
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		sp.clickOnLogin();
	    
	}
	
	@Then("The user should get a message {string}")
	public void the_user_should_get_a_message(String expectedMessage) {
		String actualMessage = sp.Loginpage();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
		sp.clickonregisterlink();
	}
	
	

	@When("The user clicks on Signout button")
	public void the_user_clicks_on_signout_button() {
		sp.clickonsignOutlink();   
	}
	
	//Invalid
	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String username, String password) {
	   sp.enterUsernameinSignin(username);
		sp.enterPasswordinSignin(password);
	}

	@Then("The user should get error message {string} below first empty field {string} {string}")
	public void the_user_should_get_error_message_below_first_empty_field(String expectedMessage, String username, String password) {
		if (username.isEmpty()) {
			String actualMessage = sp.txtUsername.getAttribute("validationMessage");
			Assert.assertEquals(actualMessage, expectedMessage);
		} else if (password.isEmpty()) {
			String actualMessage = sp.txtloginPassword.getAttribute("validationMessage");
			Assert.assertEquals(actualMessage, expectedMessage);
		}

		
		
	}
}
