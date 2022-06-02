package check24.step_definitions;

import check24.utilities.Driver;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Aufgabe3StepDefs {
    @Then("error message should be seen on the screen")
    public void error_message_should_be_seen_on_the_screen() throws IOException, InterruptedException {
        Thread.sleep(2000);
        File file  = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("ScreenshotFehlerMeldung.jpg"));
    }
}
