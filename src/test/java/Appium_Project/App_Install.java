package Appium_Project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class App_Install {
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("device name", "Poco");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "Uiautomator2");
		caps.setCapability("App", "C:\\Users\\aimam\\Downloads\\app-release.apk");
		caps.setCapability("PlatformVersion", "14");
		
	//	caps.setCapability("AppPakage",  "com.parkspot.maya_nagri");
	//	caps.setCapability("AppActivity", "com.parkspot.maya_nagri.MainActivity" );
		
		
		URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();		
		
		//AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
		AndroidDriver driver = new AndroidDriver(url, caps);
		
		
		//driver.findElements(By.id("android:id/text1")).get(11).click();
		//driver.quit();
		
		
		
		
		
	
	}

}
