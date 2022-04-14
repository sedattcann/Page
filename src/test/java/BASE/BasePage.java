package BASE;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BasePage {
    WebDriver driver = null;
    WebDriverWait wait = null;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by, String text) {
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }

    public ArrayList<WebElement> findElements(By by) {
        return new ArrayList<>(driver.findElements(by));
    }

    public void locatorClick(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void Click(WebElement Companent) {
        Companent.click();
    }

    public void Clear(By companentClear) {
        findElement(companentClear).clear();
    }

    public void selectAllClear(By clear) {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        findElement(clear).sendKeys(selectAll);
        findElement(clear).sendKeys(Keys.SPACE);
        //findElement(clear).sendKeys(Keys.DELETE);
        //findElement(clear).clear();
    }


    public void clickElement(WebElement webElement) {
        driver.get(webElement.getAttribute("href"));
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void sleep(int Second) {
        try {
            Thread.sleep(Second);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Sout(String sout) {
        System.out.println(sout);
    }

    public void ARROW_DOWN(By by) {
        driver.findElement(by).sendKeys(Keys.ARROW_DOWN);
    }
    public void ENTER(By by){
        driver.findElement(by).sendKeys(Keys.ENTER);
    }


}
