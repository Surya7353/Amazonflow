package Testing;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageFile.Base;

public class Listeners extends Base implements ITestListener{
	//ExtentReports extent =ExtentReports.getExtentReport();
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		test.info("Test started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test passed succesfully");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Assert.fail("Test Failed");
	}
	

}
