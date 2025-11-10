package base;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;
import utils.DriverManager;
import utils.ExtentReportManager;

public class BaseTest {
	
	protected WebDriver driver;	
	ExtentTest test;
	
	@BeforeTest
	public void Setup() throws IOException
	{
		System.out.println("Step1");
		//DriverManager dv=new DriverManager();
		//driver= dv.getDriver("chrome");
		//driver =DriverManager.getDriver("chrome");
		//ConfigReader configr=new ConfigReader();
		//configr.readConfig();
		ConfigReader.readConfig();
		driver=DriverManager.getDriver(ConfigReader.getpropertyvalue("browser"));
		
		//driver.get("https://www.saucedemo.com/");
		driver.get(ConfigReader.getpropertyvalue("url"));
		
	}
	
	@BeforeSuite
	public void startReport() 
	{
		ExtentReportManager.getExtentReport();
		
	}
	@AfterSuite
	public void endReport()
	{
		ExtentReportManager.flushReport();
	}
	
	@BeforeMethod
	public void createTest(Method method) 
	{
		test = ExtentReportManager.startTest(method.getName());
	}
	
	@AfterMethod
    public void tearDown(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.SUCCESS) 
        {
            
            test.log(Status.PASS, result.getName() + " is passed");
            
        }
		
        if (ITestResult.FAILURE == result.getStatus()) 
        {
            
            test.log(Status.FAIL, result.getName() + " is failed");
            
        }
    }
	

}
