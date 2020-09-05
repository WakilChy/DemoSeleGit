package demoPackageSEP1;


import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSEP1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver 85.0.4183.87\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Launch the browser 
		driver.get("http://www.leaftaps.com/opentaps/control/login");
		
		

	}

}
