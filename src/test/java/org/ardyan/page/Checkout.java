package org.ardyan.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Checkout {
    WebDriver driver;
    WebDriverWait wait;
    By addToCartButton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    By cartButton = By.className("shopping_cart_link");
    By checkoutButton = By.xpath("//*[@id=\"checkout\"]");
    By firstnameInputText = By.cssSelector("input#first-name");
    By lastnameInputText = By.cssSelector("input#last-name");
    By postalCodeInputText = By.cssSelector("input#postal-code");
    By continueButton = By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input");
    By finishButton = By.id("finish");

    public Checkout(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCartButton() {
        driver.findElement(cartButton).click();
    }

    public void clickCheckoutButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(checkoutButton));
        driver.findElement(checkoutButton).click();
    }

    public void inputFirstname(String firstname) {
        driver.findElement(firstnameInputText).sendKeys(firstname);
    }

    public void inputLastname(String lastname) {
        driver.findElement(lastnameInputText).sendKeys(lastname);
    }

    public void inputPostalCode(String postalCode) {
        driver.findElement(postalCodeInputText).sendKeys(postalCode);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }

    public void validateSuccessCheckout(String successCheckout) {
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.saucedemo.com/checkout-complete.html", currentUrl);
    }
}
