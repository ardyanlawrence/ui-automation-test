package org.ardyan.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ardyan.BaseTest;
import org.ardyan.page.Checkout;

public class CheckoutStepDef extends BaseTest {
    Checkout checkoutPage;

    public CheckoutStepDef(){
        this.checkoutPage = new Checkout(driver, wait);
    }
    @And("user click add to cart")
    public void userClickAddToCart() {
        checkoutPage.clickAddToCartButton();
    }

    @And("user click cart")
    public void userClickCart() {
        checkoutPage.clickCartButton();
    }

    @And("user click checkout")
    public void userClickCheckout() {
        checkoutPage.clickCheckoutButton();
    }

    @And("user input firstname with {string}")
    public void userInputFirstnameWith(String firstName) {
        checkoutPage.inputFirstname(firstName);
    }

    @And("user input lastname with {string}")
    public void userInputLastnameWith(String lastName) {
        checkoutPage.inputLastname(lastName);
    }

    @And("user input postal code with {string}")
    public void userInputPostalCodeWith(String postCode) {
        checkoutPage.inputPostalCode(postCode);
    }

    @And("user click continue")
    public void userClickContinue() {
        checkoutPage.clickContinueButton();
    }

    @And("user click finish")
    public void userClickFinish() {
        checkoutPage.clickFinishButton();
    }

    @Then("user success to order {string}")
    public void userSuccessToOrder(String message) {
        checkoutPage.validateSuccessCheckout(message);
    }
}
