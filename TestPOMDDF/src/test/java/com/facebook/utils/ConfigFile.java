package com.facebook.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigFile {
	
	//create a method to read the config file
	
		Properties pro;
	
		public ConfigFile() {
			
				try {
					File src= new File("./config/Config.properties");
					FileInputStream fis=new FileInputStream(src);
					pro= new Properties();
					pro.load(fis);
				} 
				
				catch (Exception e) 
				{
					System.out.println("Cannot read config file"+ e.getMessage());
				}
				
			
		
	}
		//get browser name
		
		public String getBrowser()
		{
			return pro.getProperty("Browser");
		}
		
		//get url name
		
		public String getQAurl()
		
		{
			return pro.getProperty("QaUrl");
		}

}
