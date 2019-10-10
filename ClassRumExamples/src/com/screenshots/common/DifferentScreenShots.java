package com.screenshots.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentScreenShots {
	// Open Browser Navigate to google.com
	// take  google and gmail screenshots

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium webdriver\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

	}

	@Test
	public void multScreen() throws IOException {
		File img1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img1, new File("F:\\Selenium screenshots\\google.png"));

		Sleeper.sleepTight(5);

		driver.findElement(By.linkText("Gmail")).click();

		File img2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img2, new File("F:\\Selenium screenshots\\gmail.png"));

	}

	@AfterTest
	public void tearDown() {
		Sleeper.sleepTight(5);
		driver.close();
	}

}
