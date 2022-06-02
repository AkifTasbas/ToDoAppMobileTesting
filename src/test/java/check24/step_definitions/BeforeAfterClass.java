package check24.step_definitions;

import check24.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class BeforeAfterClass {

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        System.out.println("\tSuccesfully connected with Native App");
        Driver.getDriver();

    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("\tThe App succesfully closed");
       // Driver.closeDriver();

    }

}
