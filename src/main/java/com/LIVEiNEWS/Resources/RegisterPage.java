package com.LIVEiNEWS.Resources;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Class to locate all elements in Register page and their respective actions
public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="i-e-type")
    WebElement accountTypeUser;

    public void selectUserAcctType(){
        Select dropdown = new Select(accountTypeUser);
        dropdown.selectByVisibleText("User");
    }

   /* public void selectEditorAcctType(){
        dropdown.selectByVisibleText("Editor");
    }

    public void selectMediaAcctType(){
        dropdown.selectByVisibleText("Media");
    }

    public void selectCJAcctType(){
        dropdown.selectByVisibleText("City Journalist");
    }
    */

    @FindBy(id="reg_email")
    WebElement email;
    public void setEmail(String uEmail){
        email.sendKeys(uEmail);
    }

    @FindBy(id="reg_password")
    WebElement password;
    public void setPwd(String uPwd){
        password.sendKeys(uPwd);
    }

    @FindBy(id="creg_password")
    WebElement cPwd;
    public void setCPwd(String uCPwd){
        cPwd.sendKeys(uCPwd);
    }

    @FindBy(id="i-e-name")
    WebElement usrName;
    public void setUsrName(String userName){
        usrName.sendKeys(userName);
    }

    @FindBy(name = "register")
    WebElement btnNext;
    public void clkNext(){
        btnNext.click();
    }

    //For registering with Editor account
    @FindBy(id="i-e-first")
    WebElement firstName;
    public void setFirstName(String uFirstName){
        firstName.sendKeys(uFirstName);
    }

    @FindBy(id="i-e-last")
    WebElement lastName;
    public void setLastName(String uLastName) {
        lastName.sendKeys(uLastName);
    }

    @FindBy(id="i-e-address")
    WebElement address;
    public void setAddress(String uAddress){
        address.sendKeys(uAddress);
    }

    @FindBy(id="i-e-phone")
    WebElement phone;
    public void setPhone(String uPhone){
        phone.sendKeys(uPhone);
    }

    @FindBy(id="i-e-zip")
    WebElement zipCode;
    public void setZipCode(int uZip){
        zipCode.sendKeys(String.valueOf(uZip));
    }

    @FindBy(id="countryId")
    WebElement country;
    public void setCountry(int index){
        Select c = new Select(country);
        c.selectByIndex(index);
    }

    //For Registering with Media account
    @FindBy(id="i-e-company")
    WebElement companyName;
    public void setCompanyName(String uCompanyName){
        companyName.sendKeys(uCompanyName);
    }

    @FindBy(id="i-e-ein")
    WebElement ein;
    public void setEIN(String uEIN){
        ein.sendKeys(uEIN);
    }

    @FindBy(id="i-e-contact")
    WebElement contact;
    public void setContact(String uContact){
        contact.sendKeys(uContact);
    }

    @FindBy(id="i-e-mlc")
    WebElement mlc;
    public void setMLC(String uMLC){
        mlc.sendKeys(uMLC);
    }

    @FindBy(id="i-e-paypal")
    WebElement paypalAcct;
    public void setPaypalAcct(String uPaypalAcct){
        paypalAcct.sendKeys(uPaypalAcct);
    }

    @FindBy(xpath = "//*[@id='acceptterms']")
    WebElement acceptTerms;
    public void chkAcceptTerms(){
        acceptTerms.click();
    }

    @FindBy(xpath = "//*[@id='terms-modal']/div/p[2]/span")
    WebElement next;
    public void clkBtnNext(){
        next.click();
    }

    @FindBy(xpath = "//*[@id='registration-form']/p[2]/input")
    WebElement btnSubmit;
    public void clkBtnSubmit(){
        btnSubmit.click();
    }
}
