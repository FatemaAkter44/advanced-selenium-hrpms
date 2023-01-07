package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage extends BasePageObject{

    public CheckBoxesPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    By header = By.xpath("//h3[text()='Checkboxes']");
    //By checkboxOne = By.

}
