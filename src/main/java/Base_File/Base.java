package Base_File;



import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;



public class Base {

	public static void main(String[] args) throws MalformedURLException {
		

			 DesiredCapabilities capabilities = new DesiredCapabilities();
				
				capabilities.setCapability("DeviceName", "Pixel");
				capabilities.setCapability("Platform", "Android");
				capabilities.setCapability("automationName", "uiautomator");
				capabilities.setCapability("App", "C:\\Users\\aimam\\Downloads\\app-release.apk");
				capabilities.setCapability("Platform", "14");
				
				URL url = URI.create("http://127.0.0.1:4723/").toURL();
				
				AndroidDriver driver = new AndroidDriver(url, capabilities);
				
				driver.quit();
					


			//	AndroidDriver driver = new AndroidDriver(capabilities);
				
				


		}


	}


