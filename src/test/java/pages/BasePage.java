package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class BasePage {

    public WebDriver driver;

    private int BASIC_TIME = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementByXpath(String locator) {
        return waitElementToBeClickable(locator);
    }

    public List<WebElement> getElementsByXpath(String locator) {
        return waitVisibilityOfAllElementsLocatedBy(locator);
    }

    public WebElement waitElementToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return wait.until(elementToBeClickable(By.xpath(locator)));
    }

    public List<WebElement> waitVisibilityOfAllElementsLocatedBy(String lokator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(lokator)));
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
