package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public final String ORANGE = "rgba(255, 128, 14, 1)";

    public final String WHITE = "rgba(255, 255, 255, 1)";

    public WebElement iAm18Btn() {
        return getElementByXpath("//a[@class='top-btn']");
    }

    public WebElement bingoBtn() {
        return getElementByXpath("//li[@id='menu-item-11081']/a");
    }

    public WebElement productsMenu() {
        return getElementByXpath("//a[@title='Games']");
    }

    public WebElement clientHubBtn() {
        return getElementByXpath("//li[@id='menu-item-23582']/a");
    }

    public WebElement newsBtn() {
        return getElementByXpath("//li[@id='menu-item-9841']/a");
    }

    public WebElement contactBtn() {
        return getElementByXpath("//li[@id='menu-item-1820']/a");
    }

    public WebElement homeBtn() {
        return getElementByXpath("//li[@id='menu-item-1185']/a");
    }

    public WebElement nextThemesBtn() {
        return getElementByXpath("//div[@class='right-arrow slick-arrow']");
    }

    public List<WebElement> lislBingoThemes() {
        return getElementsByXpath("//div[@class='slick-track']//div[not(@id) and contains(@class, 'slick-slide')]");
    }

    public boolean checkListThemes() {
        HashSet<String> names = new LinkedHashSet<>();
        for (WebElement element : lislBingoThemes()) {
            names.add(element.getText());
            nextThemesBtn().click();
            sleep(1);
        }
        if (names.size() == 9) {
            return true;
        } else {
            return false;
        }
    }
}
