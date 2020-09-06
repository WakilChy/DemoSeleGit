package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver 85.0.4183.87\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		

	
		
		
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		
		
		
		driver.findElementByXPath("//input[@value=\"John\"]").clear();
		driver.findElementByXPath("//input[@value=\"John\"]").sendKeys("Tasnim");
		
		
		
	

	}

}
