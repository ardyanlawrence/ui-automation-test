package org.ardyan.stepdef;

import io.cucumber.java.en.Then;
import org.ardyan.BaseTest;
import org.ardyan.page.Home;

public class HomeStepDef extends BaseTest {
    Home homePage;

    @Then("user is in homepage")
    public void userIsInHomepage() {
        homePage = new Home(driver);
        homePage.validateOnHomePage();
    }
}
