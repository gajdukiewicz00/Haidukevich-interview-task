package Test;

import Page.RegistrationPage;

import org.junit.Assert;
import org.junit.Test;

import static Page.RegistrationPage.enterPhone;

public class RegistrationPageTest extends BaseTest{
    @Test
    public void registrationTest() throws InterruptedException {
        RegistrationPage registrationPage = new RegistrationPage();
        Thread.sleep(10000);
        registrationPage.buttonMenu()
                        .clickRegistration()
                        .registrationPhone();
        Thread.sleep(3000);
        Assert.assertFalse(enterPhone.isDisplayed());
    }
}
