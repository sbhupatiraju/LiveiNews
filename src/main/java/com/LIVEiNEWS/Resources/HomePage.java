package com.LIVEiNEWS.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by soumya on 5/3/17.
 */
public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id='menu-item-1716']/a")
    WebElement loginSignUp;
    public void clkLoginSignUp() throws InterruptedException {
        loginSignUp.click();
        Thread.sleep(3000);
    }
}
