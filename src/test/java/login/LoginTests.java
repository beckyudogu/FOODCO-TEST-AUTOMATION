package login;

import SetUp.SetUpTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.HomeappliancePage;
import pageObjects.HouseholdPage;
import pageObjects.LoginPage;

public class LoginTests extends SetUpTests {

    @Test (priority = 1)
        public void PopupImage() throws InterruptedException {

            String PopupImage = driver.findElement(By.className("wh_flybox_popup_content")).getText();
            System.out.println(PopupImage);

            //select lagos
            homePage.pickLagos();

            LoginPage loginPage = homePage.clickMyaccount();
            loginPage.enterUsername("beccabe18testify@yahoo.com");
            loginPage.enterPassword("admin11223#");
            //dashboard page
            DashboardPage dashboardPage = loginPage.clickLoginBtn();
            Thread.sleep(10000);

            dashboardPage.clickHHBtn();
            //select category household page
            HouseholdPage householdPage = dashboardPage.clickHHBtn();

            //select sub category-home appliances
            HomeappliancePage homeappliancePage = householdPage.clickHomeappliance();
            //assert 3 items in the subcategory
            homeappliancePage.getItem1();
            homeappliancePage.getItem2();
            homeappliancePage.getItem3();

            //click logout
            homeappliancePage.clickLogout();
            //confirm logout
            dashboardPage.confirmLogout();
            //go back to home page and print "Account logged out. Page URL is "https://foodco.ng/"
            loginPage.clickHome();
        }
    }




