package com.demouat.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	
	Properties prop;
	WebDriver driver;
	
	public BaseClass() throws IOException{
		
		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverPath"));
		
		prop = new Properties();
		FileInputStream ips = new FileInputStream(System.getProperty("user.dir")+"src/main/java/com/demoaut/qa/properties/config.properties");
		prop.load(ips);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			driver = new ChromeDriver();
		}
		else if(browserName.equals("ff")){
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("browser value not defined");
		}
		
		driver.get(prop.getProperty("url"));
		
	}
	


	
}
