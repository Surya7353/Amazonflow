package pageFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Logout {
	WebDriver driver;
    
    public Logout(WebDriver driver) {
 	   this.driver=driver;
 	   PageFactory.initElements(driver, this);
    }
    
  
  /*  @FindBy(xpath="//div[@class='a-column a-span8 pmts-add-credit-card-number-input-box a-span-last']")
    WebElement cardNo;
    
  //input[@id='pp-JOTpX0-14']
    @FindBy(xpath="//input[@id='pp-JOTpX0-16']")
    WebElement accountName;
    
    @FindBy(xpath="//select[@name='ppw-expirationDate_month']")
    WebElement expDate;
    
 
    @FindBy(xpath="//select[@name='ppw-expirationDate_year']")
    WebElement expYear;
    
    @FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
    WebElement addCard;
    
    
    @FindBy(css="input#pp-OlsuTn-96")
    WebElement cvvElement;
    
    
   /* @FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
    WebElement ;*/
    
    
    
   /* 
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
    
    public void cardNumber() throws IOException {
    	cardNo.sendKeys(getCellData(3,0));
   	 //cardNo.click();
    }
    
    public void cardName() throws IOException {
   	 accountName.sendKeys(getCellData(4,0));
    }
    
    public void selctDate() {
    	 try {
       	  Select select=new Select(expDate);
       	  select.selectByIndex(8);
       	  }  
       	  catch(Exception e) {
        		 return;
        			
     		}
          }
    
    public void selectYear() {
    	 try {
       	  Select select=new Select(expYear);
       	  select.selectByIndex(5);
       	  }  
       	  catch(Exception e) {
        		 return;
        			
     		}
          }
    public void addcardClick() {
      	 addCard.click();
       }
    
    
    public void cvvNumber() throws IOException {
    	cvvElement.sendKeys(getCellData(5,0));
    }
    */
  //logcall.cardNumber();
	
  		/*logcall.cardName();
  		logcall.selctDate();
  		logcall.selectYear();
  		logcall.addcardClick();
  		logcall.cvvNumber();*/
  		
 
         
}

    
    
    
    
