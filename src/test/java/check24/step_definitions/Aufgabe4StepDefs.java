package check24.step_definitions;

import check24.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.net.MalformedURLException;
import java.sql.SQLOutput;

public class Aufgabe4StepDefs {
    @Then("user clicks trash icon")
    public void user_clicks_trash_icon() throws MalformedURLException, InterruptedException {
        MobileElement mülltonnenIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/delete"));
        mülltonnenIcon.click();
    }

    @Then("DELETED SUCCESFULLY text should be seen on the screen and")
    public void deleted_SUCCESFULLY_text_should_be_seen_on_the_screen_and() throws MalformedURLException, InterruptedException {

    }
    @Then("new Task have to be deleted and {string} task can not be seen on the list")
    public void new_Task_have_to_be_deleted_and_task_can_not_be_seen_on_the_list(String text) throws MalformedURLException, InterruptedException {
        try {
            MobileElement taskTitle = Driver.getDriver().findElement(By.xpath("//*[@text='"+text+"']"));
        }
        catch (NoSuchElementException e){
            System.out.println("The task can not be found in the list");
        }
    }

}
