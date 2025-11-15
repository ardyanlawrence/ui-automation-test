package org.ardyan.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.ardyan.BaseTest;
import org.ardyan.page.Login;

public class LoginStepDef extends BaseTest {
    protected Login loginPage;


    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new Login(driver);
        loginPage.goToLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("user see error message {string}")
    public void userSeeErrorMessage(String error_message) {
        loginPage.validateErrorAppear(error_message);
    }
}
