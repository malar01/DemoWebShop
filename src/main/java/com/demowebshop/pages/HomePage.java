package com.demowebshop.pages;

import com.demowebshop.utilities.ObjectUtility;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class HomePage extends ObjectUtility {
    public WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public String getHomePageTitle() {
        String title=page.getPageTitle(driver);
        return title;
    }
    public String getHomePageDataFromExcel() throws IOException {
        String expected_title= excel.readStringData(1,0,"HomePage");
        return expected_title;
    }
}
