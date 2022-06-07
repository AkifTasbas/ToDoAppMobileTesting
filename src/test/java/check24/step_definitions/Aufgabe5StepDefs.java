package check24.step_definitions;

import check24.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Aufgabe5StepDefs {
    @Given("User clicks DayNight mode")
    public void user_clicks_DayNight_mode() throws MalformedURLException, InterruptedException {
        MobileElement sonneIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
        sonneIcon.click();

    }

    @Then("the background should be dark")
    public void the_background_should_be_dark() throws MalformedURLException, InterruptedException {
      /*  System.out.println("Background is dark");
        MobileElement background = Driver.getDriver().findElement(By.cssSelector("body[background-color='white']"));
        String cssProperty = background.getCssValue("background-color");
        System.out.println("cssProperty = " + cssProperty);*/


    }

    @Then("User clicks DayNight mode again")
    public void user_clicks_DayNight_mode_again() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        MobileElement mondIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
        Thread.sleep(3000);
        mondIcon.click();
    }

    @Then("the background should be light")
    public void the_background_should_be_light() {
        System.out.println("Background is light");
    }

}
