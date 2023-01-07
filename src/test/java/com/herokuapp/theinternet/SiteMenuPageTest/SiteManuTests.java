package com.herokuapp.theinternet.SiteMenuPageTest;

import com.herokuapp.theinternet.base.CsvDataProviders;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.SiteMenuPage;
import org.testng.annotations.Test;

import java.util.Map;

public class SiteManuTests extends TestUtilities {
    @Test(priority = 1, dataProvider = "csvReader", dataProviderClass = CsvDataProviders.class)
    public void verifyLogin(Map<String, String> testData){
        String username  = testData.get("username");
        String password = testData.get("password");
        SiteMenuPage siteMenuPage = new SiteMenuPage(driver, log);
        //siteMenuPage.logIn("testuser2022", "user2022@");
        siteMenuPage.logIn(username,password);


    }
   /* @Test
    public void sitemanuelistTest(){
        SiteMenuPage siteMenuPage = new SiteMenuPage(driver, log);
        siteMenuPage.logIn("testuser2022", "user2022@");
        log.info("Bring the List name for dash bord");
        //siteMenuPage.sitemenuList();
        //log.info("");

    }*/


}
