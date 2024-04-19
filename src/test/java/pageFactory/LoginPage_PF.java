package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	private WebElement usernameTxt;
	
	@FindBy(name = "pass")
	private WebElement passwordTxt;
	
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	public void enterUsername(String username) {
		usernameTxt.sendKeys(username);
	}
	public void enterPassword(String password) {
		passwordTxt.sendKeys(password);
	}
	public void clickLogin() {
		loginBtn.click();
	}
}
