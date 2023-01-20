package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage() {
    }

    @FindBy(xpath = "//span[@onclick='Header__OpenAuthForm(this)']")
    private WebElement spanButton;
    @FindBy(xpath = "//a[@id='yt3']")
    private WebElement registrationButton;
    @FindBy(xpath = "//input[@name='LLoginForm[phone]']")
    public static WebElement enterPhone;

    public RegistrationPage buttonMenu() {
        spanButton.click();
        return this;
    }
    public RegistrationPage clickRegistration() {
        registrationButton.click();
        return this;
    }
    public RegistrationPage registrationPhone() {
        enterPhone.click();
        return this;
    }
}
