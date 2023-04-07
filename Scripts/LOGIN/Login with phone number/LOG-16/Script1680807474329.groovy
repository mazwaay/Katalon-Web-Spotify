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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.website)

WebUI.click(findTestObject('Login-Repo/Login_button(homepage)'))

WebUI.click(findTestObject('Login-Repo/Phone_number_button'))

WebUI.setText(findTestObject('Login-Repo/PhoneNumber_inputText'), GlobalVariable.Valid_number)

WebUI.click(findTestObject('Login-Repo/Next_button(enterphone)'))

WebUI.setText(findTestObject('Login-Repo/OTP_inputText'), '000000')

WebUI.verifyElementText(findTestObject('Login-Repo/Assert-verify-element/Assert_send_OTP'), 'Oops! Something went wrong, please try again or check out our help area')

WebUI.click(findTestObject('Login-Repo/Next_button(OTP)'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Login-Repo/Assert-verify-element/Assert_invalid_OTP'), 'This code is invalid. Check the SMS and try again.')

WebUI.closeBrowser()

