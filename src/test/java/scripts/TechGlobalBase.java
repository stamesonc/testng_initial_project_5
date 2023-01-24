package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalBasePage;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalLoginFormPage;
import utilities.ConfigProperties;
import utilities.Driver;

public class TechGlobalBase {
    WebDriver driver;
    TechGlobalBasePage techGlobalBasePage;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;
    TechGlobalLoginFormPage techGlobalLoginFormPage;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        techGlobalBasePage = new TechGlobalBasePage();
        driver.get(ConfigProperties.getProperty("appURL"));
    }

    @AfterMethod
    public void teardown() {
        Driver.quitDriver();
    }
}
