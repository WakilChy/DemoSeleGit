package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlart {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver 85.0.4183.87\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");				
		driver.manage().window().maximize();
		
		
		//Switch to Frame
		driver.switchTo().frame("iframeResult");
		//Click
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		//alert.getText();
		Thread.sleep(2000);
		
		
		alert.sendKeys("Bangladesh");		
		//alert.accept();
		driver.switchTo().alert().accept();
		
		
		
		//print the message
		//System.out.println(driver.findElement(By.id("demo")).getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.close();
		

	}

}
