package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    //@FindBy(xpath = "//body/div[6]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

  //  @FindBy(xpath = "//select[@id='products-orderby']")
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement selectPosition;

    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> productsList;

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink);
        log.info("Clicking on desktops link : " + desktopsLink.toString());

    }

    //parameterize method
    public void selectPositionFromDropdown(int value) {

        selectByIndexFromDropDown(selectPosition, value);
        log.info("Select position from drop down :" + selectPosition.toString());
    }

    public List getListOfProducts() {

        log.info("Get list of products : " + productsList.toString());
       return getListOfElements(productsList);

    }


}
