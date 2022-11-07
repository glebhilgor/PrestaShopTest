package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddressPage extends BasePage {

    public static final By FIRST_NAME = By.id("firstname");
    public static final By LAST_NAME = By.id("lastname");
    public static final By COMPANY_NAME = By.id("company");
    public static final By VAT_NUMBER = By.id("vat-number");
    public static final By ADDRESS = By.id("address1");
    public static final By ADDRESS_LINE_2 = By.id("address2");
    public static final By ZIP_POSTAL_CODE = By.id("postcode");
    public static final By CITY = By.id("city");
    public static final By HOME_PHONE = By.id("phone");
    public static final By MOBILE_PHONE = By.id("phone_mobile");
    public static final By STATE = By.id("id_state");
    public static final By ADDITIONAL_INFORMATION = By.id("other");
    public static final By SUBMIT_BUTTON = By.id("submitAddress");
    public static final By ASSIGN_AN_ADDRESS = By.id("alias");
    public static final By UPDATE_ADDRESS = By.xpath("//*[@title='Delete']");
    public static final By ERROR1 = By.xpath("//li[text()=' is invalid.']");
    public static final By ERROR2 = By.xpath("//li[text()=' is required.']");
    public static final By ERROR3 = By.xpath("//li[text()=' is invalid.']");


    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public String title() {return driver.getTitle();}
    public String getErrorFirstName() { return driver.findElement(ERROR1).getText(); }
    public String getErrorLastName() { return driver.findElement(ERROR2).getText(); }
    public String getError3() { return driver.findElement(ERROR3).getText(); }



    public void validfields() {
        driver.findElement(FIRST_NAME).sendKeys("Gleb");
        driver.findElement(LAST_NAME).sendKeys("Hilgor");
        driver.findElement(COMPANY_NAME).sendKeys("Transcond");
        driver.findElement(VAT_NUMBER).sendKeys("23232");
        driver.findElement(ADDRESS).sendKeys("Nemiga 1");
        driver.findElement(ADDRESS_LINE_2).sendKeys("Nemiga 2");
        driver.findElement(ZIP_POSTAL_CODE).sendKeys("22000");
        driver.findElement(CITY).sendKeys("Minsk");
        driver.findElement(HOME_PHONE).sendKeys("+375171111111");
        driver.findElement(MOBILE_PHONE).sendKeys("+375292222222");
        WebElement dropdown = driver.findElement(STATE);
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Florida");
        driver.findElement(ADDITIONAL_INFORMATION).sendKeys("Test");
        driver.findElement(ASSIGN_AN_ADDRESS).sendKeys("Nemiga 2");
        driver.findElement(SUBMIT_BUTTON).click();
        driver.findElement(UPDATE_ADDRESS).click();
        driver.switchTo().alert().accept();
    }
    public void inValidName() {
        driver.findElement(FIRST_NAME).sendKeys("1234");
        driver.findElement(LAST_NAME).sendKeys("Hilgor");
        driver.findElement(COMPANY_NAME).sendKeys("Transcond");
        driver.findElement(VAT_NUMBER).sendKeys("23232");
        driver.findElement(ADDRESS).sendKeys("Nemiga 1");
        driver.findElement(ADDRESS_LINE_2).sendKeys("Nemiga 2");
        driver.findElement(ZIP_POSTAL_CODE).sendKeys("22000");
        driver.findElement(CITY).sendKeys("Minsk");
        driver.findElement(HOME_PHONE).sendKeys("+375171111111");
        driver.findElement(MOBILE_PHONE).sendKeys("+375292222222");
        WebElement dropdown = driver.findElement(STATE);
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Florida");
        driver.findElement(ADDITIONAL_INFORMATION).sendKeys("Test");
        driver.findElement(ASSIGN_AN_ADDRESS).sendKeys("Nemiga 2");
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public void inValidLastName() {
        driver.findElement(FIRST_NAME).sendKeys("Gleb");
        driver.findElement(LAST_NAME).sendKeys("");
        driver.findElement(COMPANY_NAME).sendKeys("Transcond");
        driver.findElement(VAT_NUMBER).sendKeys("23232");
        driver.findElement(ADDRESS).sendKeys("Nemiga 1");
        driver.findElement(ADDRESS_LINE_2).sendKeys("Nemiga 2");
        driver.findElement(ZIP_POSTAL_CODE).sendKeys("22000");
        driver.findElement(CITY).sendKeys("Minsk");
        driver.findElement(HOME_PHONE).sendKeys("+375171111111");
        driver.findElement(MOBILE_PHONE).sendKeys("+375292222222");
        WebElement dropdown = driver.findElement(STATE);
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Florida");
        driver.findElement(ADDITIONAL_INFORMATION).sendKeys("Test");
        driver.findElement(ASSIGN_AN_ADDRESS).sendKeys("Nemiga 2");
        driver.findElement(SUBMIT_BUTTON).click();
    }
    public void LastNameIs1234() {
        driver.findElement(FIRST_NAME).sendKeys("Gleb");
        driver.findElement(LAST_NAME).sendKeys("1234");
        driver.findElement(COMPANY_NAME).sendKeys("Transcond");
        driver.findElement(VAT_NUMBER).sendKeys("23232");
        driver.findElement(ADDRESS).sendKeys("Nemiga 1");
        driver.findElement(ADDRESS_LINE_2).sendKeys("Nemiga 2");
        driver.findElement(ZIP_POSTAL_CODE).sendKeys("22000");
        driver.findElement(CITY).sendKeys("Minsk");
        driver.findElement(HOME_PHONE).sendKeys("+375171111111");
        driver.findElement(MOBILE_PHONE).sendKeys("+375292222222");
        WebElement dropdown = driver.findElement(STATE);
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Florida");
        driver.findElement(ADDITIONAL_INFORMATION).sendKeys("Test");
        driver.findElement(ASSIGN_AN_ADDRESS).sendKeys("Nemiga 2");
        driver.findElement(SUBMIT_BUTTON).click();
    }
}
