package testcases;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class setupmentod {
	protected WebDriver driver;
	protected  WebDriverWait wait;
	
	@BeforeTest()
//	public void setup() {
//		driver=new ChromeDriver();
//		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.get("https://shootezy-dashboard.vercel.app/");
//		driver.manage().window().maximize();
	
	

	 
	    public void setup() {
//	        if (driver==null) {  // ✅ Prevent multiple browser openings
//	            System.out.println("DEBUG: Initializing WebDriver...");
//	            ChromeOptions options = new ChromeOptions();
//	            options.addArguments("disable-save-password-bubble");  // Disable the "Change Password" pop-up
//
//	            // Initialize WebDriver with ChromeOptions
//	            driver = new ChromeDriver(options);
////	            driver = new ChromeDriver();
//	            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	            driver.manage().window().maximize();
//	            driver.get("https://shootezy-dashboard.vercel.app/");
//	        } else {
//	            System.out.println("DEBUG: WebDriver already initialized.");
//	        }
		
		
	     // Setup ChromeOptions to disable password manager
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        // Optional: Use incognito to block all saved sessions
        options.addArguments("--incognito");

        // Optional: Disable extensions and infobars
        options.addArguments("--disable-extensions");
        options.addArguments("disable-infobars");

       //Above Code is to handle the Chrome Pop-up. 
        
		driver=new ChromeDriver(options);
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://energyflo-admin.vercel.app/");
		
	    }
	


	

}
