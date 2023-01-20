package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {
    @FindBy(xpath = "//span[@onclick='Header__OpenAuthForm(this)']")
    private WebElement spanButton;
    @FindBy(xpath = "//input[@id='LLoginForm_phone']")
    private WebElement inputPhone;
    @FindBy(xpath = "//input[@id='LLoginForm_password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@class='Page__ActiveButtonBg Header__ButtonLogIn']")
    private WebElement clickSingIn;
    @FindBy(xpath = "//div[@class='header-photo']")
    private WebElement clickOnMenu;
    @FindBy(xpath = "//a[@href='/management/settings/update/']")
    private WebElement clickOnSettings;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement renameUsername;
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement renameName;
    @FindBy(xpath = "//input[@id='sur-name']")
    private WebElement renameSurname;
    @FindBy(xpath = "//div[@data-value='M']")
    private WebElement changerGender;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement renameEmail;
    @FindBy(xpath = "//input[@id='set-data']")
    private WebElement clickSubmit;
    @FindBy(xpath = "//input[@id='set-data']")
    public static WebElement checkSubmit;

    public UserPage() {
    }


    public UserPage spanMenu() {
        spanButton.click();
        return this;
    }
    public UserPage enterPhone() {
        inputPhone.sendKeys(String.valueOf(Phone));
        return this;
    }
    public UserPage enterPassword() {
        inputPassword.sendKeys(Password);
        return this;
    }
    public UserPage buttonSingIn() {
        clickSingIn.click();
        return this;
    }
    public UserPage clickButtonMenu() {
        clickOnMenu.click();
        return this;
    }
    public UserPage clickButtonSettings() {
        clickOnSettings.click();
        return this;
    }
    public UserPage renameUserName() {
        renameUsername.click();
        return this;
    }
    public UserPage Name() {
        renameName.sendKeys(Name);
        return this;
    }
    public UserPage Surname() {
        renameSurname.sendKeys(Surname);
        return this;
    }
    public UserPage Gender() {
        changerGender.click();
        return this;
    }
    public UserPage Email() {
        renameEmail.sendKeys(RenameEmail);
        return this;
    }
    public UserPage Submit() {
        clickSubmit.click();
        return this;
    }
    public UserPage buttonClickTest () {
        checkSubmit.click();
        return this;
    }
}
