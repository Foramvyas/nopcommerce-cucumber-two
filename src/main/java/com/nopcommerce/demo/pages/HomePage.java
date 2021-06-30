package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Computers")
    WebElement computerLink;
    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;
    @FindBy(linkText = "Apparel")
    WebElement apparelLink;
    @FindBy(linkText = "Digital downloads")
    WebElement digitalDownloadsLink;
    @FindBy(linkText = "Books")
    WebElement booksLink;
    @FindBy(linkText = "Jewelry")
    WebElement jewelryLink;
    @FindBy(linkText = "Gift Cards")
    WebElement giftCardsLink;
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registrationLink;


    public void mouseHoverOnComputerLink(){

       log.info("Clicking on login link : " + computerLink.toString());
        mouseHoverToElement(computerLink);
    }

    public void clickOnComputerLink() {

        clickOnElement(computerLink);
        log.info("Clicking on login link : " + computerLink.toString());
    }
    public void clickOnElectronicsLink() {
       ;
        clickOnElement(electronicsLink);
        log.info("Clicking on login link : " + electronicsLink.toString());
    }

    public void clickOnApparelLink() {

        clickOnElement(apparelLink);
        log.info("Clicking on login link : " + apparelLink.toString());
    }
    public void clickOnDigitalDownloadsLink() {

        clickOnElement(digitalDownloadsLink);
        log.info("Clicking Digital Downloads link : " + digitalDownloadsLink.toString());
    }
    public void clickOnBooksLink() {

        clickOnElement(booksLink);
        log.info("Clicking on Books link : " + booksLink.toString());
    }
    public void clickOnJewelryLink() {

        clickOnElement(jewelryLink);
        log.info("Clicking on Jewelry link : " + jewelryLink.toString());
    }
    public void clickOnGiftCardsLink() {

        clickOnElement(giftCardsLink);
        log.info("Clicking on GiftCards  link : " + giftCardsLink.toString());
    }

    public void clickOnLoginLink() {

        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {

        clickOnElement(registrationLink);
        log.info("Clicking on login link : " + registrationLink.toString());
    }









}
