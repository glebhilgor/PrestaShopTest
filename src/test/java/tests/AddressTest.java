package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AddressTest extends BaseTest {

    @Test
    public void validFields() {
        loginPage.open();
        loginPage.login("glebh@gmail.com","12345");
        accountPage.slideToAddressPage();
        addressPage.validfields();
        assertEquals(addressPage.title(),"Адреса - http://prestashop.qatestlab.com.ua/");
    }

    @Test
    public void firstNameIsInvalid() {
        loginPage.open();
        loginPage.login("glebh@gmail.com","12345");
        accountPage.slideToAddressPage();
        addressPage.inValidName();
        assertEquals(addressPage.getErrorFirstName(),"firstname is invalid.");
    }
    @Test
    public void lastNameIsRequired() {
        loginPage.open();
        loginPage.login("glebh@gmail.com","12345");
        accountPage.slideToAddressPage();
        addressPage.inValidLastName();
        assertEquals(addressPage.getErrorLastName(),"lastname is required.");
    }
    @Test
    public void lastNameIsInvalid() {
        loginPage.open();
        loginPage.login("glebh@gmail.com","12345");
        accountPage.slideToAddressPage();
        addressPage.LastNameIs1234();
        assertEquals(addressPage.getError3(),"lastname is invalid.");

    }

}


