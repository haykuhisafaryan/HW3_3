package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    private WebDriver driver;
    private By heading = By.xpath("//*[@id=\"site-container\"]/div/div[3]/div[2]/div/div/div[1]/p");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String searchResultPageSubheading() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(heading))).getText();

    }

}
