package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogPage extends BasePage{
    public LogPage() {
    }

    @FindBy(xpath = "//span[@onclick='Header__OpenAuthForm(this)']")
    private WebElement spanButton;
    @FindBy(xpath = "//input[@id='LLoginForm_phone']")
    private WebElement inputPhone;
    @FindBy(xpath = "//input[@id='LLoginForm_password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@class='Page__ActiveButtonBg Header__ButtonLogIn']")
    private WebElement clickSingIn;
    @FindBy(xpath = "//div[@id='header-photo']")
    public static WebElement iconWithAuthorizedUser;



    public LogPage spanMenu() {
        spanButton.click();
        return this;
    }
    public LogPage enterPhone() {
        inputPhone.sendKeys(String.valueOf(PhoneRegistration));
        return this;
    }
    public LogPage enterPassword() {
        inputPassword.sendKeys(Password);
        return this;
    }
    public LogPage buttonSingIn() {
        clickSingIn.click();
        return this;
    }
}
