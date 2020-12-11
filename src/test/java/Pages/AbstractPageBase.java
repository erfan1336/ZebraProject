package Pages;

import Utilities.BrowserUtilities;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPageBase {


    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,15);

    //Constructor in order to initialize PageFactory
    public AbstractPageBase(){
        PageFactory.initElements(driver,this);
    }


    public void navigateTo(String tabName, String moduleName){

        String tabNameXpath = "//span[contains(text(),'"+ tabName +"')]";
        String moduleXpath = "//a[contains(text(),'"+ moduleName + "')]";

        WebElement tabElment = driver.findElement(By.xpath(tabNameXpath));
        WebElement moduleElment = driver.findElement(By.xpath(moduleXpath));

        Actions actions = new Actions(driver);
        BrowserUtilities.wait(4);
        actions.moveToElement(tabElment).
                pause(3000).
                click(moduleElment).
                build().perform();
        BrowserUtilities.wait(7);

    }

    public String getTile(){
        return driver.getTitle();
    }






    public List<String> getTextFromModules(List<WebElement> elements, String moduleName){


        List<String> elementsList = new ArrayList<>();

        if (moduleName == "Compare"){

            for (int i = 2; i <10 ; i++) {
                List<String> elementsList0 = new ArrayList<>();
                WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
                elementsList0.add(autoInsurance22.getText());
                System.out.println("List of elements in Compare :" + elementsList0);
            }
        }else if (moduleName == "Tools&Tips"){

            for (int i = 13; i <17 ; i++) {
                List<String> elementsList0 = new ArrayList<>();
                WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
                elementsList0.add(autoInsurance22.getText());
                System.out.println("List of elements in Tools&Tips :" + elementsList0);
            }

        }else if (moduleName == "Company"){

            for (int i = 13; i <17 ; i++) {
                List<String> elementsList0 = new ArrayList<>();
                WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
                elementsList0.add(autoInsurance22.getText());
                System.out.println("List of elements in Company :" + elementsList0);
            }
        }else {
            System.out.println("Wrong Module Name.");
        }

        return elementsList;
    }


}
