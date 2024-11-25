
package tests.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.DriverManager;

public class SampleWebTest {

    @Test
    public void testLoginPage() {
        WebDriver driver = DriverManager.getDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        
        // Locate and interact with elements
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        loginButton.click();

        // Validate success message
        WebElement successMessage = driver.findElement(By.cssSelector("div.flash.success"));
        assert successMessage.getText().contains("You logged into a secure area!");
        
        DriverManager.quitDriver();
    }
}
