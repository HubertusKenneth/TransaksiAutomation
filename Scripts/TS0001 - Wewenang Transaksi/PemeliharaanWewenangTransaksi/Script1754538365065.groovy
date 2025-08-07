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
import com.kms.katalon.core.testobject.ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=csculu69')

WebUI.setText(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/span_Main Menu_xui.UI.Stacks-CAPTIONab'))

WebUI.rightClick(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/span_From USER_xui.UI.PopMenu-CAPTIONga'))

WebUI.setText(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'MNPM0034')

WebUI.click(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/span_Module Id_xui.UI.Button-CAPTIONae'))

//WebUI.click(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/img_idt_xui.UI.TreeGrid-CMDi-r_a_edit'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CMD:a:-r_a_edit']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:r:']"))

WebUI.click(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/span_IP  192.168.10.187_xui.UI.Button-CAPTIONa'))

WebUI.click(findTestObject('Object Repository/WewenangTransaksi/Page_ARB Banking System/span_SIGN OUT_xui.UI.Button-CAPTIONv'))

WebUI.closeBrowser()

