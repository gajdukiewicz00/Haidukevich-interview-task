package Page;

import Drivers.DriverSingleton;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {

    protected final String BASE_URL = "https://shop.by/";
    protected WebDriver driver;
    public final long PhoneRegistration =  447631117;
    public final long Phone = 293169585;
    public final String Name = "Денис";
    public final String Surname = "Гайдукевич";
    public final String RenameEmail ="den.94dew@gmail.com";
    public final String Password = "Test1234";
    protected final int WAIT_TIMEOUT_SECONDS = 130;


    protected BasePage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitForVisibilityOfElement(WebElement webElement) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                .visibilityOf(webElement));
    }
}