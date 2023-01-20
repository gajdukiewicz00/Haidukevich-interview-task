package Test;

import Page.LogPage;
import org.junit.Assert;
import org.junit.Test;

import static Page.LogPage.iconWithAuthorizedUser;


public class LogPageTest extends BaseTest {
    @Test
    public void LogPageTest() throws InterruptedException {
        LogPage logPage = new LogPage();
        Thread.sleep(10000);
        logPage.spanMenu()
                .enterPhone()
                .enterPassword()
                .buttonSingIn();
        Thread.sleep(10000);
        Assert.assertEquals(true, iconWithAuthorizedUser.isDisplayed());
    }

}
