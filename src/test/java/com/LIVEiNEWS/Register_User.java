package com.LIVEiNEWS;

import com.LIVEiNEWS.TestResources.DataClass;
import com.LIVEiNEWS.TestResources.PageResources;
import junit.framework.Test;;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class Register_User {
    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://liveinews.com/");
        Thread.sleep(3000);
        //new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.id("log")));
    }

    @org.testng.annotations.Test(priority = 1)
    public void registerAsUser() throws InterruptedException {
        PageResources pages = new PageResources(driver);
        DataClass data = new DataClass();

        Thread.sleep(3000);
        pages.getHomePage().clkLoginSignUp();
        Thread.sleep(4000);
        pages.getRegisterPage().selectUserAcctType();
        pages.getRegisterPage().setEmail(data.randomemail);
        String email = data.randomemail;
        System.out.println("Email: " + email);
        pages.getRegisterPage().setPwd(data.pwd);
        pages.getRegisterPage().setCPwd(data.pwd);
        pages.getRegisterPage().setUsrName(data.randomusername);
        String username = data.randomusername;
        System.out.println("Username: " + username);
        pages.getRegisterPage().clkNext();
        pages.getRegisterPage().chkAcceptTerms();
        pages.getRegisterPage().clkBtnNext();
        pages.getRegisterPage().clkBtnSubmit();
    }


}