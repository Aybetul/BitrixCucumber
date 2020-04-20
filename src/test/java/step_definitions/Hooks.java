package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("Test setup");
    }
    @Before("@hr")
    public void specialSetup(){
        System.out.println("Set up for hr only");
    }
    @After
    public void specialTearDown(){
        System.out.println("Tear down for hr only");
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot= (TakesScreenshot) Driver.getDriver();
            byte[]image=takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image,"image/png",scenario.getName());
        }
        System.out.println("Test clean up");
        Driver.closeDriver();
    }

}
