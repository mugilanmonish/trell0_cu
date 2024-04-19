package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pageFactory.LoginPage_PF;

public class LoginDemoSteps_PF {

	WebDriver driver = null;
	LoginPage_PF login;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("LDS_PF");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://www.facebook.com/");  
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login = new LoginPage_PF(driver); 
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		login = new LoginPage_PF(driver);
		login.clickLogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		//  String title = driver.getTitle();
		driver.quit();
	}

}
