package com.herokuapp.theinternet.addremovepagetest;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.AddRemovePage;
import org.testng.annotations.Test;

public class AddRemovePageTest extends TestUtilities {
    @Test
    public void testOpenAddRemovalPage(){
        AddRemovePage addRemovePage = new AddRemovePage(driver, log);
        addRemovePage.openPage();
        addRemovePage.verifyDrivrIsInAddRemovePage();

    }
    @Test
    public void testClickOnAddRemoveElementButton(){
        AddRemovePage addRemovePage = new AddRemovePage(driver, log);
        addRemovePage.openPage();
        addRemovePage.clickOnAddRemoveButton();
        addRemovePage.verifyClickedOnAddRemoveButton();
    }
    @Test
    public void clickOnDeleteButton(){
        AddRemovePage addRemovePage =new AddRemovePage(driver, log);
        addRemovePage.openPage();
        addRemovePage.clickOnAddRemoveButton();
        addRemovePage.clickOnDeleteButton();
        addRemovePage.verifyClickedOnDeleteButton();
    }
}
