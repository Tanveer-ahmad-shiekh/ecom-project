package com.ecom.project.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
   
	public static WebDriver driver;    // we dont know what browser we need to open
	public static FileInputStream fis;
	public static Properties prop;
	public static File file;
	public static String browser="";
	public static String url="";
	
	
	/** when we create object of a child class it automatically calls the 
	 *default constructor of parents class */
	
	 public SetUp()
	 {
		 System.out.println("Reading Config file , ");
		 
		 file=new File("./Config/config.properties");
		 try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 prop=new Properties();
		 try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// System.out.println(prop.getProperty("browser"));
		 
		 browser=prop.getProperty("browser");
		 url=prop.getProperty("url");
		 
	 }
	 
	 
	 //browser and url would have been intilized ;
	 
	 public static void intilization()
	 {
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			System.out.println("Edge is getting Opened");
		}
		else
		{
			System.out.println("Browser not found ");
		}
		
		driver.get(url);
	 }
	 
	 
	
	
	
}
