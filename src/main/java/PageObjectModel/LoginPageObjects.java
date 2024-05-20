package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	private By email = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");	
	private By login = By.xpath("//input[@value='Login']");
	
	private By LoginSucessfulText = By.xpath("//h2[text()='My Account']");
	
	private By LoginFailedText = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getLoginSucessfulText() {
		return driver.findElement(LoginSucessfulText);
	}
	
	public WebElement getLoginFailed() {
		return driver.findElement(LoginFailedText);
	}
	

}
