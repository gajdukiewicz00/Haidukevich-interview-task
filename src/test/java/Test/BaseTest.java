package Test;

import Drivers.DriverSingleton;
import Page.BasePage;
import org.junit.After;
import org.junit.Before;

    public class BaseTest extends BasePage {

        @Before
        public void openPage() {
            driver.get(BASE_URL);

        }


        @After
        public void finishTest() {
            DriverSingleton.closeDriver();
        }
}
