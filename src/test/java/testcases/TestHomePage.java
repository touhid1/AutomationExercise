package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void loadHomePageForTest(){
        homePage.loadHomePage();
    }

    @Test
    public void TestHomePageTitle(){
        homePage.addScreenshot("Home Page");
        Assert.assertEquals(getDriver().getTitle(), homePage.title);
    }

    @Test(description = "Test Login-Signup button on the Home page")
    @Description("Allure Description TestLogin-Signup button")
    public void TestLoginSignupButton(){
        homePage.addScreenshot("Home Page");
        homePage.clickOnElement(homePage.login_signup_btn);
        Assert.assertFalse(getDriver().getCurrentUrl().equals(homePage.url));
    }
}
