package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.signin_page;

public class SigninSteps extends Config {
    signin_page sp = new signin_page(driver);


    @Given("user on Macys Homepage")
    public void userOnMacysHomepage() {
        driver.get("https://www.macys.com/account/signin");

    }
    @And("user enter valid email address and password")
    public void userEnterValidEmailAddressAndPassword() {
        sp.enterEmailAddress(Email_Address);
        sp.enterPassword(password);
    }

    @When("user click on sign in button")
    public void userClickOnSignInButton() {sp.clickOnSigninButton();}

    @Then("user should be able to successfully Sign in")
    public void userShouldBeAbleToSuccessfullySignIn() {sp.verifyusersuccessfullylogin();
    }


}
