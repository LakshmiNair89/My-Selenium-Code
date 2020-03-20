package WindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupsWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com/goodpopups.html");
		
//3rd link -- new window pop up
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Set <String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parent = it.next();
		String child = it.next();
		System.out.println(parent + " "+ child);
		driver.switchTo().window(child);
		System.out.println("child window " +driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("parent window  "+driver.getCurrentUrl());
		
//2nd link -- handling tab
driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[2]")).click();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		System.out.println("parent window  "+driver.getCurrentUrl());
		driver.switchTo().window(tabs.get(1));
		System.out.println("child window " +driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(0));
		
		
	}

}
