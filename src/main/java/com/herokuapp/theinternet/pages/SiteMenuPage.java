package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SiteMenuPage extends BasePageObject {


    /**
     *1. go to login page
     * find username, click and type user name
     * find element for password, click and send keys
     * find element for log in and click
     * Find the components and veryfy if they are present site
     * Click on dashboard and verify the page with url
     *
     * */
    private By usernameLocator = By.id("exampleInputEmail");
    private By passwordLocator = By.id("exampleInputPassword");
    private By logInButtonLocator = By.xpath("//button[contains(text(),'Login')]");
    private By headerOfPage = By.xpath("//span[contains(text(),'Izaan Human Resource')]");
    private By siteMeanuList = By.xpath("(//li[@class='nav-item'])");
    private By catagoryWiseEmployeeElemnt =By.xpath("//div[contains(text(),'Category Wise')]");
    String url = "http://hrpms.izaan.io/Auth/Account/Login?returnurl=%2F";

    public SiteMenuPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    /** Execute log in */
    public void logIn(String username, String password) {
       // username="testuser2022";
        //password="user2022@";

        openUrl(url);
        log.info("Log in page opened");
       driver.findElement(usernameLocator).sendKeys(username);
        //type(username,usernameLocator);
        log.info("Username typed : "+ username);

        driver.findElement(passwordLocator).sendKeys(password);
        //type(password, passwordLocator);
        log.info("Password typped: " + password);

        driver.findElement(logInButtonLocator).click();
        //click(logInButtonLocator);
        log.info("Clicked on Login button");

        Assert.assertEquals(driver.findElement(headerOfPage).getText(), "Izaan Human Resource Management System");
        log.info("verified logged in");

    }



    public void sitemenuList(){
        List<WebElement> listOfDashbord = driver.findElements(siteMeanuList);
        for (int i = 0; i < listOfDashbord.size(); i++) {
            WebElement element = listOfDashbord.get(i);
            String nameOfDashBordList = element.getText();
            System.out.println(nameOfDashBordList);

        }


    }






}
