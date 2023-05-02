package StepDefinitions;

import DriverUtil.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void open(){
        Driver.initDriver();
    }
    @After
    public void close(){
        Driver.tearDown();
    }
}
