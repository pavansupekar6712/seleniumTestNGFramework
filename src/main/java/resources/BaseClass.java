package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver;

	public static String EmailID = GenerateRandomEmailID();

	public Properties prop;

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

		prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

		else {
			System.out.println("Please choose the proper browser");
		}

	}

	public static String GenerateRandomEmailID() {
		return "test" + System.currentTimeMillis() + "@gmail.com";
	}

	@BeforeMethod
	public void browserAndurlLaunch() throws IOException {

		initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	// To take the screenshot and store in one folder-
	public static String screenShot(WebDriver driver, String filename) {
		String dateAndTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		// 20240517100712

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateAndTime + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}

	@BeforeSuite
	public void ExtentReport() {
		extentReportManager.setup();
	}

	@AfterSuite
	public void endReport() {
		extentReportManager.endReport();
	}

}
