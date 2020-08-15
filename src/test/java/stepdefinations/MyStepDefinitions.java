package stepdefinations;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("Started");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	 System.out.println("Started");
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	 System.out.println("Started");
    }

    @And("^Cards are displayed on the page$")
    public void cards_are_displayed_on_the_page() throws Throwable {
    	 System.out.println("Started");
    }
}