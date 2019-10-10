package com.alerts.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {

	WebDriver driver;

	@BeforeTest

	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium webdriver\\Chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test

	public void getTextOnAlert() {

		driver.findElement(By.xpath("//input[@title='Sign in']")).click();

		String text = driver.switchTo().alert().getText();
		System.out.println(text);

		driver.switchTo().alert().accept();

	}

	@AfterTest

	public void tearDown() {
		driver.close();
	}

}
