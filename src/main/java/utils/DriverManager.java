package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	static WebDriver driver;
	
	public static WebDriver getDriver(String browser)
	{
		System.out.println("step2");
		switch (browser) {
			        
			            case "firefox":
			            	WebDriverManager.firefoxdriver().setup();
			                driver = new FirefoxDriver();
			                
			                break;
			            case "edge":
			            	WebDriverManager.edgedriver().setup();
			                driver = new EdgeDriver();
			                break;
			            case "chrome":
			            	WebDriverManager.chromedriver().setup();
			                driver = new ChromeDriver();
			                break;
			        }
		return driver;
	}
	

}
