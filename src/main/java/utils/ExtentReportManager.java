package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//this is comment to check the change in the QA branch
public class ExtentReportManager {
	
	private static ExtentReports extent;  //template
    private static ExtentTest test;    //fills the information about tests
    private static ExtentSparkReporter sparkReporter; //write the report
    
    public static ExtentReports getExtentReport() {
        
        	
        	extent = new ExtentReports();
            String reportPath = "D:\\Java-2025\\POMlessons\\Reports\\report.html";

            sparkReporter = new ExtentSparkReporter(reportPath);
            
            extent.attachReporter(sparkReporter);
        
        return extent;
    }
    
    public static ExtentTest startTest(String testName) {
       test= extent.createTest(testName);
       return test;
    }
    
    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }

}
}
