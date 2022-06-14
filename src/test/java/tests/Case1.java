package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class Case1 extends BaseTest {

    @Test
    public void color() {
        openPragmaticplay();
        HomePage homePage = new HomePage(driver);
        homePage.iAm18Btn().click();
        mouseoverElement(homePage.clientHubBtn());
        Assert.assertEquals(homePage.clientHubBtn().getCssValue("color"), homePage.ORANGE);
        mouseoverElement(homePage.newsBtn());
        Assert.assertEquals(homePage.newsBtn().getCssValue("color"), homePage.ORANGE);
        mouseoverElement(homePage.contactBtn());
        Assert.assertEquals(homePage.contactBtn().getCssValue("color"), homePage.ORANGE);
        mouseoverElement(homePage.homeBtn());
        Assert.assertEquals(homePage.homeBtn().getCssValue("color"), homePage.WHITE);
        mouseoverElement(homePage.productsMenu());
        mouseoverElement(homePage.bingoBtn());
        Assert.assertEquals(homePage.bingoBtn().getCssValue("color"), homePage.ORANGE);
    }
}
