package PAGE;

import BASE.BasePage;
import BASE.BaseTest;
import org.openqa.selenium.WebDriver;
import static LOCATORS.Locators.*;

public class practice_form extends BasePage {
    public practice_form(WebDriver driver) {
        super(driver);
    }

    public practice_form setName() {
        sendKeys(name,"Sedat");
        return this;
    }
    public practice_form setLastName(){
        sendKeys(lastName,"Can");
        return this;
    }
}
