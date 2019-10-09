import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MuliplicationStep
{
    Integer a,b,c = 0;
    @Given("I have variable a (\\d+)")
    public void setA(int a){
       this.a = a;
    }

    @Given("I have variable b (\\d+)")
    public void setB(int b){
        this.b = b;
    }

    @When("^I multiplication a and b$")
    public void cal(){
        c = a * b;
    }

    @Then("^I display the Result$")
    public void printResult(){
        assertEquals(c, 16);
    }
}