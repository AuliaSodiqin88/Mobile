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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\benja\\Downloads\\TenjiApp (2)\\TenjiApp.apk', true)

Mobile.tap(findTestObject('Video/android.widget.TextView0 - G12 Chemistry'), 0)

Mobile.verifyElementExist(findTestObject('Video/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('Video/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Video/android.widget.TextView0 - G12 Japanese Classics'), 0)

Mobile.verifyElementExist(findTestObject('Video/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('Video/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Video/android.widget.TextView0 - G12 English'), 0)

Mobile.verifyElementExist(findTestObject('Video/android.view.View0'), 0)

Mobile.tap(findTestObject('Video/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Video/android.widget.TextView0 - G12 Math'), 0)

Mobile.verifyElementExist(findTestObject('Video/android.view.View0'), 0)

Mobile.tap(findTestObject('Video/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Video/android.widget.TextView0 - G12 Japanese History'), 0)

Mobile.verifyElementExist(findTestObject('Video/android.view.View0'), 0)

Mobile.tap(findTestObject('Video/android.widget.ImageButton0'), 0)

Mobile.closeApplication()

