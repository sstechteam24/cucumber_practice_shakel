package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	
	public static WebDriver driver= null;
	
	@Given("open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	   
	}

	@Given("open the url")
	public void open_the_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	}

	@When("enter the user")
	public void enter_the_user() {

	}

	@When("enter the pass")
	public void enter_the_pass() {

	}

	@When("hit log in button")
	public void hit_log_in_button() {

	}

	@Then("Validate the log in success or not")
	public void validate_the_log_in_success_or_not() {

	}

}
