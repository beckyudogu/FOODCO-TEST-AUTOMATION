package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HouseholdPage {
    private WebDriver driver;
    public HouseholdPage(WebDriver driver) {
        this.driver=driver;
    }


    //click Home appliance sub-category
    private By homeappliance= By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/a/span/span[1]");
    public HomeappliancePage clickHomeappliance(){
        driver.findElement(homeappliance).click();
        return new HomeappliancePage (driver);
    }
}

