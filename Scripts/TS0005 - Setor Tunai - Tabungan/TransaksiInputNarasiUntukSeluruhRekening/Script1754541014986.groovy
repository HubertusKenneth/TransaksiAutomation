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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (4)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (4)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (4)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Favorites (1)'))

WebUI.rightClick(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (3)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Create New Favorite (1)'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (4)'), 
    'TRMA0010')

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Run (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Pilih Transaksi_xui.UI.ComboInput-INPUTm (2)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_SETOR TUNAI (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/div_Narasi untuk Seluruh Rekening'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Narasi untuk Seluruh Rekening'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/textarea_Narasi untuk Seluruh Rekening_xui._001f05'), 
    'TESTING SAJA')

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTh (2)'), 
    '1')

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTi (2)'), 
    '0005984')

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTj (2)'), 
    '1')

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTj (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_O K (1)'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nominal_xui.UI.ComboInput-INPUTt (2)'), 
    '100000')

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nominal_xui.UI.ComboInput-INPUTt (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Submit (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Simpan (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Ya (1)'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/textarea_Catatan_xui.UI.Input-INPUTy (2)'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_OK (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Tidak (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/img_START_xui.UI.Imagec (4)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Sign Out (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Yes (1)'))

WebUI.closeBrowser()

