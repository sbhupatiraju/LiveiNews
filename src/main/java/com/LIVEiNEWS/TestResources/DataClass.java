package com.LIVEiNEWS.TestResources;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by soumya on 5/4/17.
 */
public class DataClass {

    public String randomfirstname = RandomStringUtils.randomAlphabetic(7).toLowerCase();
    public String randomlastname = RandomStringUtils.randomAlphabetic(7).toLowerCase();
    public String randomusername = RandomStringUtils.randomAlphanumeric(10).toLowerCase();
    public String randomemail = randomusername + "@getnada.com";

    public String pwd = "letmein";
    public String address = "123 abc";
    public String phone = "111-111-111";
    public int zipcode = 87689;
    public String companyname = "abcdef";
    public String ein = "12-1234567";
    public String contact = "adcb";
    public String mainlegalcontact = "xyz123";
    // data for paypal account??

}
