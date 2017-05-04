package com.LIVEiNEWS.TestResources;

import com.LIVEiNEWS.Resources.HomePage;
import com.LIVEiNEWS.Resources.RegisterPage;
import org.apache.regexp.RE;
import org.openqa.selenium.WebDriver;

/**
 * Created by soumya on 5/3/17.
 */
public class PageResources {

    WebDriver driver;

    HomePage homePage;
    public HomePage getHomePage() {
        return homePage;
    }

    RegisterPage registerPage;
    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public PageResources(WebDriver driver){
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);

    }
}
