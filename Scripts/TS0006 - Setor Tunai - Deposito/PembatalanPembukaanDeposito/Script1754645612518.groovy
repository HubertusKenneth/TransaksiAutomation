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

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'DPMA0004')

WebUI.click(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/span_Run'))

WebUI.setText(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/input_Nama Nasabah  No.Rekening_xui.UI.Inpu_b018f0'), 
    '370-3-0011595-3')

WebUI.sendKeys(findTestObject('Object Repository/PembatalanPembukaanDeposito/Page_ARB Banking System/input_Nama Nasabah  No.Rekening_xui.UI.Inpu_b018f0'), 
    Keys.chord(Keys.ENTER))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ah:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//span[contains(@class,'xui-icon-circleright')]"))

//Klik next button karena memeakai yang sebelumnya tidak bisa (not found)
TestObject iconRight2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, "(//span[contains(@class,'xui-icon-circleright')])[2]")
WebUI.waitForElementVisible(iconRight2, 10)
WebUI.waitForElementClickable(iconRight2, 10)
WebUI.scrollToElement(iconRight2, 10)
WebUI.click(iconRight2)


// Isi Text area untuk alasan pembatalan
TestObject textareaObj = new TestObject('dynamicTextarea')
textareaObj.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:ad:']")

WebUI.waitForElementVisible(textareaObj, 10)
WebUI.waitForElementClickable(textareaObj, 10)

WebUI.scrollToElement(textareaObj, 5)
WebUI.setText(textareaObj, 'Testing')

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ag:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ab:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ah:']"))
 
WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_IP  192.168.10.187_xui.UI.Button-CAPTIONa'))

WebUI.click(findTestObject('Object Repository/TransaksiUmum/Page_ARB Banking System/span_SIGN OUT_xui.UI.Button-CAPTIONv'))

WebUI.closeBrowser()

