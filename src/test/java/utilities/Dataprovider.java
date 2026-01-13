package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException {
	    String path = "./testdata/EnergyFloTestData.xlsx";  // Ensure correct file path
	    ExcelUtility xlutil = new ExcelUtility(path);

	    String sheetName = "Testimonials";  
	    int totalRows = xlutil.getRowCount(sheetName);
	    int totalCols = xlutil.getCellCount(sheetName, 0);

	    System.out.println("Total Rows: " + totalRows);
	    System.out.println("Total Columns: " + totalCols);

	    String loginData[][] = new String[totalRows][totalCols];

	    for (int i = 1; i <= totalRows; i++) {  
	        for (int j = 0; j < totalCols; j++) {
	            loginData[i - 1][j] = xlutil.getCellData(sheetName, i, j).trim();  
	            System.out.println("Reading: " + loginData[i - 1][j]);  // Debugging output
	        }
	    }
	    return loginData;
	}

}
