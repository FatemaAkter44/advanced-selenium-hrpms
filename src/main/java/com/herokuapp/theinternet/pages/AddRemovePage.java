package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddRemovePage extends BasePageObject{
    /**
     * 1.get the url for the page
     * 2. open the page using  the url
     * 3.verify if reach on expected page
     * 4. click on AddElement button
     * 5.verify if clicked on add remove button
     * 6. click on delete button
     * 7. verify Delete button clicked
     *
     * Things to do in page for Add/remove
     * 1. collect url for page
     * 2. find element for add element button
     * 3find element for delete button
     * 4. find element for page header
     */

    private String url = "https://the-internet.herokuapp.com/add_remove_elements/";
    private By addElementButton =By.xpath("//button[contains(text(),'Add')]");
    private By deleteButton = By.xpath("//button[contains(text(),'Delete')]");
    private By pageHeader =By.xpath("//h3[text()='Add/Remove Elements']");


    public AddRemovePage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    public void openPage(){
        log.info("Opening page: " + url);
        openUrl(url);
        log.info("Page Opened");
    }
    public void verifyDrivrIsInAddRemovePage(){
        log.info("Verify if the driver is in the Add/remove Element page");
        //String expectedTest = "Add/Remove Elements";
        //String actualext = driver.findElement(pageHeader).getText();

        Assert.assertEquals(driver.findElement(pageHeader).getText(), "Add/Remove Elements");
        log.info("Driver is in the add removal page");
    }
    public void clickOnAddRemoveButton(){
        log.info("Click on Add/remove button: " + addElementButton);
        click(addElementButton);
        log.info("clicked on add remove element button: "+ addElementButton);
    }
    public void verifyClickedOnAddRemoveButton(){
        log.info("verify if clicked on add remove button. ");
        String expectedText = driver.findElement(deleteButton).getText();
        String actualText = "Delete";
        Assert.assertEquals(expectedText,actualText);
        log.info("Add Remove buttton clicked succesfully");
    }
    public void clickOnDeleteButton(){
        log.info("Click on delete button" + deleteButton);
        click(deleteButton);
        log.info("Clicked on delete button: " + deleteButton);
    }
    public void verifyClickedOnDeleteButton(){
        log.info("verify if clicked on Delete button");
        Assert.assertTrue(getCurrentPageSource().contains("Delete"));
        //Assert.assertTrue(!driver.findElement(deleteButton).isDisplayed());
        log.info("Clicked on Delete button");
    }


}
