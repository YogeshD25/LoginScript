package automationSelenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

    public static void main(String[] args) {
    	
    //	System.getProperties().list(System.out);//Determine type of os
    	System.out.println(System.getProperty("os.name"));
        // declaration and instantiation of objects/variables
    	
	
	System.setProperty("webdriver.firefox.marionette","/usr/bin/chromedriver");
	WebDriver driver = new ChromeDriver();
    String baseUrl = "https://www.zoho.com/people/";
    String actualTitle = "";

    // launch Fire fox and direct it to the Base URL
    driver.get(baseUrl);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    WebElement TextviewLogin = driver.findElement(By.className("zgh-login"));
    TextviewLogin.click();
    
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement email = driver.findElement(By.name("lid"));
    email.sendKeys("emailid");
    
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement pass = driver.findElement(By.name("pwd"));
    pass.sendKeys("Password");
    
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
   // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    WebElement submit = driver.findElement(By.id("signin_submit"));
    submit.click();
    

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement checkIn = driver.findElement(By.className("in"));
    checkIn.click();
   
    //close 
    driver.close();
    System.exit(0);

}

}