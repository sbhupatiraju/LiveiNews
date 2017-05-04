package com.LIVEiNEWS.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by soumya on 5/3/17.
 */
public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//*[@id='menu-item-1716']/a")
    WebElement userNameOrEmail;
    public void setUserNameOrEmail(String uName){
        userNameOrEmail.sendKeys(uName);
    }

    @FindBy(name="pwd")
    WebElement password;
    public void setPassword(String uPwd){
        password.sendKeys(uPwd);
    }

    @FindBy(name="rememberme")
    WebElement chkboxRememberMe;
    public void chkRememberMe(){
        chkboxRememberMe.click();
    }

    @FindBy(name = "wp-submit")
    WebElement btnLogin;
    public void clkLogin(){
        btnLogin.click();
    }

    @FindBy(linkText = "Forgot your password?")
    WebElement forgotPwd;
    public void clkForgotPwd(){
        forgotPwd.click();
    }
}
