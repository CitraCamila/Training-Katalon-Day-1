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



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to Website Shop Demo Register")
	def User_navigate_to_Website_Shop_Demo_Register() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://shop.demoqa.com/')

		WebUI.maximizeWindow()

		WebUI.click(findTestObject('Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/Button_Dismiss'))
	}
	

	@When("User click button My Account Register")
	def User_click_button_My_Account_Register() {
		WebUI.click(findTestObject('Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/Button_My Account'))

		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Tab_Register'), 0)

	}
	

	@And("User enter already registered username")
	def User_enter_already_registered_username() {
		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Username_Register'), 'citra1')

		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Email Register'), 'citra1@gmail.com')

		WebUI.setEncryptedText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Password_Register'), '8wkTjk+rrzEk3z355PUADw==')

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Medium'), 0)
	
	}
	
	
	@And("User click button register")
	def User_click_button_register() {
		WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Button_Register'))
	}


	@Then("User already registered")
	def User_already_registered() {
		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Alert Username Already Registered'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Alert Username Already Registered'), 0)
	}
		
	
	@When("User enter null email register")
	def User_enter_null_email_register() {

		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Tab_Register'), 0)

		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Username_Register'), 'citraccc')

		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Email Register'), '')

		WebUI.setEncryptedText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Password_Register'), '8wkTjk+rrzEk3z355PUADw==')

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Medium'), 0)

		WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Button_Register'))
	}

	@Then("User required email register")
	def User_required_email_register() {
		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Error Please provide a valid email address'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Error Please provide a valid email address'), 0)
	}
		
	
	@When("User enter valid username email password")
	def User_enter_valid_username_email_password() {

		WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Tab_Register'), 0)

		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Username_Register'), 'citracam1')

		WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Email Register'), 'citracam1@gmail.com')

		WebUI.setEncryptedText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Password_Register'), '8wkTjk+rrzEk3z355PUADw==')

		WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Medium'), 0)

		WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Button_Register'))
	}

	@Then("User register success")
	def User_register_success() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log In  ToolsQA Demo Site  WordPress/input_Username or Email Address_log'), 0)
		
		WebUI.closeBrowser()
	}
	
}