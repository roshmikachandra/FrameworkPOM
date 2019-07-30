package com.monster.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver ldriver) {
		this.driver= ldriver;
		
	}
	
	//locators for web elements
	
	@FindBy(xpath="//*[@id=\"hired\"]/body/header/nav[1]/div/div[2]/ul/li[4]/a")
	WebElement logIn;
	
	@FindBy(xpath="//*[@id=\"user_email\"]")
	WebElement uidName;
	
	
	
	@FindBy (xpath= "//*[@id=\"user_password\"]")
	WebElement passWord;
	
	@FindBy (xpath="//*[@id=\"sign_in\"]")
	WebElement logInBtn;
	
	
	//methods for login page
	
	public void login_hired(String uid, String pswd) {
		logIn.click();
		uidName.sendKeys(uid);
		passWord.sendKeys(pswd);
		logInBtn.click();
	}

}
