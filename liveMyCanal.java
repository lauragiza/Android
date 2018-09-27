package Testandroid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class liveMyCanal {

	//public WebDriver driver;
	AndroidDriver driver;
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
         public void metoda2() throws InterruptedException {
        	Thread.sleep(4000); 
        	driver.findElement(By.className("android.widget.ImageButton")).click();//menu
        	
        	Thread.sleep(4000); 
        	driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")).click();//menu live
        	Thread.sleep(4000);
        	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView")).click();
        	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.View/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ImageView")).click();//wybranie c8
        	
        	Thread.sleep(16000);
        	driver.pressKeyCode(AndroidKeyCode.BACK);//cofniecie
        	Thread.sleep(4000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.View/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.ImageView")).click();
            Thread.sleep(16000);
            driver.pressKeyCode(AndroidKeyCode.BACK);//cofniecie
            Thread.sleep(4000);
            
         }
@After
public void met() {
	driver.quit();
}
}
