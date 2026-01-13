package testcases;

import org.testng.annotations.Test;

import pageobjects.AddTestimonilas;
import utilities.Dataprovider;

public class Testimonialstestcases extends setupmentod{
	@Test(priority=1,dataProvider="LoginData",dataProviderClass = Dataprovider.class)
	public void SetTestimonialsDetails(String Email, String Password, String Name, String Position, String message) throws InterruptedException {
		AddTestimonilas at=new AddTestimonilas(driver);
		at.setupEmail(Email);
		at.setPassword(Password);
		at.clicklogin();
		Thread.sleep(2000);
		at.ClickCMS();
		
		at.ClickTestimonials();
		Thread.sleep(2000);
		at.clickButton();
		Thread.sleep(2000);
		at.setName(Name);
		at.setPosition(Position);
		at.setmessage(message);
		at.uploadphoto();
	}

}
