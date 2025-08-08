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

WebUI.setText(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'DPMA0011')

WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_Run (1)'))

//WebUI.setText(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/input_Nama Nasabah  No Rekening_xui.UI.Inpu_66183b'), 
//    '370-3-0011596-6')

//WebUI.sendKeys(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/input_Nama Nasabah  No Rekening_xui.UI.Inpu_66183b'),
//	Keys.chord(Keys.ENTER))

TestObject searchBox = new TestObject()
searchBox.addProperty('xpath', ConditionType.EQUALS, "//input[contains(@id, 'xui.UI.Input-INPUT:f:')]")

WebUI.setText(searchBox, '370-3-0011596-6')

WebUI.sendKeys(searchBox, Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/input_Kode Blokir_xui.UI.ComboInput-INPUTn'))
//
//WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_01 - JAMINAN'))

TestObject KodeBlokir = new TestObject("KodeBlokir")
KodeBlokir.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:w:")

WebUI.waitForElementClickable(KodeBlokir, 10)
WebUI.click(KodeBlokir)
WebUI.delay(1)

TestObject optionKodeBlokir = new TestObject("optionKodeBlokir")
optionKodeBlokir.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='01 - JAMINAN']")

WebUI.waitForElementClickable(optionKodeBlokir, 10)
WebUI.click(optionKodeBlokir)
WebUI.delay(1)

//WebUI.setText(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/input_Referensi_xui.UI.ComboInput-INPUTm'), 
//    '998')

TestObject inputReferensi = new TestObject('inputReferensi')
inputReferensi.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:x:']")

WebUI.waitForElementVisible(inputReferensi, 10)
WebUI.waitForElementClickable(inputReferensi, 10)

WebUI.setText(inputReferensi, "998")
WebUI.sendKeys(inputReferensi, Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_Simpan'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//span[@id='xui.UI.Button-CAPTION:ag:']"))

WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_Ya'))

WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_O K_1'))

WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/BlokirDanaTabungan/BlokirRekDeposito/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

