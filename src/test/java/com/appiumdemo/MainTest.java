package com.appiumdemo;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
 import org.openqa.selenium.support.ui.WebDriverWait;
import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;
 import org.junit.Test;

 import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.junit.rules.TemporaryFolder;
import java.io.File;

import java.io.IOException;

public class MainTest {

// public static void main(String[] args) throws MalformedURLException {
// // TODO Auto-generated method stub

 

// DesiredCapabilities cap = new DesiredCapabilities();
// cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
// cap.setCapability(MobileCapabilityType.APP, "/Users/vaidika.vadhvaniya/Documents/AppiumDemo/android/app/build/outputs/apk/debug/app-debug.apk");
// AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);



// }

//  @Test
//     public void shouldAnswerWithTrue()
//     {
//       //  assertTrue( true );

//       ScriptEngineManager manager = new ScriptEngineManager();
// ScriptEngine engine = manager.getEngineByName("JavaScript");
// // read script file
// engine.eval(new FileReader("/Users/vaidika.vadhvaniya/Documents/AppiumDemo/__tests__/myTests.test.js"));
//   Invocable invocable = (Invocable) engine;
// // call function from script file
// //inv.invokeFunction("yourFunction", "param");
//     }


 @Rule
    public TemporaryFolder folder = new TemporaryFolder();
// public TemporaryFolder folder1 = new TemporaryFolder();
    @Test
    public void myTest() {
        // this folder gets cleaned up automatically by JUnit
         try {
        File file = folder.newFile("/Users/vaidika.vadhvaniya/Documents/AppiumDemo/__tests__/myTests.test.js");
     //   File file1 = folder1.newFile("/Users/vaidika.vadhvaniya/Documents/AppiumDemo/__tests__/App-test.js");
} catch(IOException e) {
      //  e.printStackTrace();
    }
        // populate the file
        // run your test
    }

    @Rule
    public TemporaryFolder folder1 = new TemporaryFolder();

    @Test
    public void appTest() {
        try {
               File file1 = folder1.newFile("/Users/vaidika.vadhvaniya/Documents/AppiumDemo/__tests__/App-test.js");
} catch(IOException e) {
      //  e.printStackTrace();
    }
        // populate the file
        // run your test
    }



 @Rule
     public TestWatcher watcher = Factory.createWatcher();
}

// import android.support.test.filters.LargeTest;
//     import android.support.test.rule.ActivityTestRule;
//     import android.support.test.runner.AndroidJUnit4;
    
//     import com.wix.detox.Detox;
    
//     import org.junit.Rule;
//     import org.junit.Test;
//     import org.junit.runner.RunWith;
    
//     @RunWith(AndroidJUnit4.class)
//     @LargeTest
//     public class MainTest {
    
//       @Rule
//       public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class, false, false);
    
//       @Test
//       public void runDetoxTests() throws InterruptedException {
//           Detox.runTests(mActivityRule);
//       }
//     }

// import io.appium.java_client.MobileElement;
// import io.appium.java_client.android.AndroidDriver;
// import java.net.MalformedURLException;
// import java.net.URL;
// import org.openqa.selenium.By;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.testng.Assert;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Test;
// public class MainTest {
//     public AndroidDriver<MobileElement> driver;
//     public WebDriverWait                wait;
//     //Elements By
//     By jobsBy           = By.id("com.isinolsun.app:id/rootRelativeView");
//     By allowWhenUsingBy = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
//     By searchingJobBy   = By.id("com.isinolsun.app:id/bluecollar_type_button");
//     By animationBy      = By.id("com.isinolsun.app:id/animation_view");
//     By toolBarTitleBy   = By.id("com.isinolsun.app:id/toolbarTitle");
//     @BeforeMethod
//     public void setup() throws MalformedURLException {
//         DesiredCapabilities caps = new DesiredCapabilities();
//         caps.setCapability("deviceName", "Pixel XL API 30");
//         caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
//         caps.setCapability("platformName", "Android");
//         caps.setCapability("platformVersion", "11.0");
//         caps.setCapability("skipUnlock", "true");
//         caps.setCapability("appPackage", "com.isinolsun.app");
//         caps.setCapability("appActivity", "com.isinolsun.app.activities.SplashActivity");
//         caps.setCapability("noReset", "false");
//         driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//         wait = new WebDriverWait(driver, 10);
//     }
//     @Test
//     public void basicTest() throws InterruptedException {
//         //Click and pass Splash
//         wait.until(ExpectedConditions.visibilityOfElementLocated(animationBy)).click();
//         //Click I am searching a job
//         wait.until(ExpectedConditions.visibilityOfElementLocated(searchingJobBy)).click();
//         //Notification Allow
//         if (wait.until(ExpectedConditions.visibilityOfElementLocated(allowWhenUsingBy)).isDisplayed()) {
//             wait.until(ExpectedConditions.visibilityOfElementLocated(allowWhenUsingBy)).click();
//         }
//         //Click Second Job
//         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(jobsBy)).get(1).click();
//         //Do a simple assertion
//         String toolBarTitleStr = wait.until(ExpectedConditions.visibilityOfElementLocated(toolBarTitleBy)).getText();
//         Assert.assertTrue(toolBarTitleStr.toLowerCase().contains("detay"));
//     }
//     @AfterMethod
//     public void teardown() {
//         driver.quit();
//     }
// }

// import static org.junit.Assert.assertTrue;
// import com.microsoft.appcenter.appium.Factory;
// import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
// import org.junit.rules.TestWatcher;
// import org.junit.Rule;
// import org.junit.Test;

// /**
//  * Unit test for simple App.
//  */
// public class MainTest 
// {
//     /**
//      * Rigorous Test :-)
//      */
//     @Test
//     public void shouldAnswerWithTrue()
//     {
//         assertTrue( true );
//     }

//     @Rule
//     public TestWatcher watcher = Factory.createWatcher();
// }



