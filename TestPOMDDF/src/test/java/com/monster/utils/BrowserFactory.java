package com.monster.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	//create a method to start the browser
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(WebDriver driver, String browserName, String url) {
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/roshmikachandra/Documents/chromeDriver/chromedriver");
			driver= new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")) {
			driver= new FirefoxDriver();
			
		}
		else {
			System.out.println("We do not support the browser");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
	
	//method to destroy the browser
	
	public static void endBrowser(WebDriver driver) {
	
		driver.quit();
	}
	
	

}
