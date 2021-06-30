package com.nopcommerce.demo.cucucmber.stepdefs;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class BuildYourOwnComputer {

    @And("^I sort the product list as A to Z$")
    public void iSortTheProductListAsAToZ() throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().selectPositionFromDropdown(1);

    }


    @And("^I click on add to cart button for product$")
    public void iClickOnAddToCartButtonForProduct() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I should navigate to Build your own computer product page$")
    public void iShouldNavigateToBuildYourOwnComputerProductPage() throws InterruptedException {
        Thread.sleep(1000);

        String expectedMessage = "Build your own computer";
        String actualMessage = new BuildYourOwnComputerPage().verifyTextBuildYourOwnComputer();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("^I select a Processor from Dropdown$")
    public void iSelectAProcessorFromDropdown() throws InterruptedException {
        Thread.sleep(500);
        new BuildYourOwnComputerPage().setSelectProcessorFromDropDownMenu(1);

    }

    @And("^I select the RAM from dropdown$")
    public void iSelectTheRAMFromDropdown() throws InterruptedException {
        Thread.sleep(1000);

        new BuildYourOwnComputerPage().setSelectRam(3);

    }

    @And("^I click on HDD radio button<\"([^\"]*)\">$")
    public void iClickOnHDDRadioButton(String HDD) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnHdd(HDD);

    }

    @And("^I click on OS Vista Premium Radio button<\"([^\"]*)\">$")
    public void iClickOnOSVistaPremiumRadioButton(String Os) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnOsRadio(Os);

    }

    @And("^I click on Software Microsoft Office check box<\"([^\"]*)\">$")
    public void iClickOnSoftwareMicrosoftOfficeCheckBox(String software1) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnMicrosoftOffice(software1);

    }


    @And("^I click on Software Commander Check box<\"([^\"]*)\">$")
    public void iClickOnSoftwareCommanderCheckBox(String software2) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnSoftwareTotalCommander(software2);
    }


    @Then("^I verify the total amount\\.$")
    public void iVerifyTheTotalAmount() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMessage1 = "$1,475.00";
        String actualMessage1 = new BuildYourOwnComputerPage().setVerifyPrice();
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }

    @When("^I click on add to cart for Build Your Own Computer product$")
    public void iClickOnAddToCartForBuildYourOwnComputerProduct() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().setClickAddToCartButton();
    }

    @Then("^I should see the message that product added to cart successfully$")
    public void iShouldSeeTheMessageThatProductAddedToCartSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMessage2 = "The product has been added to your shopping cart";
        String actualMessage2 = new BuildYourOwnComputerPage().verifyShoppingCartText();
        Assert.assertEquals(expectedMessage2, actualMessage2);

    }

    @And("^I click on green pop up message$")
    public void iClickOnGreenPopUpMessage() throws InterruptedException {
        Thread.sleep(1000);

        new BuildYourOwnComputerPage().clickOnCrossGreenBar();
    }


}
