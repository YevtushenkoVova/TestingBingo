package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class Case2 extends BaseTest {

    @Test
    public void checkBingoThemes() {
        openPragmaticplay();
        HomePage homePage = new HomePage(driver);
        homePage.iAm18Btn().click();
        mouseoverElement(homePage.productsMenu());
        homePage.bingoBtn().click();
        mouseoverElement(homePage.lislBingoThemes().get(1));
        Assert.assertTrue(homePage.checkListThemes());
    }
}
