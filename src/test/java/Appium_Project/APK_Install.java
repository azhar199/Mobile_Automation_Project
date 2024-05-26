package Appium_Project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class APK_Install {


	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("device name", "Poco");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "Uiautomator2");
		caps.setCapability("App", "C:\\Users\\aimam\\Downloads\\app-release.apk");
		caps.setCapability("PlatformVersion", "14");

		//caps.setCapability("AppPakage",  "");
		//	caps.setCapability("AppActivity", "" );


		URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();		

		//AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);

		AndroidDriver driver = new AndroidDriver(url, caps);


driver.findElement(By.xpath("android.view.View[@content-desc=Not a member yet? Register Now.")).click();


		//WebElement Pswd = driver.findElements(By.className("android.widget.EditText")).get(1);

		//Pswd.sendKeys("Azhar@786");


	//	WebElement Drive_in = driver.findElements(By.className("android.widget.Button")).get(2);


	//	Drive_in.click();





















	}

}
