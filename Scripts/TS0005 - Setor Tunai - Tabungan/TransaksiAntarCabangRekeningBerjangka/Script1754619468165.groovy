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

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (3)'), 
    'KENNETH')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (3)'), 
    'SB6/sqBmSwWF9fGogWJfdg==')

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (3)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/div_PUSH APPROVAL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (3)'), 
    'TRMA0010')

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Run'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Pilih Transaksi_xui.UI.ComboInput-INPUTm (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_SETOR TUNAI'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTg'))

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTg'),
    Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTg'),
    '370')

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTh (1)'), 
    '1')

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTi (1)'), 
    '0005961')

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTj (1)'), 
    '1')

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nomor Rekening_xui.UI.Input-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_O K'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nominal_xui.UI.ComboInput-INPUTt (1)'), 
    '100000')

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Nominal_xui.UI.ComboInput-INPUTt (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Submit'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Simpan'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Ya'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/textarea_Catatan_xui.UI.Input-INPUTy (1)'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_OK'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Tidak'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/img_START_xui.UI.Imagec (3)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

