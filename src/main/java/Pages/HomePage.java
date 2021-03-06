package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public RegisterPage clickRegister() {
        clickXpath("//*[@id=\"site-container\"]/div/div[1]/div[2]/div[2]/div[2]/a/button");
        return new RegisterPage(driver);
    }

    public MenuPage clickCompete() {
        clickXpath("//*[@id=\"site-container\"]/div/div[1]/div[1]/div/div/div[1]/button");
        return new MenuPage(driver);
    }

    public SearchPage clickSearch() {
        clickXpath("//*[@id=\"site-container\"]/div/div[1]/div[2]/div[1]/div/input");
        return new SearchPage(driver);
    }

    public String getHeaderText() {
       return driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[2]/section[1]/div/div/div[1]/h1")).getText();
    }
}