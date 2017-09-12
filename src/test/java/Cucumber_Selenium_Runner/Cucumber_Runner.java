package Cucumber_Selenium_Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.unix.X11.Window;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber_Runner {

	WebDriver driver;
	
	@Given("^Launch Browser and check Page$")
	public void launch_Browser_and_check_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Enterprise.Demo.Orangehrmlive.Com/");
			  
	}

	@When("^Enter Username and Password$")
	public void enter_Username_and_Password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Deepak.Pal");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Deepak.Pal");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

	}

	@Then("^Check invalid message$")
	public void check_invalid_message() throws Throwable {
		WebElement str = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		if(str.equals("Invalid credentials"))
			System.out.println("Invalid credentials");
		
		driver.quit();
	
	}


}