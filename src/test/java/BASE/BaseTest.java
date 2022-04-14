package BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    static WebDriver driver;

    @BeforeTest
    public void setUp() {
        try {
            ChromeOptions options = new ChromeOptions();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SedatCan\\Page\\driver\\chromedriver.exe");
            driver = new ChromeDriver(options);
            driver.get("https://demoqa.com/automation-practice-form");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            System.out.println("Driver Başlatıldı");
        } catch (Exception ex) {

            ex.getMessage();
            ex.printStackTrace();
            System.out.println("Driver Başlatılamadı");

        }

    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        System.out.println("driver kapatıldı.");
    }
}
