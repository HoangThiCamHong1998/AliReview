import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.github.kklisura.cdt.protocol.types.page.Navigate as Navigate
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
import com.sun.corba.se.pept.encoding.InputObject as InputObject
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('https://accounts.shopify.com/login')

//WebUI.maximizeWindow()
//WebUI.delay(5)
'Wait for input_email to be visible in 10s'
WebUI.waitForElementVisible(findTestObject('Object Repository/LoginShopifyScreen/input_email'), 10)
WebUI.setText(findTestObject('Object Repository/LoginShopifyScreen/input_email'), 'honghtc@firegroup.io')

WebUI.click(findTestObject('Object Repository/LoginShopifyScreen/btn_continue_with_email'))

//WebUI.delay(5)
WebUI.waitForElementVisible(findTestObject('Object Repository/LoginShopifyScreen/input_password'), 10)
WebUI.setEncryptedText(findTestObject('Object Repository/LoginShopifyScreen/input_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/LoginShopifyScreen/btn_login'))
WebUI.delay(5)
//WebUI.closeBrowser()