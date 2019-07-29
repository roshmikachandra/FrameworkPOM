package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.facebook.utils.BrowserFactory;
import com.facebook.utils.ConfigFile;
import com.facebook.utils.ExcelDataProvider;

public class BaseClass {
	
	public WebDriver driver;
	public ConfigFile config;
	public ExcelDataProvider excel;
	
	@BeforeSuite
	public void setUpSuite() {
		config= new ConfigFile();
		excel= new ExcelDataProvider();
	}
	
	//we will take the browser name and page url from the properties file. Nothing to be hard
	//coded in the script
	@BeforeClass
	public void setUp() {
		driver= BrowserFactory.startBrowser(driver, config.getBrowser(), config.getQAurl());
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.endBrowser(driver);
	}

}
