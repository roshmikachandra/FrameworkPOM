package com.monster.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.monster.pages.BaseClass;
import com.monster.pages.LoginPage;
import com.monster.utils.BrowserFactory;

public class LoginTest extends BaseClass {
	
	@Test(dataProvider="invalidCred")
	public void checkValidLogin(String userName, String passWord) {
		
		
		
		//create a page object of the log in page using page factory
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		
		//call the method of the login page 
		
		loginPage.login_hired(userName, passWord);
		
		//validate results
		//Assert.assertEquals(actual, expected);
		
	}
		@DataProvider(name="invalidCred")
		public Object[][]inValidData() 
		{
			int rows= excel.getRowCount(0);
			Object[][] testData= new Object[rows][2];
			for(int i=0;i<rows;i++)
			{
				testData[i][0]= excel.getStringData(0, i, 0);
				testData[i][1]= excel.getStringData(0, i, 1);
				
			}
			return testData;
			
		}
	
	
	}
	
	


