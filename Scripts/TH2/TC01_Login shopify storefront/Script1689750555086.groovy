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

//def email = new String[5]
//email[0]='honghtc+1@firegroup.io'
//email[1]='honghtc+2@firegroup.io'
//email[2]='honghtc+3@firegroup.io'
//email[3]='honghtc+4@firegroup.io'
//email[4]='honghtc+5@firegroup.io'
def account_list = [('acc1') : [('email') : 'honghtc+1@firegroup.io', ('password') : '123'], ('acc2') : [('email') : 'honghtc+2@firegroup.io'
        , ('password') : '123']]

WebUI.openBrowser('https://auto2023.myshopify.com/account/login')

//for (def i = 0; i <= 5; i++) {
//}
inputEmailMethod(input_email, account_list.acc1.email)

inputPassMethod(input_password, account_list.acc1.password)

WebUI.click(btn_login)

WebUI.takeScreenshot('hinh.png')

def inputEmailMethod(def input_email_object, def email) {
    WebUI.setText(input_email_object, email)
}

def inputPassMethod(def input_pass_object, def pass) {
    WebUI.setText(input_pass_object, pass)
}