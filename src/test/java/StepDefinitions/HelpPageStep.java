package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpPageStep {
	
	@Given("user is login to application with valid username and password")
	public void user_is_login_to_application_with_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given executing");
	}

	@When("user click help page")
	public void user_click_help_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When executing");
	}

	@And("verify the title")
	public void verify_the_title() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And executing");
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then executing");
	}
}
