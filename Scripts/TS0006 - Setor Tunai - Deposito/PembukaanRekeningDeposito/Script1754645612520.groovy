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

WebUI.setText(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'DPMA0001')

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_Run'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_PEMBUKAAN REKENING DEPOSITO'))

WebUI.setText(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTs'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTs'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_HUBERTUS KENNETH'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/label_Text Area_xui.UI.Labelcf'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Jenis Produk_xui.UI.ComboInput-INPUTo'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_DA - D.NAS-1 BL'))

WebUI.setText(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Nomor Bilyet Tercetak_xui.UI.Input-INPUTab'), 
    '9984975')

WebUI.setText(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Nominal_xui.UI.Input-INPUTac'), 
    '999,999,999,999,999,999.99')

WebUI.sendKeys(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/input_Nominal_xui.UI.Input-INPUTac'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_Simpan'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_Ya'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/div_Nomor Rekening Anda 370-3-0011594-0'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_O K_1'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/BukaRekDepositoBaru/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

