package com.demouat.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseClass() throws IOException {
		
		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverPath"));					
	    driver = new ChromeDriver();					
	    String url = prop.getProperty("url");			
	    driver.manage().window().maximize();
	    
	    prop = new Properties();
	    File f = new File(System.getProperty("user.dir")+"src\\main\\java\\com\\demoaut\\qa\\properties\\config.properties");
	    FileInputStream fileInputStream = new FileInputStream(f);									
	    prop.load(fileInputStream);
		
		
	}

}
