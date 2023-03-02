package chebeloproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin2 {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://edu-adminweb.adaptit.com/");
		
		driver.findElement(By.linkText("Privacy Policy & Terms of Service")).click();
		
		
		
		
		

		
		
	
		
		// TODO Auto-generated method stub

	}

}
