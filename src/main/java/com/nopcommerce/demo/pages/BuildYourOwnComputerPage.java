package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @FindBy(xpath = "//div[@class='item-box'][1]//button[text()='Add to cart']")
    WebElement addToCart;

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildOwnComputerText;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']")
    WebElement hddRadio;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement oSRadio;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareOne;

    @FindBy(xpath = "//input[@id='product_attribute_5_12' and @ name='product_attribute_5']")
    WebElement softwareTwo;

    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyPrice;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement clickAddToCart;

    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement verifyShoppingCartMessage;

    @FindBy(xpath = "//span[@class='close']")
    WebElement clickOnGreenBar;

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
        log.info("Click on add to cart button " + addToCart.toString());

    }

    public String verifyTextBuildYourOwnComputer() {

        log.info("Verify User Navigate to Build your own Computer product page " + buildOwnComputerText.toString());
        return getTextFromElement(buildOwnComputerText);
    }

    public void setSelectProcessorFromDropDownMenu(int value) {

        selectByIndexFromDropDown(selectProcessor, value);
        log.info("select the processor from drop down " + selectProcessor.toString());
    }

    public void setSelectRam(int value) {

        selectByIndexFromDropDown(selectRam, value);
        log.info("select the Ram from drop down " + selectRam.toString());
    }

    public void clickOnHdd(String HDD) {

        clickOnElement(hddRadio);
        log.info("click On Hdd from radio button " + hddRadio.toString());
    }

    public void clickOnOsRadio(String osRadio) {


        clickOnElement(oSRadio);
        log.info("Click on Os Radio from list" + oSRadio.toString());
    }

    public void clickOnMicrosoftOffice(String software1) {

        clickOnElement(softwareOne);
        clickOnElement(softwareOne);
        log.info("Click on MicrosoftOffice from checkbox " + softwareOne.toString());
    }

    public void clickOnSoftwareTotalCommander(String software2) {

        clickOnElement(softwareTwo);
        log.info("Click on Total Commander " + softwareTwo.toString());
    }

    public String setVerifyPrice() {
        log.info("Verify  the total Price $1475.00 " + verifyPrice.toString());
        return getTextFromElement(verifyPrice);
    }

    public void setClickAddToCartButton() {
        clickOnElement(clickAddToCart);
        log.info("Click add to cart " + clickAddToCart.toString());
    }

    public String verifyShoppingCartText() {
        log.info("Verify Shopping Cart Text " + verifyShoppingCartMessage.toString());
        return getTextFromElement(verifyShoppingCartMessage);
    }

    public void clickOnCrossGreenBar() {
        clickOnElement(clickOnGreenBar);
        log.info("Click on Green Bar " + clickOnGreenBar.toString());
    }


}
