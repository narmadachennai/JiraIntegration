package stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.testng.Assert;


public class sample {

    @Given("^ execute simple testing$")
    public void execute_simple_testing() {
        System.out.println("Heloo");
        throw new PendingException();
    }


    @Given("^first test$")
    public void firstTest() {
          System.out.println("what is happening First !!!");
        Assert.assertEquals("true","true");
    }

    @Given("^second test$")
    public void secondTest() {
        System.out.println("what is happening second !!!");
    }

    @Given("^third test$")
    public void thirdTest() {
        System.out.println("what is happening Third !!!");
    }
}