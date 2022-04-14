package PAGE;

import BASE.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static LOCATORS.Locators.*;

public class practice_form extends BasePage {
    public practice_form(WebDriver driver) {
        super(driver);
    }

    public practice_form setName() {
        sendKeys(name, "Sedat");
        return this;
    }

    public practice_form setLastName() {
        sendKeys(lastName, "Can");
        return this;
    }

    public practice_form setEmail() {
        sendKeys(email, "sedatcan35@gmail.com");
        return this;
    }

    public practice_form setGender() {
        Random random = new Random();
        int randomGender = random.nextInt(findElements(gender).size());
        Click(findElements(gender).get(randomGender));
        return this;
    }

    public practice_form setMobile() {
        sendKeys(mobile, "5529354389");
        return this;
    }

    public practice_form setBirtDay() {
        locatorClick(birtDay);
        sleep(1000);
        selectAllClear(birtDay);
        sleep(1000);
        sendKeys(birtDay, "05.04.1991");
        sleep(1000);
        ENTER(birtDay);
        sleep(3000);
        return this;
    }

    public practice_form setSubject() {
        sendKeys(subjects, "English");
        ARROW_DOWN(subjects);
        ENTER(subjects);
        sleep(1000);
        return this;
    }


}
