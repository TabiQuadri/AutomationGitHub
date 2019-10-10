package com.am.common;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	
	// Open browser navigate to world  worst  website
	//  click on The international i hate  frames club  
	//count no links and get text
	// close child window

	public static void main(String[] args) throws InterruptedException {
		// For Chrome driver

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium webdriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(1);
		driver.findElement(By.linkText("The International I Hate Frames Club")).click();

		// String parentId=driver.getWindowHandle();
		// System.out.println(parentId);

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		String parentId = it.next();
		System.out.println("ParentId::" + parentId);

		String childId = it.next();
		System.out.println("ChildId::" + childId);
		// Switch to child window
		driver.switchTo().window(childId);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No of Links: "+ links.size());
		
		for(int i=0;i<links.size();i++)
		{
		String lname=links.get(i).getText();
		System.out.println("Name of links are:" + lname);
		}
		
		
		
		// curser present on child window
		// it will only close child window
		driver.close();

		// Wait for 7 second
		Thread.sleep(7000);

		// Switch to parent window

		driver.switchTo().window(parentId);

		// Then it will close parent window
		driver.close();

	}

}
