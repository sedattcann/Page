package LOCATORS;

import org.openqa.selenium.By;

public class Locators {
    public static final By name =By.id("firstName");
    public static final By lastName=By.id("lastName");
    public static final By email=By.id("userEmail");
    public static final By gender=By.xpath("//div[@id='genterWrapper']/div[2]/div/label");
    public static final By mobile=By.id("userNumber");
    public static final By birtDay=By.id("dateOfBirthInput");
    public static final By birtDayXPath=By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[1]/div/input");
    public static final By subjects=By.xpath("//*[@id=\"subjectsInput\"]");
    public static final By checkbox=By.cssSelector("div.custom-control.custom-checkbox.custom-control-inline");
    public static final By currentAddress=By.id("currentAddress");
    public static final By stateDownArrow=By.xpath("//input[@id='react-select-3-input']");

}
