package pageFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		//calling properties items in to this page 
     Properties prop=new Properties();
     String path= System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\test.properties";
     FileInputStream InputStream = new FileInputStream(path);
     prop.load(InputStream);
     
     String Bvalue=prop.getProperty("browser");
     String BName=Bvalue.toLowerCase();
     String Testlink =prop.getProperty("url");
	 
    
     switch(BName) {
		case "chrome":System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		break;
		
		case "firefox":System.setProperty("webdriver.gecko.driver","F:\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		break;
		
		default:break;		
		
		}
        driver.get(Testlink);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
     return driver;
     
	}

}

