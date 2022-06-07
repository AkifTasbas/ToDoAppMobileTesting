package check24.utilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static AppiumDriver<MobileElement> driver;

    public Driver() throws MalformedURLException, InterruptedException {
    }

    public static AppiumDriver<MobileElement> getDriver() throws InterruptedException, MalformedURLException {
        if (driver == null) {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            //we use android phone
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            //version of android
            desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "8.0");
            //name of the device, if it is real device we need to pass UUID parameter
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");

            //either you specify app--> //path/to/app.apk
            //or if app is already installed, you need to specify appActivity and appPackage
            //this info you can find in the internet, at work - ask to developers

            // Set your application's package name.
            desiredCapabilities.setCapability("appPackage", "com.example.yeshasprabhakar.todo");
            // Set your application's MainActivity i.e. the LAUNCHER activity name.
            desiredCapabilities.setCapability("appActivity", "com.example.yeshasprabhakar.todo.MainActivity");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        /*"http://localhost:4723/wd/hub" --> address of the appium server. If you have appium server on the same computer
        just use local host
        4723-->default port number
        we need to provide 2 parameters: URL of appium servers and desired capabilities

        */
            driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

            Thread.sleep(3000);
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            //close the app at the end
            driver.closeApp();
            driver.resetApp();
        }
    }

}
