package core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MobileInstance {
	protected AppiumDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities Mobile = new DesiredCapabilities();
		Mobile.setCapability("deviceName", "Pixel 4");
		Mobile.setCapability("platformName", "Android");
		Mobile.setCapability("automationName", "uiAutomator2");
		Mobile.setCapability("udid", "emulator-5554");
		Mobile.setCapability("platformVersion", "11.0");
		Mobile.setCapability("app", "C:\\Users\\Lenovo\\Desktop\\Framework\\avis\\avis-mobile-framework\\avisapp\\Avis-Session-25March-UAT.apk");

	    driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), Mobile);
	}
}