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

WebUI.openBrowser('https://shopee.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/loginMenu'))

WebUI.setText(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/inputUsername'), '7it2btdt')

WebUI.setEncryptedText(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/inputPassword'), 'wb9rkQHCKRwBah7rk4joeg==')

WebUI.click(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/showPassword'))

WebUI.click(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/loginButton'))

WebUI.verifyElementText(findTestObject(null), 'Akun dan/atau password Anda salah, silakan coba lagi')

WebUI.closeBrowser()

