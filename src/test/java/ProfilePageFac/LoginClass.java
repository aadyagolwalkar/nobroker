package ProfilePageFac;
	 
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class LoginClass {
	static WebDriver driver;
	@FindBy(xpath="//div[@class=\"px-1p border-l-1 border-l-solid border-l-header-grey cursor-pointer\"]")
	WebElement loginbtn;
	@FindBy(xpath="//input[@id='signUp-phoneNumber']")
	WebElement phoneno;
	@FindBy(id="login-signup-form-login-radio-password")
	WebElement passRadio;
	@FindBy(id ="login-signup-form__password-input")
	WebElement passinput ;
	//@FindBy(xpath="//div[@class=\"nb-switch-toggle xs\"]")
	//WebElement togglebtn;
	@FindBy(id="signUpSubmit")
	WebElement continuebtn;
	//constructor
	public LoginClass(WebDriver driver) 
	{
				 this.driver=driver;
				 PageFactory.initElements(driver, this);
	}
	public void userLogin() throws InterruptedException {
		loginbtn.click();
 
		//driver.navigate().to("https://www.nobroker.in/#signup-login");
//        System.out.println(driver.getCurrentUrl());
         Thread.sleep(2000);
	 phoneno.click();	
     phoneno.sendKeys("7489654824");
     Thread.sleep(1000);
 
     passRadio.click();
    // togglebtn.click();
     Thread.sleep(3000);
     passinput.sendKeys("aadya123");
     Thread.sleep(3000);
     continuebtn.click();
	    


	 
	     

		}
	 
	
}
