package Appium_Project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Appium_Basics {

	@Test
	
	public void AppiumTest() throws MalformedURLException, URISyntaxException
	{
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Poco");
		options.setApp("C:\\Users\\aimam\\Downloads\\ApiDemos-debug.apk");
		
		
		
	AndroidDriver driver = new AndroidDriver(new URI("http://127.0.01:4723/wd/hub").toURL(), options);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}
	
	
	
}
