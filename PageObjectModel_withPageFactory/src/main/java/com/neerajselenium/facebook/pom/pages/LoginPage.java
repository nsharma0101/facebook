package com.neerajselenium.facebook.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neerajselenium.facebook.pom.pages.session.LandingPage;

public class LoginPage {
	
WebDriver driver;

public LoginPage(WebDriver driver){
	
	this.driver = driver; 
}

@FindBy(xpath="//input[@id='email']")
public WebElement UserName;

@FindBy(xpath="//input[@id='pass']")
public WebElement Password;

@FindBy(xpath="//label[@id='loginbutton']")
public WebElement LoginButton;





public LandingPage gotoLandingPage(String userName, String passWord){
	UserName.sendKeys(userName);
	Password.sendKeys(passWord);
	LoginButton.click();
	LandingPage landingPage  = PageFactory.initElements(driver, LandingPage.class);
	return landingPage;
	
	
	
	
}


}
