package Tests;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class AbstractTestBase {

    protected WebDriverWait wait;
    protected Actions actions;


    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://www.thezebra.com/");
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(),8);
        actions = new Actions(Driver.getDriver());
    }

    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }





}
