package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Addproduct;
import utilities.Dataprovider;

public class AddproductTestCases extends setupmentod {
	@Test(dataProvider="LoginData",dataProviderClass = Dataprovider.class)
	public void  verify_login(String email, String password,String ProductName,String Volt,String SKU,String HsnCode,String Manufacturer,
			String Weight, String Long, String Short,String quantity,String Mrp,String Tax,String Stock,String SellingPrice) {
		
		Addproduct ap=new Addproduct(driver);
		ap.setupEmail(email);
		ap.setPassword(password);
		ap.clicklogin();
		
	}
	@Test(priority=2,dataProvider="LoginData",dataProviderClass = Dataprovider.class)
	public void ProcesstoAddProduct(String email, String password,String ProductName,String Volt,String SKU,String HsnCode,String Manufacturer,
			String Weight, String Long, String Short,String quantity,String Mrp,String Tax,String Stock,String SellingPrice) throws InterruptedException {
		Addproduct ap=new Addproduct(driver);
		ap.ClickCatalogue();
		ap.clickProduct();
		Thread.sleep(2000);
		ap.clickAddProductButton();
		
	}
	@Test(priority=3,dataProvider="LoginData",dataProviderClass = Dataprovider.class)
	public void setProductDetails(String email, String password,String ProductName,String Volt,String SKU,String HsnCode,String Manufacturer,
			String Weight, String Long, String Short,String quantity,String Mrp,String Tax,String Stock,String SellingPrice) throws InterruptedException {
		Addproduct ap=new Addproduct(driver);
		ap.setProductName(ProductName);
		ap.uploadFeaturedImage();
		ap.setVolt(Volt);
		ap.clickAddVoltButton();
		ap.setSKU(SKU);
		ap.setHSNCode(HsnCode);
	
//		ap.clickCategory();
		ap.setManufacturerName(Manufacturer);
		ap.uploadManual();
		ap.uploadProductDetails();
		ap.setWeight(Weight);

	}
	@Test(priority=4,dataProvider="LoginData",dataProviderClass = Dataprovider.class)
	public void setContent(String email, String password,String ProductName,String Volt,String SKU,String HsnCode,String Manufacturer,
			String Weight, String Long, String Short,String quantity,String Mrp,String Tax,String Stock,String SellingPrice) {
		Addproduct ap=new Addproduct(driver);
		ap.setLondescription(Long);
		ap.setShortdescription(Short);
	}
	@Test(priority=5,dataProvider="LoginData",dataProviderClass = Dataprovider.class)
	public void setQuantityAndPrice(String email, String password,String ProductName,String Volt,String SKU,String HsnCode,String Manufacturer,
			String Weight, String Long, String Short,String quantity,String Mrp,String Tax,String Stock,String SellingPrice) {
		Addproduct ap=new Addproduct(driver);
		ap.setMinimumOrderQuantity(quantity);
		ap.setMPR(Mrp);
		ap.setTax(Tax);
		
		ap.setStock(Stock);
		ap.setSellingPrice(SellingPrice);
	}

}
