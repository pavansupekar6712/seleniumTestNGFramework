package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {

	public WebDriver driver;

	// Register Account
	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirm = By.xpath("//input[@name='confirm']"); // check box and submit btn
	private By Agree = By.xpath("//input[@name='agree']");
	private By Continue = By.xpath("//input[@type='submit']");

	private By RegistrationSucessfull = By.xpath("//h1[text()='Your Account Has Been Created!']");

	private By FirstNameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");
	private By LastNameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");
	private By EmailErrorMsg = By.xpath("(//div[@class='text-danger'])[3]");
	private By TelephoneErrorMsg = By.xpath("(//div[@class='text-danger'])[4]");
	private By PasswordErrorMsg = By.xpath("(//div[@class='text-danger'])[5]");
	private By PrivacyPolicyAlertMsg = By.xpath("//div[text() = ' Warning: You must agree to the Privacy Policy!']");
	private By ConfirmPasswordAlertMsg = By.xpath("//div[@class = 'text-danger')");
	private By EmailAlertMsg = By.xpath("//div[text() = ' Warning: E-Mail Address is already registered!']");

	public RegisterPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement TypeFirstName() {
		return driver.findElement(firstname);
	}

	public WebElement TypeLastName() {
		return driver.findElement(lastname);
	}

	public WebElement TypeEmail() {
		return driver.findElement(email);
	}

	public WebElement TypeTelephone() {
		return driver.findElement(telephone);
	}

	public WebElement TypePassword() {
		return driver.findElement(password);
	}

	public WebElement TypeConfirm() {
		return driver.findElement(confirm);
	}

	public WebElement ClickAgree() {
		return driver.findElement(Agree);
	}

	public WebElement ClickContinue() {
		return driver.findElement(Continue);
	}

	public WebElement getFirstNameErrorMsg() {
		return driver.findElement(FirstNameErrorMsg);
	}

	public WebElement getLastNameErrorMsg() {
		return driver.findElement(LastNameErrorMsg); // Extra method
	}

	public WebElement getEmailErrorMsg() {
		return driver.findElement(EmailErrorMsg);
	}

	public WebElement getTelephoneErrorMsg() {
		return driver.findElement(TelephoneErrorMsg);
	}

	public WebElement getPasswordErrorMsg() {
		return driver.findElement(PasswordErrorMsg);
	}

	public WebElement getPrivacyPolicyAlertMsg() {
		return driver.findElement(PrivacyPolicyAlertMsg);
	}

	public WebElement getConfirmPasswordAlertMsg() {
		return driver.findElement(ConfirmPasswordAlertMsg);
	}

	public WebElement getEmailAlertMsg() {
		return driver.findElement(EmailAlertMsg);
	}

	public WebElement getRegistrationSucessfullText() {
		return driver.findElement(RegistrationSucessfull);
	}
}