package com.screenshots.common;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleScreenShots {
	//open browser navigate to google.com
	//take multiple screenshot

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium webdriver\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get("https://www.google.co.in/");

	}

	@Test
	public void multiScreenshots() throws IOException {

		// driver.findElement(By.linkText("No, thanks")).click();

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).isDisplayed()) {
				String lname = links.get(i).getText();
				links.get(i).click();

				File img1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(img1, new File("F:\\Selenium screenshots\\" + lname + ".png"));

				driver.navigate().back();

				links = driver.findElements(By.tagName("a"));

			}

		}
	}
		
		@AfterTest
		public void tearDown()
		{
			driver.close();
		}

	}

