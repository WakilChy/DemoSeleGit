package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver 85.0.4183.87\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
	
		
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
	
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		
		
		Actions action1=new Actions(driver);
		
		action1.dragAndDrop(drag, drop).perform();
		
		
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		


	}

}
