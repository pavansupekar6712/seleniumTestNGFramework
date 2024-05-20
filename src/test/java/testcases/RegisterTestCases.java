package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.HomePageObjects;
import PageObjectModel.RegisterPageObjects;
import resources.BaseClass;
import resources.commonMethods;
import resources.testData;

public class RegisterTestCases extends BaseClass {

	@Test (priority=1)
	public void VerifyRegistrationWithValidData() throws IOException, InterruptedException {

		
		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplicitWait(driver, 2, hpo.clickOnmyAccount());

		hpo.clickOnmyAccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		// Register Account
		rpo.TypeFirstName().sendKeys(testData.Firstname);
		rpo.TypeLastName().sendKeys(testData.Lastname);
		rpo.TypeEmail().sendKeys(EmailID);
		rpo.TypeTelephone().sendKeys(testData.Telephone);
		rpo.TypePassword().sendKeys(testData.Password);
		rpo.TypeConfirm().sendKeys(testData.ConfirmPassword);
		rpo.ClickAgree().click();
		rpo.ClickContinue().click();
		
		String Expected = testData.RegistrationSucessfulExpected;
		String Actual = rpo.getRegistrationSucessfullText().getText();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Actual, Expected,"Your Test id not Matching");
		
		sa.assertAll();

	}

	@Test(enabled=false)
	public void VerifyRegistrationWithInvalidData() throws IOException, InterruptedException {

		
		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplicitWait(driver, 2, hpo.clickOnmyAccount());

		hpo.clickOnmyAccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		rpo.TypeFirstName().sendKeys(testData.Firstname);
		rpo.TypeLastName().sendKeys(testData.Lastname);
		rpo.TypeEmail().sendKeys(testData.EmailId);
		rpo.TypeTelephone().sendKeys(testData.Telephone);
		rpo.TypePassword().sendKeys(testData.Password);
		rpo.TypeConfirm().sendKeys(testData.ConfirmPassword);

		rpo.ClickAgree().click();
		rpo.ClickContinue().click();

	}
	
	@Test (priority=2)
	public void VerifyRegistrationWithBlankData() throws IOException, InterruptedException{
		
				
		HomePageObjects hpo = new HomePageObjects(driver);
		
		commonMethods.handleExplicitWait(driver, 2, hpo.clickOnmyAccount());

		hpo.clickOnmyAccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);
		
		rpo.ClickContinue().click();
		
		
		String fnExpected = testData.FirstnameExpected;
		String fnActual = rpo.getFirstNameErrorMsg().getText();
		
		String lnExpected = testData.LastnameExpected;
		String lnActual = rpo.getLastNameErrorMsg().getText();
		
		String emailExpected = testData.EmailExpected;
		String emailActual = rpo.getEmailErrorMsg().getText();
		
		String telephoneExpected = testData.TelephoneExpected;
		String telephoneActual = rpo.getTelephoneErrorMsg().getText();
		
		String passwordExpected = testData.PasswordExpected;
		String passwordActual = rpo.getPasswordErrorMsg().getText();
		
		commonMethods.handleAssertion(fnActual, fnActual);
		commonMethods.handleAssertion(lnActual, lnExpected);
		commonMethods.handleAssertion(emailActual, emailExpected);
		commonMethods.handleAssertion(telephoneActual, telephoneExpected);
		commonMethods.handleAssertion(passwordActual, passwordExpected);
		
		
	
	}	
}
