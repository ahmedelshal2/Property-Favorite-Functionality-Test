package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PropertyDetailsPage {
    WebDriver driver;

    // Constructor
    public PropertyDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Click the favorite button
    public void clickFavorite() {
        driver.findElement(By.xpath("//*[@id=\"Paris\"]/div[4]/div[1]")).click();
    }

    // Get the error message displayed
    public String getErrorMessage() {
        return driver.findElement(By.id("error-message")).getText();
    }
}
