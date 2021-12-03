package Resources;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports {
	
	//extent the reports 
			static ExtentReports extent;

		    public static ExtentReports initiate() {
				String path= System.getProperty("user.dir")+"\\Reports\\index.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			    reporter.config().setDocumentTitle("Project team");
				reporter.config().setReportName("Automation Result");
			
				
			     extent = new ExtentReports();
				// extent.attachReporter(reporter);
				//extent.setSystemInfo("Tester","Surya");
				return extent;
		 }

		
}
