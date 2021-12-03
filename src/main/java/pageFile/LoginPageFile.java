package pageFile;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFile {
	private static Logger log =LogManager.getLogger(LoginPageFile.class.getName());
    
WebDriver driver;
     
     public LoginPageFile(WebDriver driver) {
  	   this.driver=driver;
  	   PageFactory.initElements(driver, this);
     }
     //loginbtn //span[text()='Account & Lists']
     @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']//following::span[2]")
     WebElement LoginIn;
     
     //emailbtn
     @FindBy(id="ap_email")
     WebElement EmailBox;
     
     //continuebtn  
     @FindBy(xpath="//input[@id='continue']")
     WebElement Continuebtn;
     
     //passwordbtn
     @FindBy(xpath="//input[@id='ap_password']")
     WebElement Password;
     
     //signinbtn
     @FindBy(xpath="//input[@id='signInSubmit']")
     WebElement SignInClick;
     
     
     
     //click on the login method
     public void loginClick() {
    	 LoginIn.click();
     }
     
     //click on the email and get the id from excel sheet
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
     public void emailClick() throws IOException {
    	 EmailBox.sendKeys(getCellData(0,0));
       }
     
     
     //click on the continuebtn
     public void clickContinue() {
  	 Continuebtn.click();
     }
     
    //click on the password and get the password from excel sheet
     public void passwordID()throws IOException{
     Password.sendKeys(getCellData(1,0));
	 
     }
    
  //click on the signin btn
     public void signClick() {
  	   SignInClick.click();
  	   log.info("*****************signIn Click******************");
     }
}
