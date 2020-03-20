package com.Action.mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement drag = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]"));
		WebElement drop = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
			

}
}
