package com.bootstrap.common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bootstrap {
	// open browser navigate to goibibo.com
	// perform login

	/*
	 * Whenever we used Bootstrap concepts we have check 1st frame if frame is
	 * there used switchTo().frame()
	 *  Developer develop bootstrap only for two
	 * motive 1- SighIn 2-SighUp
	 */

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium webdriver\\Chromedriver\\chromedriver.exe");
		// Create obj of chrome driver
		driver = new ChromeDriver();
		// Url
		driver.get("https://www.goibibo.com/");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void operation() {
		// For SighIn
		driver.findElement(By.linkText("Sign In")).click();

		Sleeper.sleepTight(5);
		// For LogIn

		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Log In")).click();

		// For Usename
		driver.findElement(By.id("authUsername")).sendKeys("vishal");
		// For Password
		driver.findElement(By.id("authPassword")).sendKeys("123");

		// For SighIn

		driver.findElement(By.id("authExistingUserSignInBtn")).click();

	}

	@AfterTest

	public void tearDown() {
		driver.close();
	}

}
