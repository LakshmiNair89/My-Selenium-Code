package com.Action.mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExampleTwo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String s = "hello";
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(s.toUpperCase());
		
		Actions action = new Actions(driver);
		action.doubleClick(email).perform();
		
		action.contextClick().perform();

	}

}
