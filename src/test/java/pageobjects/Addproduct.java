//package pageobjects;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import testbase.baseclass;
//
//public class Addproduct extends baseclass{
//	
//	
//	public Addproduct(WebDriver driver) {
//		super(driver);
//	}
//	
//	//Login Details
//	@FindBy(xpath="//input[@placeholder='Email']")WebElement Email;
//	@FindBy(xpath="//input[@placeholder='Password']")WebElement Password;
//	@FindBy(xpath="//button[normalize-space()='Login']")WebElement LogIn;
//	
//	//
//	@FindBy(xpath="//span[normalize-space()='Catalogue']")WebElement catalogue;
//	@FindBy(xpath="//a[normalize-space()='Product']")WebElement Product;
//	@FindBy(xpath="//a[normalize-space()='Add Product']")WebElement AddProductButton;
//	
//	//Product Details
//	@FindBy(xpath="//input[@name='product_name']")WebElement ProductName;
//	@FindBy(xpath="//input[@name='volt_input']")WebElement Volt;
//	@FindBy(xpath="//button[normalize-space(text())='Add Volt']")WebElement AddVoltButton;
//	@FindBy(xpath="//input[@name='featured_image']")WebElement FeaturedImages;
//	@FindBy(xpath="//input[@name='sku']")WebElement SKU;
//	@FindBy(xpath="//input[@name='hsn_code']")WebElement HSNCode;
//	@FindBy(xpath="//body/div[@id='root']/div[@class='horizontalMenucontainer']/div[@class='page']/div[@class='page-main']/div[contains(@class,'main-content app-content')]/div[@class='side-app']/div[@class='main-container container-fluid']/div/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='card']/div[@class='add_new_product card-body']/form[@class='add_product_form']/div[5]/div[1]/div[1]/div[1]/div[1]")WebElement ClickCategory;
//	@FindBy(xpath="//div[contains(text(),'INVERTERS')]")WebElement CategoryOption;
//
//	
//	//Login Details
//	public void setupEmail(String email) {
//		Email.clear();
//		Email.sendKeys(email);
//	}
//	public void setPassword(String password) {
//		Password.clear();
//		Password.sendKeys(password);
//	}
//	public void clicklogin() {
//		LogIn.click();
//	}
//	
//	//
//	public void ClickCatalogue() {
//		wait.until(ExpectedConditions.elementToBeClickable(catalogue)).click();
//	}
//	public void clickProduct() {
//		Product.click();
//	}
//	public void clickAddProductButton() throws InterruptedException {
//		
//		wait.until(ExpectedConditions.elementToBeClickable(AddProductButton)).click();
//	}
//	
//	public void setProductName(String productname) {
//		ProductName.sendKeys(productname);
//	}
//	public void setVolt(String volt) {
//		Volt.sendKeys(volt);
//	}
//	public void clickAddVoltButton() {
//		
//		wait.until(ExpectedConditions.elementToBeClickable(AddVoltButton)).click();
//	}
//	public void uploadFeaturedImage() {
//		String file="C://Users//RAJEEV VERMA//OneDrive//Desktop//t3-lemania-tester-768x768.jpg";
//		FeaturedImages.sendKeys(file);
//	}
//	public void setSKU(String sku) {
//		SKU.sendKeys(sku);
//	}
//	public void setHSNCode(String hsncode) {
//		HSNCode.sendKeys(hsncode);
//	}
//	public void clickCategory() throws InterruptedException {
//		
//		ClickCategory.click();
//		CategoryOption.click();
//	}
//
//
//}
package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import testbase.baseclass;

public class Addproduct extends baseclass {

    public Addproduct(WebDriver driver) {
        super(driver);
    }

    // Login
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement Email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement Password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement LogIn;

    // Navigation
    @FindBy(xpath = "//span[normalize-space()='Catalogue']")
    WebElement catalogue;

    @FindBy(xpath = "//a[normalize-space()='Product']")
    WebElement Product;

    @FindBy(xpath = "//a[normalize-space()='Add Product']")
    WebElement AddProductButton;

    // Product Fields
    @FindBy(xpath = "//input[@name='product_name']")
    WebElement ProductName;

    @FindBy(xpath = "//input[@name='volt_input']")
    WebElement Volt;

    @FindBy(xpath = "//button[normalize-space(text())='Add Volt']")
    WebElement AddVoltButton;

    @FindBy(xpath = "//input[@name='featured_image']")
    WebElement FeaturedImages;

    @FindBy(xpath = "//input[@name='sku']")
    WebElement SKU;

