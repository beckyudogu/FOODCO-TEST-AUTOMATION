package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    {
        this.driver = driver;
    }

    private By popHeading = By.className("wh_flybox_popup_content");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPopHeading() {
        return driver.findElement(popHeading).getText();
    }

    //select lagos as delievery area
    private By lagos = By.xpath("/html/body/div[6]/div[2]/div[1]/form/label[2]");

    public void pickLagos() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(lagos).click();
    }

    //get login page
    private By myAccount = By.xpath("/html/body/div[2]/div[1]/header/div[1]/div/div[3]/ul/li[1]/a");

    public LoginPage clickMyaccount() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(myAccount).click();
        return new LoginPage(driver);

    }

    public void closeBrowser() {

        driver.quit();
    }
}



