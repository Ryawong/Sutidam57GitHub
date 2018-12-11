import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Email Address _EMAIL'), 'luna.deedy04@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ -/input_Password _PASSWORD'), 'xwcXwshO6zjo6TcEJGQvTw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ -/input_Confirm Password _passwo'), 'xwcXwshO6zjo6TcEJGQvTw==')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_First Name Thai _FIRST_N'), 'นางสาวเทส')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Last Name Thai _LAST_NAM'), 'นามสกุลเทส')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_First Name Eng _FIRST_NA'), 'firstnametest')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Last Name Eng _LAST_NAME'), 'lastnametest')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_Select ReligionBuddhism'), 'พุทธ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_Select Educational Back'), 'ปริญญาตรี', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_Select OccupationFarmer'), 'นักศึกษา', true)

WebUI.setText(findTestObject('Object Repository/Page_ -/input_House No _ADDRESS_NO'), '99')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Village No. _ADDRESS_MOO'), '9')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_Select Province'), '38', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_ () () ()'), '574', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_'), '31385', true)

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Postal Code _ADDRESS_POS'), '50180')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_  Select Currently Stat'), 'กำลังศึกษา', true)

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Home Address _ADDRESS_AL'), 'เลขที่ 99 หมู่ 9  จ.เชียงใหม่')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Phone Number _PHONE'), '')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Mobile Number _CELL_PHON'), '0912345678')

WebUI.click(findTestObject('Object Repository/Page_ -/input_Fax Number _submit'))

WebUI.closeBrowser()

