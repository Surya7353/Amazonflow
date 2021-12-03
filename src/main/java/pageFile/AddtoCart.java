package pageFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart {

 WebDriver driver;
     
     
     public AddtoCart(WebDriver driver) {
  	   this.driver=driver;
  	   PageFactory.initElements(driver, this);
      }
    
     
     
     // xpath of product using link
     @FindBy(xpath="//img[@data-image-index='1']")
     WebElement clickImage;
   
     
     //locator of addcart
     @FindBy(xpath="//input[@id='add-to-cart-button']")
     WebElement btnClick;
     
     
     //locator of proceed payment
     @FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
    WebElement proceedPayment;
     

     //locator of  payment option
     @FindBy(xpath="//span[@id='apx-add-credit-card-action-test-id']")
     WebElement paymentLink;
     
     
     //click on the product
     public void selectLink() {
   	clickImage.click();
   	  }
    
     //click on the addtocart
     public void selectAddtoCart() {
   	btnClick.click();
   	 }
    
     
    //click on the proceed to cart btn
    public void proceedtoCart() {
    	proceedPayment.click();
    			
    	 }
    
    //click on the payment btn
    public void paymentClick() {
    	try {
     	paymentLink.click();
     	 }
    	catch(Exception e) {
    		return;
    	}
    		
    	}
   
    
 
    
}
