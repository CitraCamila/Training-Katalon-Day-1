import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('User Login/Login Positive Case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Checkout_custom-logo'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_pink drop shoulder oversized t shirt'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/h1_pink drop shoulder oversized t shirt'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/select_Choose an optionPink'), 
    'pink', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/select_Choose an option363738'), 
    '37', false)

WebUI.click(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/a_View cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart  ToolsQA Demo Site/a_continue shopping'))

WebUI.click(findTestObject('Object Repository/Page_Products  ToolsQA Demo Site/a_Black Cross Back Maxi Dress'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/h1_Black Cross Back Maxi Dress'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionBeigeBlack'), 
    'black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionLargeMediumSmall'), 
    'large', false)

WebUI.click(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/a_View cart'))

