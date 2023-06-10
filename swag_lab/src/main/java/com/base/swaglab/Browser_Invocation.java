package com.base.swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser_Invocation {

	public static WebDriver driver;

	//	@BeforeSuite
	//	public void BS() {
	//		System.out.println("I Am Before Suite");	
	//	}
	//	@BeforeTest
	//	public void BT() {
	//		System.out.println("I Am Before Test");	
	//	}
	@BeforeClass
	public void BC() {
		System.out.println("I Am Before Class");

		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--start-maximized");
		driver= new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");




	}}
//	@BeforeMethod
//	public void BM() {
//		System.out.println("I Am Before Method");
//		
//	}
//	
//	@AfterMethod
//	public void AM() {
//		System.out.println("I Am After Method");	
//	}
//	@AfterClass
//	public void AC() {
//		System.out.println("I Am After Class");
//		
//	driver.get("https://newprinthub.in/home");
//			
//	}
//	@AfterTest
//	public void AT() {
//		System.out.println("I Am After Test");
//	}
//	@AfterSuite
//	public void AS() {
//		System.out.println("I Am After Suite");
//	}
//	
//}

