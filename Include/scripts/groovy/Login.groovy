import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to Website Shop Demo")
	def User_navigate_to_Website_Shop_Demo() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://shop.demoqa.com/')

		WebUI.maximizeWindow()

		WebUI.click(findTestObject('Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/Button_Dismiss'))
	}

	@When("User click button My Account")
	def User_click_button_My_Account() {
		WebUI.click(findTestObject('Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/Button_My Account'))

		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Tab_Login'), 0)
	}

	@And("User enter (.*) and (.*)")
	def User_enter_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input_Username_Login'), username)

		WebUI.setEncryptedText(findTestObject('Page_My Account  ToolsQA Demo Site/Input_Password_Login'), password)
	}

	@And("User click button login")
	def User_click_button_login() {
		WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Button_Login'))
	}

	@Then("User login with (.*) credential")
	def User_login_with_status_credential(String status) {
		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Error Username Incorect'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Error Username Incorect'), 0)
	}

	@When("User enter null username")
	def User_enter_null_username() {

		WebUI.click(findTestObject('Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/Button_My Account'))

		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Tab_Login'), 0)

		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input_Username_Login'), '')

		WebUI.setEncryptedText(findTestObject('Page_My Account  ToolsQA Demo Site/Input_Password_Login'), '8wkTjk+rrzEk3z355PUADw==')

		WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Button_Login'))
	}

	@Then("User required username")
	def User_required_username() {
		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Error Username is Required'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Error Username is Required'), 0)
	}

	@When("User enter null password")
	def User_enter_null_password() {

		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Tab_Login'), 0)

		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input_Username_Login'), 'citra')

		WebUI.setEncryptedText(findTestObject('Page_My Account  ToolsQA Demo Site/Input_Password_Login'), '')

		WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Button_Login'))
	}

	@Then("User required password")
	def User_required_password() {
		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Error Password is Required'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Error Password is Required'), 0)
	}

	@When("User enter valid username password")
	def User_enter_valid_username_password() {

		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Tab_Login'), 0)

		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input_Username_Login'), 'citra')

		WebUI.setEncryptedText(findTestObject('Page_My Account  ToolsQA Demo Site/Input_Password_Login'), '')

		WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Button_Login'))
	}

	@Then("User login success")
	def User_login_success() {
		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Hello Berhasil Login'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Hello Berhasil Login'), 0)

		WebUI.closeBrowser()
	}
}