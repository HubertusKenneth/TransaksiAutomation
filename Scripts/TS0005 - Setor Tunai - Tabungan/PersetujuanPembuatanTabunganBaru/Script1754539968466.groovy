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

//

WebUI.setText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS2')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'W0cBnat/VTb4vE62HGItvw==')

WebUI.sendKeys(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Main Menu_xui.UI.Stacks-CAPTIONab'))

WebUI.rightClick(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_concat(id(, , xui.UI.PopMenu-CAPTIONga_1917c7'))

WebUI.setText(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'SVMA0003')

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Module Id_xui.UI.Button-CAPTIONae'))

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:j:']")
	,'370-1-0005987-8')

WebUI.sendKeys(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:j:']"),Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_busdt_xui.UI.TreeGrid-CELLCAPTIONa-c_a'))

TestObject textareaObj = new TestObject('dynamicTextarea')
textareaObj.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:l:']")

WebUI.waitForElementVisible(textareaObj, 10)
WebUI.waitForElementClickable(textareaObj, 10)

WebUI.scrollToElement(textareaObj, 5)
WebUI.setText(textareaObj, 'Testing')

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Oleh_xui.UI.Button-CAPTIONaj'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ab:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:am:']"))

//WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Oleh_xui.UI.Button-CAPTIONaj'))

//WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-iNPUT:l:']"))

//WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_Oleh_xui.UI.Button-CAPTIONaj'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/img_START_xui.UI.Imagec (1)'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_IP  192.168.10.187_xui.UI.Button-CAPTIONa (1)'))

WebUI.click(findTestObject('Object Repository/BukaTabunganBaru/Page_ARB Banking System/span_SIGN OUT_xui.UI.Button-CAPTIONv (1)'))

WebUI.closeBrowser()


