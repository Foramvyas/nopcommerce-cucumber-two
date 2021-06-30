package com.nopcommerce.demo.cucucmber.stepdefs;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Given("^I am on computer page$")
    public void iAmOnComputerPage() {
        //new HomePage().clickOnComputerLink();
        new HomePage().mouseHoverOnComputerLink();

    }

    @And("^I click on Desktops link$")
    public void iClickOnDesktopsLink() throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().clickOnDesktopsLink();

    }

    @And("^I sort the product list as Z to A$")
    public void iSortTheProductListAsZToA() {
        new ComputerPage().selectPositionFromDropdown(2);

    }

    @Then("^I should sort the products in Z to A order$")
    public void iShouldSortTheProductsInZToAOrder() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> products;
        products = new ComputerPage().getListOfProducts();
        List<String> productsList = new ArrayList<>();
        for (WebElement productName : products) {
            productsList.add(productName.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productsList);
        Collections.sort(tempList,Collections.reverseOrder());
        System.out.println(productsList);
        System.out.println(tempList);
        Assert.assertEquals(tempList,productsList);

    }
}
