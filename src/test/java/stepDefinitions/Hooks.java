package stepDefinitions;

import com.flamingo.driver.DriverClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void driverInitialization()
	{
		DriverClass.initDriver();
	}
	@After
	public void teardowndriver()
	{
		DriverClass.tearDownDriver();
	}
}
	



