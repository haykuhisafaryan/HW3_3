package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailAddressField = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div[1]/div/div/div");
    private By passwordField = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div[1]/div/div/div");
    private By fullNameField = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div[3]/div/div/div");
    private By cancelButton = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div[7]/button[1]/span");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailAddress(String emailAddress) {

        driver.findElement(emailAddressField).sendKeys(emailAddress);
    }

    public void setPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);
    }

    public void setFullName(String fullName) {

        driver.findElement(fullNameField).sendKeys(fullName);
    }

    public HomePage clickCancel() {
     driver.findElement(cancelButton).click();
     return new HomePage(driver);
    }
}