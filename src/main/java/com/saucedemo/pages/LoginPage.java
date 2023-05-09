package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {
  //  By userName = By.id("user-name");
    @CacheLookup
    @FindBy(id= "user-name")
    WebElement userName;
   // By password = By.id("password");
    @CacheLookup
    @FindBy(id = "password")
   WebElement password;
   // By clickOnLogin = By.id("login-button");
    @CacheLookup
    @FindBy(id = "login-button")
    WebElement clickOnLogin;

    public void sendTextToUserNameField() {
        CustomListeners.test.log(Status.PASS,"Enter Username" );
        sendTextToElement(userName, "standard_user");
        Reporter.log("Entetr Username" + userName.toString());

    }

    public void sendTextToPasswordField() {
        CustomListeners.test.log(Status.PASS,"Enter Password");
        sendTextToElement(password, "secret_sauce");
        Reporter.log("Enter Password" + password.toString());
    }

    public void clickOnLoginButton() {
        CustomListeners.test.log(Status.PASS,"Click On Login Button");
        clickOnElement(clickOnLogin);
        Reporter.log("Click On Login Button" + clickOnLogin);
    }
}
