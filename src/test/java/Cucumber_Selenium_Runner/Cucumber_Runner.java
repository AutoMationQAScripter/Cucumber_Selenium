package Cucumber_Selenium_Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber_Runner {

	WebDriver driver;
	
@Given("^Launch Browser and check Page$")
public void launch_Browser_and_check_Page() throws Throwable {
	driver = new FirefoxDriver();
	driver.get("https://enterprise-demo.orangehrmlive.com/"); 
	
}

@When("^Enter Username and Password$")
public void enter_Username_and_Password() throws Throwable {
    
}

@Then("^Check invalid message$")
public void check_invalid_message() throws Throwable {
    }

}