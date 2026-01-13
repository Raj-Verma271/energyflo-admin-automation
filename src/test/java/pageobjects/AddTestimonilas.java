package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.baseclass;

public class AddTestimonilas extends baseclass {

	public AddTestimonilas(WebDriver driver) {
		super(driver);
		
	}
	 @FindBy(xpath = "//input[@placeholder='Email']")
	    WebElement Email;

	    @FindBy(xpath = "//input[@placeholder='Password']")
	    WebElement Password;

	    @FindBy(xpath = "//button[normalize-space()='Login']")
	    WebElement LogIn;
	
	@FindBy(xpath="//span[normalize-space()='CMS']") WebElement CMS;
	@FindBy(xpath="//a[normalize-space()='Testimonials']")WebElement Testimonials;
	@FindBy(xpath="//a[normalize-space()='Add New Testimonials']")WebElement AddTestimonilasButton;
	@FindBy(xpath="//input[@name='name']")WebElement Name;
	@FindBy(xpath="//input[@name='position']")WebElement Position;
	@FindBy(xpath="//textarea[@name='message']")WebElement Message;
	@FindBy(xpath="//input[@name='photo']")WebElement Photo;
	
	 public void setupEmail(String email) {
	        Email.clear();
	        Email.sendKeys(email);
	    }

	    public void setPassword(String password) {
	        Password.clear();
	        Password.sendKeys(password);
	    }

	    public void clicklogin() {
	        LogIn.click();
	    }
	
	public void ClickCMS() {
		CMS.click();
	}
	public void ClickTestimonials() {
		Testimonials.click();
	}
	
	public void clickButton() {
		AddTestimonilasButton.click();
	}
	public void setName(String name) {
		Name.sendKeys(name);
	}
	public void setPosition(String position) {
		Position.sendKeys(position);
	}
	public void setmessage(String message) {
		Message.sendKeys(message);
	}
	public void uploadphoto() {
		String File="C://Users//RAJEEV VERMA//Downloads//images (7).jpg";
		Photo.sendKeys(File);
		
	}


}
