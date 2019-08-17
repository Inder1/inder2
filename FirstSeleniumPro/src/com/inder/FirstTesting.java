package com.inder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTesting {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("http://www.javatpoint.com/"); 
		
		driver.manage().window().maximize(); 
		
	}

}
