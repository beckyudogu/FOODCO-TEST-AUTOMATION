package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver=driver;
    }
    //click on household category
    public HouseholdPage clickHHBtn() {
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-3339\"]/a")).click();
        return new HouseholdPage(driver);
    }
    //confirm logout
    public LoginPage confirmLogout(){
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/article/div/div/div/div/div/p[1]/a")).click();
        return new LoginPage(driver);
    }
}



