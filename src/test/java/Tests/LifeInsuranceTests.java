package Tests;

import Pages.AbstractPageBase;
import Pages.LifeInsurancePages;
import Utilities.BrowserUtilities;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LifeInsuranceTests extends AbstractTestBase {

    LifeInsurancePages lifeInsurancePages = new LifeInsurancePages();

    @Test
    public void verifyPageTitle(){

        BrowserUtilities.wait(5);
        lifeInsurancePages.navigateTo("Compare","Car Insurance By Vehicle");
        BrowserUtilities.wait(5);

    }
}
