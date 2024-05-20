package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.HomePageObjects;
import PageObjectModel.LoginPageObjects;
import resources.BaseClass;
import resources.commonMethods;
import resources.testData;

public class LoginTestCases extends BaseClass {

	@Test
	public void VerifyLoginWithValidData() throws InterruptedException, IOException {

		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplicitWait(driver, 2, hpo.clickOnmyAccount());

		hpo.clickOnmyAccount().click();
		hpo.clickOnLogin().click();

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterEmail().sendKeys(EmailID);
		lpo.enterPassword().sendKeys(testData.Password);
		lpo.clickOnLogin().click();

		String Expected = testData.LoginSucessfulExpected;
		String Actual = lpo.getLoginSucessfulText().getText();

		commonMethods.handleAssertion(Actual, Expected);

	}

	@Test
	public void VerifyLoginWithInvlidData() throws InterruptedException, IOException {

		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplicitWait(driver, 2, hpo.clickOnmyAccount());

		hpo.clickOnmyAccount().click();
		hpo.clickOnLogin().click();

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterEmail().sendKeys("");
		lpo.enterPassword().sendKeys(testData.Password);
		lpo.clickOnLogin().click();

		String Expected = testData.LoginFailedExpected;
		String Actual = lpo.getLoginFailed().getText();

		commonMethods.handleAssertion(Actual, Expected);
	}

}
