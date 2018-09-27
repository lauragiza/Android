package Testandroid;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchMyCanal {
	public WebDriver driver;
    // public static void main(String[] args) throws InterruptedException {
         @Before
         public void metoda() throws MalformedURLException {
             //Set the Desired Capabilities
             DesiredCapabilities caps = new DesiredCapabilities();
             caps.setCapability("deviceName", "My Phone");
             caps.setCapability("udid", "W3D7N15B11003471"); //Give Device ID of your mobile phone
             caps.setCapability("platformName", "Android");
             caps.setCapability("platformVersion", "6.0");
             caps.setCapability("appPackage", "com.canal.android.canal");
             caps.setCapability("appActivity", "com.canal.android.canal.MainActivity");
             caps.setCapability("noReset", "true");
             
             //Instantiate Appium Driver
          
                             driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
           
         }
   //  }
         @Test
         public void metoda1() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.className("android.widget.ImageButton")).click();//menu
	WebElement el;
	el = driver.findElement(By.id("com.canal.android.canal:id/titleBar"));//wyszukaj
	el.click();
	el.sendKeys("Sarah Lind");//wpisanie frazy
	Thread.sleep(2000); 
	driver.findElement(By.id("com.canal.android.canal:id/btnContainer")).click();//klikniecie w pierwsza pod spodem
	Thread.sleep(4000); 
	WebElement d =  driver.findElement(By.id("com.canal.android.canal:id/title"));
	d.click();//wejscie w szukana fraze
	//WebElement scroll= driver.findElement(By.xpath("com.canal.android.canal:id/title"));
	Thread.sleep(9000); 
	//TouchActions flick = new TouchActions(driver).flick(scroll,-100, 0, 0);
	//flick.perform();
         }
         
         @After
         public void met() {
         	driver.quit();
         }
}
