package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PropertyDetailsPage;

import java.time.Duration;

public class FavoritePropertyTest {
    WebDriver driver;
    HomePage homePage;
    PropertyDetailsPage propertyDetailsPage;

    @BeforeMethod
    public void setUp() {
        String firefoxPath = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", firefoxPath);
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(new FirefoxProfile());
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://Makyee.com");
        homePage = new HomePage(driver);
    }

    @Test
    public void testFavoriteFunctionality()
    {

        try {

            // Open the website
            propertyDetailsPage = homePage.goToPropertyDetails();
            propertyDetailsPage.clickFavorite();
            // Wait for the popup to become visible
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[contains(text(), 'You need to login first')]")
            ));

            // Get the text from the popup and assert it
            String popupText = popup.getText();
            if ("fail and should be login".equals(popupText)) {
                System.out.println("Test Passed: Popup message is displayed correctly.");
            } else {
                System.out.println("Test Failed: Popup message is incorrect.");
            }
        } catch (Exception e) {
            System.out.println("Test Failed: Popup message not found or incorrect. " + e.getMessage());
        } finally {
            // Close the WebDriver

            driver.quit();

        }

    }
}
