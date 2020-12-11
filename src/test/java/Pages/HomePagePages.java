package Pages;

import Utilities.BrowserUtilities;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class HomePagePages extends AbstractPageBase{


    @FindBy(xpath = "//div[@class='header-nav']")
    private List<WebElement> navigationMenu;


    @FindBy(xpath = "(//div[@class='header-nav']/div)[1]/ul")
    private List<WebElement> CompareElements;

    @FindBy(xpath = "//span[text()='Compare']")
    private WebElement compare;


    @FindBy(xpath = "//span[contains(text(),'Tools & Tips')]")
    private WebElement tools_tips;

    @FindBy(xpath = "//span[contains(text(),'Company')]")
    private WebElement company;

    public void waitForClick(){
        compare.click();
    }

    int B; int E ;

    public void getTextFromModules(String moduleName){

        List<String> elementsList0 = new ArrayList<>();
        int B = 2;
        int E = 10;

        for(int i = B; i < E; i++){

        }

        if (moduleName == "Compare"){
            waitForClick();
            BrowserUtilities.wait(2);
            for (int i = 2; i <10 ; i++) {
                WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
                elementsList0.add(autoInsurance22.getText());
            }
        }else if (moduleName == "Tools&Tips"){
            tools_tips.click();
            BrowserUtilities.wait(2);
            for (int i = 13; i <17 ; i++) {
                WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
                elementsList0.add(autoInsurance22.getText());
            }
        }else if (moduleName == "Company"){
            company.click();
            BrowserUtilities.wait(2);
            for (int i = 18; i <23 ; i++) {
                WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
                elementsList0.add(autoInsurance22.getText());
            }
        }else {
            System.out.println("Wrong Module Name, or Module Does Not Exist");
        }

        System.out.println("List of elements in the "+ moduleName+" module :" + elementsList0);
        System.out.println("Size of the list :" + elementsList0.size());

    }

    public void getTextFromModules_Cnd(String moduleName) {

        List<String> elementsList0 = new ArrayList<>();

        if (moduleName.equalsIgnoreCase("Compare")){
            waitForClick();
            BrowserUtilities.wait(2);
            B = 2; E = 10;
        }else if (moduleName.equalsIgnoreCase("Tools&Tips")){
            tools_tips.click();
            BrowserUtilities.wait(2);
            B = 13; E = 17;
        }
        else if (moduleName.equalsIgnoreCase("Company")){
            company.click();
            BrowserUtilities.wait(2);
            B = 18; E = 23;
        }else {
            System.out.println("Wrong Module Name, or Module Does Not Exist");
        }

        for (int i = B; i < E; i++) {
            WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
            elementsList0.add(autoInsurance22.getText());
        }

        System.out.println("List of elements in the "+ moduleName+" module :" + elementsList0);
        System.out.println("Size of the list :" + elementsList0.size());
    }



}