    @FindBy(xpath = "//input[@name='hsn_code']")
    WebElement HSNCode;

//    @FindBy(xpath = "//div[contains(@class, 'css-b62m3t-container')]")
//    WebElement ClickCategory;
//
//    @FindBy(xpath = "//div[contains(text(),'INVERTERS')]")
//    WebElement CategoryOption;
    
    @FindBy(xpath="//input[@name='manufacturer_name']")WebElement ManufacturerName;
    @FindBy(xpath="//input[@name='manual_pdf']")WebElement Manualpdf;
    @FindBy(xpath="//input[@name='product_details_pdf']")WebElement ProductDetailspdf;
    @FindBy(xpath="//input[@name='weight']")WebElement weight;
    @FindBy(xpath="//div[@class='se-wrapper-inner se-wrapper-wysiwyg sun-editor-editable']")WebElement LongDescription;
    @FindBy(xpath="//div[@class='se-wrapper-inner se-wrapper-wysiwyg sun-editor-editable']")WebElement ShortDescription;
    @FindBy(xpath="//input[@name='minimum_order_quantity']")WebElement MinimumQuantity;
    @FindBy(xpath="//input[@name='tax_percentage']")WebElement Tax;
    @FindBy(xpath="//input[@name='mrp']")WebElement MRP;
    @FindBy(xpath="//input[@name='stock']")WebElement Stock;
    @FindBy(xpath="//input[@name='selling_price']")WebElement SellinPrice;
    
   
    // Actions
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

    public void ClickCatalogue() {
        wait.until(ExpectedConditions.elementToBeClickable(catalogue));
        scrollIntoView(catalogue);
        jsClick(catalogue);
    }

    public void clickProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(Product));
        scrollIntoView(Product);
        jsClick(Product);
    }

    public void clickAddProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(AddProductButton));
        scrollIntoView(AddProductButton);
        jsClick(AddProductButton);
    }

    public void setProductName(String productname) {
        ProductName.sendKeys(productname);
    }

    public void setVolt(String volt) {
        Volt.sendKeys(volt);
    }

    public void clickAddVoltButton() {
        wait.until(ExpectedConditions.elementToBeClickable(AddVoltButton));
        scrollIntoView(AddVoltButton);
        jsClick(AddVoltButton);
    }

    public void uploadFeaturedImage() {
        String file = "C://Users//RAJEEV VERMA//OneDrive//Desktop//t3-lemania-tester-768x768.jpg";
        FeaturedImages.sendKeys(file);
    }

    public void setSKU(String sku) {
        SKU.sendKeys(sku);
    }

    public void setHSNCode(String hsncode) {
        HSNCode.sendKeys(hsncode);
    }

//    public void clickCategory() {
//        wait.until(ExpectedConditions.visibilityOf(ClickCategory));
//        scrollIntoView(ClickCategory);
//        jsClick(ClickCategory);
//
//        wait.until(ExpectedConditions.visibilityOf(CategoryOption));
//        scrollIntoView(CategoryOption);
//        jsClick(CategoryOption);
//    }
    
    public void setManufacturerName(String manufacturer) {
    	ManufacturerName.sendKeys(manufacturer);
    }
    public void uploadManual() {
    	String File="C://Users//RAJEEV VERMA//Downloads//NOTICE_POST_RESULT_DECLARATION_CLASS_X_XII_19052025 (1).pdf";
    	Manualpdf.sendKeys(File);
    }
    public void uploadProductDetails() {
    	String File1="C://Users//RAJEEV VERMA//Downloads//NOTICE_POST_RESULT_DECLARATION_CLASS_X_XII_19052025 (1).pdf";
    	ProductDetailspdf.sendKeys(File1);
    }
    public void setWeight(String Weight)
    {
    	weight.sendKeys(Weight);
    }
    public void setLondescription(String longdescription) {
    	LongDescription.sendKeys(longdescription);
    }
    public void setShortdescription(String shortdes) {
    	ShortDescription.sendKeys(shortdes);
    	
    }
    public void setMinimumOrderQuantity(String minimum) {
    	MinimumQuantity.sendKeys(minimum);
    }
    public void setTax(String tax) {
    	Tax.sendKeys(tax);
    }
    public void setMPR(String mrp) {
    	MRP.sendKeys(mrp);
    }
    public void setStock(String stock) {
    	Stock.sendKeys(stock);
    }
    public void setSellingPrice(String price) {
    	SellinPrice.sendKeys(price);
    }

}

