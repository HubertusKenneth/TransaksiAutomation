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

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=csculu69')

WebUI.setText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    'ZyJNmQzJyQg=')

WebUI.sendKeys(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=csculu69')

WebUI.newTab('')

WebUI.switchToWindowTitle('ARB+ Banking System')

WebUI.setText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    'J7R4ejOak4Y=')

WebUI.sendKeys(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/div_O K_xui.UI.Divu'))

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=csculu69')

WebUI.newTab('')

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=csculu69')

WebUI.switchToWindowTitle('ARB+ Banking System')

WebUI.setText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'), 
    'HUBERTUS2')

WebUI.setEncryptedText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    'W0cBnat/VTb4vE62HGItvw==')

WebUI.sendKeys(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Main Menu_xui.UI.Stacks-CAPTIONab (1)'))

WebUI.rightClick(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (1)'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_From USER_xui.UI.PopMenu-CAPTIONga'))

WebUI.setText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (1)'), 
    'TRMA0012')

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Module Id_xui.UI.Button-CAPTIONae (1)'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_idda_xui.UI.TreeGrid-CELLCAPTIONa-c_a'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_No Handphone_xui.UI.Button-CAPTIONag'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Tidak_xui.UI.Button-CAPTIONab (1)'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_INFORMASI_xlid (1)'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Pilihan Printer_xui.UI.StatusButtons-C_8187c0'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/img_START_xui.UI.Imagec (1)'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_IP  192.168.10.187_xui.UI.Button-CAPTIONa (1)'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_SIGN OUT_xui.UI.Button-CAPTIONv (1)'))

WebUI.closeBrowser()

