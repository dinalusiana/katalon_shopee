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

WebUI.click(findTestObject('Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/loginMenu'))

WebUI.setText(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/inputUsername'), '7it2btdt2l')

WebUI.setEncryptedText(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/inputPassword'), 'wb9rkQHCKRwBah7rk4joeg==')

WebUI.click(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/qrLoginButton'))

WebUI.click(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/showPassword'))

WebUI.click(findTestObject('Page_Login sekarang untuk mulai berbelanja _a6a865/loginButton'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Untuk keamanan akun, mohon verifikasi i_9fbf4a'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Verifikasi melalui link'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_Kirim lewat SMS'))

WebUI.click(findTestObject('Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/perlengkapanRumahButton'))

WebUI.click(findTestObject('Page_Jual Pakaian Pria Harga TermurahBeli M_c9e9df/tasSekolah'))

WebUI.click(findTestObject('Page_Keranjang Belanja/checkbokButton'))

WebUI.click(findTestObject('Page_Keranjang Belanja/masukkanKodeText'))

WebUI.click(findTestObject('Page_Keranjang Belanja/tampilkanSemuaButton'))

WebUI.click(findTestObject('Page_Keranjang Belanja/nantiSajaButton'))

WebUI.click(findTestObject('Page_Keranjang Belanja/checkoutButton'))

WebUI.setText(findTestObject('Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/namaLengkapText'), 'tes')

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_(62) 81325739269'))

WebUI.setText(findTestObject('Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/inputAlamat'), 'pat')

WebUI.sendKeys(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/input_JAWA TENGAH_XXLl2m xlt0cA'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/span_JAWA TENGAH'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Kota'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_KAB. PATI'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_JUWANA'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_59185'))

WebUI.click(findTestObject('Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/identitasTextElement'))

WebUI.setText(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/textarea_Sejomuly'), 
    'Sejomulyo')

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_RT.1RW.1, Sejomulyo Kel. Sejomulyo, Juwana'))

WebUI.setText(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/input_Detail Lainnya (Cth Blok  Unit No., P_435d8a'), 
    'yng rapi')

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_Konfirmasi'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_Data peta 2022_c7d1jI_1'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Alamatmu di sini'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Untuk bernavigasi, tekan tombol panah.A_0ceebe'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/div_Alamatmu di sini'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/img'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_Konfirmasi'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_Indomaret  i.Saku'))

WebUI.click(findTestObject('Object Repository/Page_Shopee Indonesia  Jual Beli di Ponsel _2639c9/button_Buat Pesanan'))

WebUI.closeBrowser()

