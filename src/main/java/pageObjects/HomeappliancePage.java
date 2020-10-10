package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeappliancePage {
    //create a webdriver object
    private WebDriver driver;


       public HomeappliancePage(WebDriver driver) {
            this.driver = driver;
        }
        private By Item1= By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[1]/a/div");
        public void getItem1(){
            assert driver.findElement(Item1).isDisplayed();
        }
        private By Item2= By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[1]/a/div");
        public void getItem2(){
            assert driver.findElement(Item2).isDisplayed();
        }

        private By Item3= By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[1]/a/div");
        public void getItem3(){
            assert driver.findElement(Item3).isDisplayed();
        }
        
        private By logout = By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");

    public DashboardPage clickLogout() {
        driver.findElement(logout).click();
        return new DashboardPage(driver);
    }
}
