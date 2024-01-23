package stepDefinitions;

import com.flamingo.driver.DriverManager;
import com.flamingo.enums.PropertyfileController;
import com.flamingo.framework.Waits;
import com.flamingo.pom.HRMOrangeLoginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.PropertyFileHandler;

public class HRMOrangeLoginTest {
	
	@Given("logged to HRMOrange Website")
	public void logged_to_hrm_orange_website() {
		
	    DriverManager.getDriver().get(PropertyFileHandler.getPropertyValue(PropertyfileController.URL.toString()));
	}
	@Then("enter username {string} and password {string} and submit")
	public void enter_username_and_password_and_submit(String username, String password) {
		
		HRMOrangeLoginpage hrmOrangeLoginpage=new HRMOrangeLoginpage( DriverManager.getDriver());
		Waits.waitUntilElementLocated(10,hrmOrangeLoginpage.userNametextbox);
		hrmOrangeLoginpage.enteruserName(username);
		Waits.waitUntilElementLocated(10,hrmOrangeLoginpage.passwordtextbox);
		hrmOrangeLoginpage.enterpassword(password);
		Waits.waitUntilElementLocated(10,hrmOrangeLoginpage.submitbutton);
		hrmOrangeLoginpage.presssubmit();
	}

}
