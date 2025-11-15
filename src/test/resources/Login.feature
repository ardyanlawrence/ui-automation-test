@login
Feature: Login

  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is in homepage

  @invalid-login
  Scenario: Login using invalid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid"
    When user click login button
    Then user see error message "Epic sadface: Username and password do not match any user in this service"

  @boundary-test
  Scenario: User try to checkout product
    Given user is on login page
    When user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is in homepage
    And user click add to cart
    And user click cart
    And user click checkout
    And user input firstname with "Ardyan"
    And user input lastname with "Lawrence"
    And user input postal code with "21345"
    And user click continue
    And user click finish
    Then user success to order "THANK YOU FOR YOUR ORDER"