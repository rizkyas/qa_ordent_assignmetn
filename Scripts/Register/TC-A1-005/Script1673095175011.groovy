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

WebUI.click(findTestObject('TC-A1-001/Page_Bioskop Online/span_Daftar'))

WebUI.setText(findTestObject('TC-A1-001/Page_Bioskop Online/input__name'), 'Afsyus Salaam')

WebUI.setText(findTestObject('TC-A1-001/Page_Bioskop Online/input__email'), 'afsyussalaam19@gmail.com')

WebUI.setText(findTestObject('TC-A1-001/Page_Bioskop Online/input__phone'), '081310490')

WebUI.waitForElementPresent(findTestObject('Object Repository/TC-A1-001/Page_Bioskop Online/div_Nomor ponsel minimal 10 digit dan berawalan 0'), 
    0)

