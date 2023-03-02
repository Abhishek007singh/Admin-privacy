package chebeloproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skype1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/");
		driver.findElement(By.id("i0116")).sendKeys("abhishek.singh3@mail.vinove.com");
		driver.findElement(By.id("idSIButton9")).submit();
		driver.findElement(By.id("i0118")).sendKeys("Abhishek@321");
		driver.findElement(By.id("idSIButton9")).submit();
		// TODO Auto-generated method stub

	}

}
