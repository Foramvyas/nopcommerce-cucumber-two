Feature: Build Your own computer product purchase
  As a user I want to purchase the product

  Background:
    Given I am on home page

  @Smoke,@Sanity,@Regression
    Scenario:  Verify user should arrange product in alphabetical order successfully
      Given I am on computer page
      And I click on Desktops link
      And I sort the product list as Z to A
      Then I should sort the products in Z to A order


   @Smoke,@Regression
  Scenario: Verify user should added the product to shopping cart successfully
    Given I am on computer page
    And I click on Desktops link
    And I sort the product list as A to Z
    And I click on add to cart button for product
    Then I should navigate to Build your own computer product page
    And I select a Processor from Dropdown
    And I select the RAM from dropdown
    And I click on HDD radio button<"400 GB [+$100.00]">
    And I click on OS Vista Premium Radio button<"Vista Premium [+$60.00]">
    And I click on Software Microsoft Office check box<"Microsoft Office [+$50.00]">
    And I click on Software Commander Check box<"Total Commander [+$5.00]">
    Then I verify the total amount.
    When I click on add to cart for Build Your Own Computer product
    Then I should see the message that product added to cart successfully
    And I click on green pop up message





