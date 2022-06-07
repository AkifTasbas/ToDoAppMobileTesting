package check24.step_definitions;

import check24.utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BeforeAfterClass {

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        Driver.getDriver();
        System.out.println("\tSuccesfully connected to Native App");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){

        Driver.closeDriver();
        System.out.println("\tThe App closed succesfully ");

    }

}
