package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.core.Driver;





public class LoginPage extends Driver {

    PageObjects loginPage;

    String userName = "";
    String passWord = "";

    public LoginPage() {
        super();
        loginPage = new PageObjects();
        PageFactory.initElements(driver, loginPage);
    }

  /*  public boolean validateLoginpage(){
        boolean elements = false;
        if(loginPage.userNameFld.isDisplayed()){
            if(loginPage.passwordField.isDisplayed()){
                if(loginPage.checkBox.isDisplayed()){
                    if(loginPage.loginBtn.isDisplayed()){
                        elements = true;
                    }
                }
            }
        }
        else{
            elements = false;
        }
        return elements;*/


    }

   /* public boolean testLoginWithoutCredentials() {
        boolean loginStatus = false;
        loginPage.loginBtn.click();
        if (loginPage.inputError.getText().equalsIgnoreCase("Username is mandatory")) {
            loginStatus = true;
        }
        loginPage.userNameFld.sendKeys(userName);
        loginPage.loginBtn.click();
        if (loginPage.inputError.getText().equalsIgnoreCase("Password is mandatory")) {
            loginStatus = true;
        }
        return loginStatus;

    }*/



    class PageObjects {

        @CacheLookup
        @FindBy(id = "com.jll.activitiesapp.uat:id/loginField")
        public WebElement userNameFld;

        @CacheLookup
        @FindBy(id = "com.jll.activitiesapp.uat:id/passwordField")
        public WebElement passwordField;

        @CacheLookup
        @FindBy(id = "com.jll.activitiesapp.uat:id/loginButton")
        public WebElement loginBtn;

        
    }

