package genericUtility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener{
	ExtentReports reports;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.INFO, methodName+"execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+"execution pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriverUtility WUTIL=new WebDriverUtility();
		JavaUtiity JUTIL=new JavaUtiity();
		String methodName=result.getMethod().getMethodName()+JUTIL.getDateUsingCalendar();
		    //we can call direct by new javautility.getDateUsingCalendar
		test.log(Status.FAIL, methodName+"is failed");
		test.log(Status.FAIL,result.getThrowable());
		
		try {
		String path=WUTIL.screenShotCaptueMethod(BaseClass.driver, methodName);
		test.addScreenCaptureFromPath(path);
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+"is skipped");
		test.log(Status.SKIP, result.getThrowable());
		//this throwable will give you the exact status
		}

	@Override
	public void onStart(ITestContext context) {
		//Basic configurations
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\extentReport\\report-"+
		new JavaUtiity().getDateUsingCalendar()+".html");
		htmlReport.config().setDocumentTitle("V tiger report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("extent report");
		//gererate the report
		reports=new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("browser", "Chrome");
		reports.setSystemInfo("author name", "Assu");
		reports.setSystemInfo("platform", "windows");
		reports.setSystemInfo("url", "https://localhost:8888/");
		reports.setSystemInfo("enviorment name", "testing");
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}
	

}