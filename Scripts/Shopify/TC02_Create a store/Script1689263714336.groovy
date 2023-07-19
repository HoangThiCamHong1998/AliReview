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

//WebUI.openBrowser("https://accounts.shopify.com/lookup")

//WebUI.maximizeWindow()
//WebUI.callTestCase(findTestCase('Test Cases/Shopify/TC01_Login Shopify'),null)

WebUI.navigateToUrl("https://partners.shopify.com/2811794/stores/new?store_type=client_store")

WebUI.click(findTestObject('Object Repository/CreateStorePage/btn_email_user'))

WebUI.setText(findTestObject('Object Repository/CreateStorePage/input_store_name'), store_name)

WebUI.scrollToElement(findTestObject('Object Repository/CreateStorePage/btn_create_development_store'), 3)

WebUI.click(findTestObject('Object Repository/CreateStorePage/btn_create_development_store'))

//WebUI.takeScreenshot('C:/Users/FireGroup/Katalon Studio/AliReview/Photos')

//WebUI.closeBrowser()