package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.*;

public class SetUpTests {
    //create a Web driver
    protected WebDriver driver;

    //create page objects
    protected HomePage homePage;
    protected LoginPage loginpage;
    protected DashboardPage dashboardPage;
    protected HouseholdPage householdPage;
    protected HomeappliancePage homeappliancePage;

    @BeforeTest
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //instantiate webdriver object
        driver=new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //launch foodco application
        driver.get("https://foodco.ng/");
        //instantiate Homepage
        homePage=new HomePage(driver);
    }

    @AfterTest
    public void closeBrowser(){

        driver.quit();
    }
}
