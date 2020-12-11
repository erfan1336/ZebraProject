package Tests;

import Pages.HomePagePages;
import Utilities.BrowserUtilities;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class HomePagesTests extends AbstractTestBase {

    HomePagePages homePagePages = new HomePagePages();


    @Test(description = "Verify Web Name")
    public void verifyTitle(){
        String expectedTitle = "The Zebra: Instantly Compare Insurance Quotes";
        Assert.assertEquals(homePagePages.getTile(),expectedTitle);
    }

    @Test(description = "Verify URL")
    public void verifyURL(){
        String expectedURL = "https://www.thezebra.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expectedURL);
    }

    @Test(description = "Get Elements from Modules")
    public void getElementsFromModules(){
        homePagePages.getTextFromModules("compare");
    }


    @Test(description = "verifyCompareElements")
    public void verifyCompareElements() {
        BrowserUtilities.wait(2);
        homePagePages.waitForClick();

    }









}
