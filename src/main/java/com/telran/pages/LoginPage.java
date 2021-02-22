package com.telran.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="userName")
    WebElement username;

//    @FindBy(how = How.XPATH,using = "//*[@atributte='user']")
//    WebElement name;
//    @FindBy(css = ".claass")
//    List<WebElement> list;

      @FindBy (id="password")
    WebElement pswd;
    @FindBy (id="login")
    WebElement loginBtn;


    public ProfilePage login(String userName, String paswd){
        type(username,userName);
        type(pswd,paswd);

        loginBtn.click();
        return new ProfilePage(driver);
    }
    public LoginPage loginNegative(String userName, String paswd){
        type(username,userName);
        type(pswd,paswd);
        loginBtn.click();
        return this;
    }
    public LoginPage typeUser(String user){
        type(username,user);
        return this;
    }
    public LoginPage typePass(String paswd){
        type(pswd,paswd);
        return this;
    }
    public ProfilePage clickLogin(){
        loginBtn.click();
        return new ProfilePage(driver);
    }


}
