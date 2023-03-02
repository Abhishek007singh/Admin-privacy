package org.testng.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public void f() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://edu-adminweb.adaptit.com/");
		
		driver.findElement(By.linkText("Privacy Policy & Terms of Service")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		

}
}