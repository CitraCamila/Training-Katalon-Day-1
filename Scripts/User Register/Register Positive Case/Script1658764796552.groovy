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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/Button_Dismiss'))

WebUI.click(findTestObject('Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/Button_My Account'))

WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Tab_Register'), 0)

WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Username_Register'), 'citra11')

WebUI.setText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Email Register'), 'citra11@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_My Account  ToolsQA Demo Site/Input__Password_Register'), '8wkTjk+rrzEk3z355PUADw==')

WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Medium'), 0)

WebUI.click(findTestObject('Page_My Account  ToolsQA Demo Site/Button_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Log In  ToolsQA Demo Site  WordPress/input_Username or Email Address_log'), 
    'citra11')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In  ToolsQA Demo Site  WordPress/input_Password_pwd'), 
    '8wkTjk+rrzEk3z355PUADw==')

WebUI.click(findTestObject('Object Repository/Page_Log In  ToolsQA Demo Site  WordPress/input_Remember Me_wp-submit'))

WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Hello Berhasil Login'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Account  ToolsQA Demo Site/Text_Hello Berhasil Login'), 0)

WebUI.closeBrowser()

