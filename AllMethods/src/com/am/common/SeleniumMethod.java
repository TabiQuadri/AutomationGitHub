package com.am.common;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class SeleniumMethod {

	public static void main(String[] args) throws InterruptedException {

		// For Chrome driver

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium webdriver\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// 1. or
		//driver.get("https://www.google.com/"); // To connect with url
		//driver.get("http://www.facebook.com/");
		//driver.navigate().to("http://www.flipkart.com/");
		// 2. // driver.navigate().to("https://www.amazon.in/");// To connect
		// with url

		// 3. //String amazon= driver.getTitle(); //get title of current page
		// System.out.println(amazon);
		//String amazon=driver.getTitle();
		//System.out.println(amazon);

		// 4.
		// String url=driver.getCurrentUrl(); // get current url of site
		// System.out.println("Site url" + url);
		

		// 5.
		// String pagesource= driver.getPageSource(); // To get page source of
		// currnet url or site
		// System.out.println(pagesource);

		// 6.
		// driver.findElement(By.linkText("Gmail")).click(); // To findout
		// element

		// 7.
	
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("No  of size:" + links.size());

		//for (int i = 0; i < links.size(); i++) {     //(intilization;condtional;Incremental)
			//String name = links.get(i).getText();		// To get text;
			//System.out.println("Name of The Links:" + name);
		//	}
		
		//8. 
		
	//String rani=driver.getWindowHandle(); // To get only  window id
	//System.out.println(rani);

		
		//9.
		//String parentId=driver.getWindowHandle(); // To get  only parent window id
		//System.out.println(parentId);
		
//10.

			//Set<String> ids=driver.getWindowHandles(); // to gets multiple windows
			//System.out.println(ids);

		//11.
		 //driver.close(); // To close only one  window which is open by selenium webdriver
		
		//12.
		// To close all windows  which is open by selenium webdriver 
		// while using driver.quit()  sometime it will show exception
		
	//	driver.quit();
		
		
	//13 SwitchTo()
		
		//driver.switchTo().frame(0);
		//driver.switchTo().alert();
		//driver.switchTo().window();
		
		//14
		// driver.manage().window().maximize();// to maximize window
		// driver.manage().window().fullscreen();// To maximize window
		
	}
	

}
