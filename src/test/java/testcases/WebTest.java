package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;


public class WebTest extends DriverSetup {
    @Test
    public void testPageTitle(){
        getDriver().get("https://google.com");
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println(getDriver().getCurrentUrl());
    }
}
