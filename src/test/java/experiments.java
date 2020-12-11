import Utilities.BrowserUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class experiments {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.thezebra.com");

        driver.manage().window().maximize();

        BrowserUtilities.wait(2);

        WebElement compare = driver.findElement(By.xpath("//span[text()='Compare']"));
        compare.click();



//        //(//div[@class='header-nav-item']/ul/li/a)[1]
//        WebElement autoinsurance = driver.findElement(By.xpath("(//a[@data-track-click='internal_link' and @data-track-location='header' and @data-track-name='header_link'])[2]"));
//
//        System.out.println("auto insurance text : "+autoinsurance.getText());
//        System.out.println("----------------------------------------------------------------------------------");
//
//        BrowserUtilities.wait(5);
//
//        List<WebElement> compareList = driver.findElements(By.xpath("a"));
//        //List<WebElement> compareList = driver.findElements(By.xpath("((//div[@class='header-nav-item'])[1]/ul/li/a)[1]"));
//
//        for (WebElement compareElement : compareList){
//            if (!compareElement.getText().isEmpty()) {
//                System.out.println("compare elements: " + compareElement.getText());
//            }
//        }

        System.out.println("============================================================================================");
        for (int i = 2; i <10 ; i++) {
            List<String> elementsList0 = new ArrayList<>();
            WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
            elementsList0.add(autoInsurance22.getText());
            System.out.println("List of elements in Compare :" + elementsList0);
        }

        BrowserUtilities.wait(1);

        WebElement tools_tips = driver.findElement(By.xpath("//span[contains(text(),'Tools & Tips')]"));
        tools_tips.click();
        BrowserUtilities.wait(2);

        System.out.println("-------------------------------------------------------------------------------------------");
        for (int i = 13; i <17 ; i++) {
            List<String> elementsList0 = new ArrayList<>();
            WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
            elementsList0.add(autoInsurance22.getText());

            System.out.println("List of elements in Tools & Tips :" + elementsList0);
        }

        System.out.println("-------------------------------------------------------------------------------------------");
        BrowserUtilities.wait(1);
        WebElement company = driver.findElement(By.xpath("//span[contains(text(),'Company')]"));
        company.click();
        BrowserUtilities.wait(2);
        for (int i = 18; i <23 ; i++) {
            List<String> elementsList0 = new ArrayList<>();
            WebElement autoInsurance22 = driver.findElement(By.xpath("(//a[@data-track-name='header_link'])["+i+"]"));
            elementsList0.add(autoInsurance22.getText());

            System.out.println("List of elements in Company :" + elementsList0);
        }


        System.out.println("=============================================================================================");

        //for (int i = 1; i < 5 ; i++){
//            List<String> elementsList = new ArrayList<>();
//
//            BrowserUtilities.wait(4);
//            WebElement element1 = driver.findElement(By.partialLinkText("Home Insurance"));
//            WebElement element2 = driver.findElement(By.xpath("(//div[@class='header-nav-item']/ul/li/a)[2]"));
//            WebElement element3 = driver.findElement(By.xpath("(//div[@class='header-nav-item']/ul/li/a)[3]"));


//            String elementsString1 = element1.getAttribute();
//            String elementsString2 = element2.getAttribute();
//            String elementsString3 = element3.getAttribute();

//            List<String> second = new ArrayList<>();
//
//            second.add(elementsString1);
//            second.add(elementsString2);
//            second.add(elementsString3);



//            if (!elementsString.isEmpty()){
//               elementsList.add(elementsString);
//             }
//            System.out.println("Elements List : "+second.toString());
        //}


        driver.quit();







    }
}
