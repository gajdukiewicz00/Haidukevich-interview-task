package Test;

import Page.UserPage;
import org.junit.Assert;
import org.junit.Test;

import static Page.UserPage.checkSubmit;

public class UserPageTest extends BaseTest{
    @Test
    public void userTest() throws InterruptedException {
        UserPage userPage = new UserPage();
        Thread.sleep(5000);
        userPage.spanMenu()
                .enterPhone()
                .enterPassword()
                .buttonSingIn();
        Thread.sleep(5000);
        userPage.clickButtonMenu()
                .clickButtonSettings()
                .renameUserName()
                .Name()
                .Surname()
                .Gender()
                .Email()
                .Submit();
        Assert.assertEquals(true, checkSubmit.isDisplayed());
    }
}
