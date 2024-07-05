package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to a property details page
    public PropertyDetailsPage goToPropertyDetails() {
        driver.findElement(By.xpath("//*[@id=\"site\"]/section[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/div[4]/div[1]")).click();
        return new PropertyDetailsPage(driver);
    }
}
