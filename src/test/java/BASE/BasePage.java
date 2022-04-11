package BASE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

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

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void clickElement(WebElement webElement) {
        driver.get(webElement.getAttribute("href"));
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

}
