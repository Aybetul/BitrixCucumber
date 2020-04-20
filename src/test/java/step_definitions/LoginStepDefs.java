package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefs {
//    LoginPage loginPage=new LoginPage();
//
//    @Given("user is on the login page")
//    public void user_is_on_the_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
//    }
//
//    @When("user logs in as a help desk")
//    public void user_logs_in_as_a_help_desk() {
//        loginPage.login("help_desk");
//    }
//
//    @Then("user should verify that title is a Portal")
//    public void user_should_verify_that_title_is_a_Portal() {
//        Assert.assertEquals(Driver.getDriver().getTitle(),("Portal"));
//    }
//
//    @When("user logs in as a marketing")
//    public void user_logs_in_as_a_marketing() {
//        loginPage.login("marketing");
//    }
//
//    @When("user logs in as a hr")
//    public void user_logs_in_as_a_hr() {
//        loginPage.login("hr");
//    }
//
//    @When("user enters {string} username and {string} password")
//    public void user_enters_username_and_password(String username, String password) {
//       loginPage.login(username,password);
//    }
@Given("user is on the login page")
public void user_is_on_the_login_page() {
    System.out.println("jnnkj");

}

    @When("user logs in as a help desk")
    public void user_logs_in_as_a_help_desk() {
        System.out.println("jnnkj");

    }

    @Then("user should verify that title is a Portal")
    public void user_should_verify_that_title_is_a_Portal() {
        System.out.println("jnnkj");
    }

    @When("user logs in as a marketing")
    public void user_logs_in_as_a_marketing() {
        System.out.println("jnnkj");

    }

    @When("user logs in as a hr")
    public void user_logs_in_as_a_hr() {
        System.out.println("jnnkj");

    }

    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("jnnkj");

    }


}
