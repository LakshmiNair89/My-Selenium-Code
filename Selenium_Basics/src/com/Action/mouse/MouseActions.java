package com.Action.mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.myntra.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);


Actions action = new Actions(driver);
WebElement menstab = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
action.moveToElement(menstab).perform();
WebElement bags = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[14]/a"));
action.moveToElement(bags).click().build().perform();

WebElement bag1 =driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img"));
action.moveToElement(bag1).perform();
driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/div[4]/span[1]")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[2]/section/ul/li[1]/div[5]/div[2]/button")).click();
driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[2]/span[3]")).click();
WebElement remove = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[4]/div/div/div/div/div[3]/div[1]/button"));
action.moveToElement(remove).click().build().perform();

driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[4]/div/div/div/div/div[4]/div/div/div[2]/div/div[2]/button")).click();





	}

}
