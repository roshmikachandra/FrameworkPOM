package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver ldriver) {
		this.driver= ldriver;
		
	}
	
	//locators for web elements
	
	@FindBy(id="email") 
	WebElement userName;
	
	@FindBy (id="pass")
	WebElement passWord;
	
	@FindBy (id="u_0_a")
	WebElement logInBtn;
	
	
	//methods for login page
	
	public void login_FB(String uid, String pswd) {
		userName.sendKeys(uid);
		passWord.sendKeys(pswd);
		logInBtn.click();
	}

}
