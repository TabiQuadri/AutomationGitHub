package com.screenshots.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleScreenShots {
	// open browser navigate to google.com
	// take screenshort of google page

	WebDriver driver;

	@BeforeTest

	public void setUp() {
		//For Chrome driver
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium webdriver\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

	}

	@Test
	public void takeScreenshorts() throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Selenium screenshots\\google.png"));

	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
