import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class ParserSteps
{
    @Given("^sample feature file is ready (\\d+)$")
    public void givenStatement(Integer a) {
        System.out.println("Given statement executed successfully" + a);
    }

    @When("^I run the feature file$")
    public void whenStatement(){
        System.out.println("When statement executed successfully");
    }

    @Then("^run should be successful$")
    public void thenStatement(){
        System.out.println("Then statement executed successfully");
    }
}