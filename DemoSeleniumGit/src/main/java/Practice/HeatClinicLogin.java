package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class HeatClinicLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver 85.0.4183.87\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.broadleafcommerce.org/");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//a[@href=\"/login\"]").click();
		
		driver.findElementByXPath("//input[@id=\"username\"]").sendKeys("wec070@msn.com");
		
		driver.findElementByXPath("(//input[@name=\"password\"])[1]").sendKeys("123456");
		
		driver.findElementByXPath("(//button[@class=\"btn btn-primary pull-right\"])[1]").click();
		
		
		driver.close();
		

	}

}
