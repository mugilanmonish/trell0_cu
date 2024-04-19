package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By usernameTxtFld = By.name("email");

	By passwordTxtFld = By.name("pass");

	By loginBtn = By.name("login");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameTxtFld).sendKeys(username);	
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordTxtFld).sendKeys(password);	
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();	
	}

	public void loginToApp(String username, String password) {
		driver.findElement(usernameTxtFld).sendKeys(username);
		driver.findElement(passwordTxtFld).sendKeys(password);
		driver.findElement(loginBtn).click();
	}
	
	public void loginPage() {
		if(!driver.getTitle().equals("(11) Facebook"))
			throw new IllegalStateException("This is not a home page. The current page is "+driver.getCurrentUrl());
	}
}
