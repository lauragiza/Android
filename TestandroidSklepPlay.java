package Testandroid;




import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class TestandroidSklepPlay {
	//protected AndroidDriver driver;
	//public static RemoteWebDriver driver;
	//private static AndroidDriver driver;   
   // private static AppiumDriver driver;
 //AppiumDriver driver;
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
                caps.setCapability("appPackage", "com.android.vending");
                caps.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
                caps.setCapability("noReset", "true");
                
                //Instantiate Appium Driver
             
                                driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
              
            }
      //  }
            @Test
             public void test() throws InterruptedException {
        Thread.sleep(5000);
       
         driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]")).click();//wejscie w gry
       
           Thread.sleep(3000);
           driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[1]")).click();///wejœcie strona g³ówna
           Thread.sleep(3000);
           WebElement element;
          element = driver.findElement(By.id("com.android.vending:id/search_box_idle_text"));//klikniecie w pole wyszukaj
          element.click();
          Thread.sleep(3000);
         driver.findElement(By.id("com.android.vending:id/search_box_text_input")).sendKeys("player"); //wpisanie player w pole
          Thread.sleep(3000);
          driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[1]")).click();//wybranie pola pod wyszukiwaniem - pierwszego
          Thread.sleep(3000);
          driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Aplikacja: Player\"]")).click();//klikniecie w player
          Thread.sleep(3000);
          driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.View/android.widget.TextView")).click();
          Thread.sleep(3000);
          driver.findElement(By.id("com.android.vending:id/search_button")).click();//lupa 
          Thread.sleep(3000);
          WebElement newele;
          newele = driver.findElement(By.id("com.android.vending:id/search_box_text_input"));//klikniecie w pole wyszukiwania
          newele.click();
          newele.sendKeys("ncplusgo");///wpisanie frazy
          driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]")).click();//klikniecie w piersze wyszukane
          Thread.sleep(3000);
          driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"ITI Neovision\"])[1]")).click();
          Thread.sleep(3000);
          //zainstalowanie gry
          driver.findElement(By.id("com.android.vending:id/search_button")).click();//lupa 
          Thread.sleep(3000);
           newele = driver.findElement(By.id("com.android.vending:id/search_box_text_input"));//klikniecie w pole wyszukiwania
          newele.click();
          newele.sendKeys("gra pou");///wpisanie frazy
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]")).click();//klikniecie w piersze wyszukane
          Thread.sleep(3000);
          driver.findElement(By.id("Zakeh")).click();//wejscie w aplikacje
          Thread.sleep(3000);
          try {
          driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
          Thread.sleep(3000);
          driver.findElement(By.id("com.android.vending:id/continue_button")).click();
          Thread.sleep(5000);
          }
          catch (Exception e) {
        	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[1]")).click();
          Thread.sleep(3000);
          driver.findElement(By.id("android:id/button1")).click();
          //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.di/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
          Thread.sleep(5000);
        	  System.out.println("Zainstalowane ju¿");}
          
          Thread.sleep(6000);
          
            }    
        
            
       @After
     public void out() {
    	   driver.quit();
      }
      //  }
}