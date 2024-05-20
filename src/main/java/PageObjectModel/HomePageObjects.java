package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public WebDriver driver;
	
	private By myAccount = By.xpath("//i[@class='fa fa-user']");
	private By Register = By.xpath("//a[text()='Register']");
	private By Login = By.xpath("//a[text()='Login']");
	
	
	public HomePageObjects (WebDriver driver) {
		
		this.driver= driver;
	}
	
	
	public WebElement clickOnmyAccount () {
		
		return driver.findElement(myAccount);
		
	}
	
	public WebElement clickOnRegister () {
		
		return driver.findElement(Register);
		
	}
	
	public WebElement clickOnLogin () {
		
		return driver.findElement(Login);
		
	}
	

}
