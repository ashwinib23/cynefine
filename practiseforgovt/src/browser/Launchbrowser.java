package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		//---------------------------------------------------------------------
//		ChromeOptions options= new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver =new ChromeDriver(options);
		WebDriver driver =new ChromeDriver();
		
		//---------------------------------------------------------------------
		//WebDriver driver =new FirefoxDriver();

		//--------------------------------------------------------------------------
		driver.get("https://www.amazon.com/"); 

	}

}
