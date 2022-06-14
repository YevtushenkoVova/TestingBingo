package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void exit() {
        driver.quit();
    }

    public void openPragmaticplay() {
        driver.get("https://www.pragmaticplay.com/en/");
    }

    public void mouseoverElement(WebElement loc) {
        Actions actions = new Actions(driver);
        actions.moveToElement(loc).perform();
    }
}
