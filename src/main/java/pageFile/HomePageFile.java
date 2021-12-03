package pageFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageFile {
	 WebDriver driver;
     
     public HomePageFile(WebDriver driver) {
  	   this.driver=driver;
  	   PageFactory.initElements(driver, this);
     }
     
     
   //locator of searchbox
     @FindBy(css="input#twotabsearchtextbox")
     WebElement btnSearch;
     
     
   //locator of searchbar
     @FindBy(css="input#nav-search-submit-button")
     WebElement btnSearchIcon;
     
     //click on sortby for low price
    
     @FindBy(xpath="//select[@data-action='a-dropdown-select']")
     WebElement selectprice;
     
   
    //explicit wait 
     public void waitForClick() {
    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
    	 wait.until(ExpectedConditions.elementToBeClickable(selectprice));
    	 
     }
     
     public static String getCellData(int Rownum,int Colnum) throws IOException {
    	 String Excelpath =System.getProperty("user.dir");
    	 FileInputStream fis = new FileInputStream(Excelpath +"\\src\\main\\java\\Resources\\testleaf.xlsx");
	
   	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet1=workbook.getSheetAt(0);
			XSSFCell cell;
			XSSFRow row;
			try {
		 cell=sheet1.getRow(Rownum).getCell(Colnum);
		 String cellVal=cell.getStringCellValue();
		 return cellVal;
		 
     }
			catch(Exception e) {
				e.printStackTrace();
				return"";
				
			}
     }
     //click on product
     public void clickSearchProduct() throws IOException {
    	 btnSearch.sendKeys(getCellData(2,0));
       }
     //click on search
     public void clickIcon() {
    	 btnSearchIcon.click();
       }
 
 	
     
     
     //Click on low price  
      public void clickDropdown() {
    	  try {
    	  Select select=new Select(selectprice);
    	  select.selectByIndex(1);
    	  }  
    	  catch(Exception e) {
     		 return;
     			
  		}
       }
     
     
    
}
      
     
    
   
     

