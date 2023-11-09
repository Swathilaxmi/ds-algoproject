

package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {

	public WebDriver driver;

	public registerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
       @FindBy(xpath="/html/body/div[1]/div/div/a")
       WebElement getstarted;
       
       @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
       WebElement Register;
	
		@FindBy(id = "id_username")
		 WebElement txtUsername;
		
		@FindBy(id = "id_password1")
		 WebElement txtPassword;
		
		@FindBy(id = "id_password2")
		WebElement txtPasswordConfirmation;	
		
		@FindBy(xpath = "//input[@value='Register']")
		 WebElement btnRegister;
		
		
		public void getstartedbutton() {
			getstarted.click();
		}
		public void registerbutton() {
			Register.click();
		}
		
		public void enterTxtintoUsername(String username) {
			txtUsername.sendKeys(username);
		}
		
		public void enterTxtintoPassword(String Password) {
			txtPassword.sendKeys(Password);
		}
		
		public void enterTxtintoconfirmationPassword(String Passwordconfirmation) {
			txtPasswordConfirmation.sendKeys(Passwordconfirmation);
		}
		
		public void clickonRegisterButton() {
			btnRegister.click();
			
		}
		
		
		
		
		
		
}


