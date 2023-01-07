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

WebUI.navigateToUrl('https://bioskoponline.com/')

WebUI.click(findTestObject('Login/span_Masuk'))

WebUI.setText(findTestObject('Login/input_Atau_username'), '085171607859')

WebUI.setText(findTestObject('Login/input__kata_sandi'), 'P@ssw0rd')

WebUI.click(findTestObject('Login/button_Masuk'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Login/div_Kirim OTP Melalui'), 0)

WebUI.click(findTestObject('Login/span_SMS'))

WebUI.setText(findTestObject('Login/input_Kode_OTP'), '2222')

WebUI.click(findTestObject('Login/span_Verifikasi'))

WebUI.waitForElementPresent(findTestObject('TC-A1-001/div_Nomor handphone telah digunakan'), 0)

