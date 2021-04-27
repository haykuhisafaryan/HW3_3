package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;
    private By registerWithGoogleButton = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div/div[1]/a/li/div");
    private By registerWithEmailButton = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div/div[2]/a/li/div");
    private By signInButton = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div/span/a");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterWithGoogle clickRegisterWithGoogleButton() {
        driver.findElement(registerWithGoogleButton).click();
        return new RegisterWithGoogle(driver);
    }

    public LoginPage clickRegisterWithEmailButton() {
        driver.findElement(registerWithEmailButton).click();
        return new LoginPage(driver);
    }

    public SignIn clickSignInButton() {
        driver.findElement(signInButton).click();
        return new SignIn(driver);
    }

}
