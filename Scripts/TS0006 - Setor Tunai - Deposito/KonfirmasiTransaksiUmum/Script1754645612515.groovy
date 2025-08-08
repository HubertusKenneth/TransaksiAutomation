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

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (2)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Main Menu_xui.UI.Stacks-CAPTIONab (2)'))

WebUI.rightClick(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (2)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_From USER_xui.UI.PopMenu-CAPTIONga (2)'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (2)'), 
    'TRMA0012')

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Module Id_xui.UI.Button-CAPTIONae (2)'))

WebUI.setText(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Pencarian_xui.UI.Input-INPUTe (2)'), 
    '370-3-0011594-0')

WebUI.sendKeys(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/input_Pencarian_xui.UI.Input-INPUTe (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_idda_xui.UI.TreeGrid-CELLCAPTIONa-c_a (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_No Handphone_xui.UI.Button-CAPTIONag'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Tidak_xui.UI.Button-CAPTIONab (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_INFORMASI_xlid (1)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_Pilihan Printer_xui.UI.StatusButtons-C_8187c0'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/img_START_xui.UI.Imagec (2)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_IP  192.168.10.187_xui.UI.Button-CAPTIONa (2)'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_SIGN OUT_xui.UI.Button-CAPTIONv (2)'))

WebUI.closeBrowser()

