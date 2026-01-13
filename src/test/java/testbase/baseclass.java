package testbase;

//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.time.Duration;
//import java.util.Date;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.google.common.io.Files;
//
//public class baseclass {
//	public static WebDriver driver;
//	public WebDriverWait wait;
//	JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
//	
//	public baseclass(WebDriver driver) {
//		this.driver = driver;
//		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		this.jsExecuter = (JavascriptExecutor) driver; // Initialize AFTER driver is set
//		PageFactory.initElements(driver, this);
//	}
//	
//
//	 public String captureScreen(String tname) {
//		    if (driver == null) {
//		        System.out.println("Error: WebDriver is null. Cannot take screenshot.");
//		        return null; // Prevents NullPointerException
//		    }
//
//		    try {
//		        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//		        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//
//		        // Ensure the screenshot directory exists
//		        String screenshotDir = System.getProperty("user.dir") + "/screenshots/";
//		        File directory = new File(screenshotDir);
//		        if (!directory.exists()) {
//		            directory.mkdirs(); // Create the directory if it doesn't exist
//		        }
//
//		        // Save screenshot
//		        String targetFilePath = screenshotDir + tname + "_" + timeStamp + ".png";
//		        File targetFile = new File(targetFilePath);
//		        Files.copy(sourceFile, targetFile); // Use Guava to copy the file
//
//		        return targetFilePath; // Return the valid file path
//
//		    } catch (Exception e) {
//		        System.out.println("Error capturing screenshot: " + e.getMessage());
//		        return null;
//		    }
//		}
//		
//		
//		  public static WebDriver getDriver() {
//			    if (driver == null) {
//			        System.out.println("Warning: WebDriver is null.");
//			    }
//			    return driver;
//			}
//
//
//}



import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class baseclass {
    public static WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor jsExecuter;

    public baseclass(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecuter = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    public String captureScreen(String tname) {
        if (driver == null) {
            System.out.println("Error: WebDriver is null. Cannot take screenshot.");
            return null;
        }

        try {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

            String screenshotDir = System.getProperty("user.dir") + "/screenshots/";
            File directory = new File(screenshotDir);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            String targetFilePath = screenshotDir + tname + "_" + timeStamp + ".png";
            File targetFile = new File(targetFilePath);
            Files.copy(sourceFile, targetFile);

            return targetFilePath;

        } catch (Exception e) {
            System.out.println("Error capturing screenshot: " + e.getMessage());
            return null;
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.out.println("Warning: WebDriver is null.");
        }
        return driver;
    }

    public void jsClick(WebElement element) {
        jsExecuter.executeScript("arguments[0].click();", element);
    }

    public void scrollIntoView(WebElement element) {
        jsExecuter.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
    }
}

