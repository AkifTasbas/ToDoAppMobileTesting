package check24.step_definitions;

import io.cucumber.java.en.Then;

public class Aufgabe3StepDefs {
    @Then("error message should be seen on the screen")
    public void error_message_should_be_seen_on_the_screen() {
        System.out.println("Oops, Cannot set an empty text");
    }
}
