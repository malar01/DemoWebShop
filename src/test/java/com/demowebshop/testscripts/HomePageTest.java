package com.demowebshop.testscripts;


import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends Base {
    HomePage home;

    @Test
    public void verifyHomePageTitle() throws IOException {
        home=new HomePage(driver);
        String expected_title=home.getHomePageDataFromExcel();
        String actual_title=home.getHomePageTitle();
        Assert.assertEquals(actual_title,expected_title,"ERROR:Invalid Home Page Title");
    }
}
