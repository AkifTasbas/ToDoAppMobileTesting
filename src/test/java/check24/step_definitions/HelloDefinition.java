package check24.step_definitions;

import io.cucumber.java.en.Given;

public class HelloDefinition {

    @Given("write Hello on the screen")
    public void write_Hello_on_the_screen() {
        System.out.println("Hello");
    }
}
