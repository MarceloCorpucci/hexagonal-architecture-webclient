package hexagonal.architecture.webclient;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTManager;
import hexagonal.architecture.sample.domain.core.WebManager;
import hexagonal.architecture.sample.framework.WebAdapter;

public class TestCreateEntry  {
	private LoginPageObject loginPage;
	
	@Test
	public void postIsSuccessfull() {
		SUTManager webManager = new WebManager();
		SUTClient sutClient = webManager.useApplication("CHROME");
		WebAdapter webAdapter = new WebAdapter(sutClient);
		
		loginPage = new LoginPageObject(webAdapter);
		loginPage.load("http://www.google.com");
//		
//		String currentMessage = loginPage
//									.login("admin1@gmail.com", "admin1")
//									.goToCreateEntry()
//									.createEntry("My newest post", "This is a post.")
//									.getResultMessage();
//		
//		assertTrue(currentMessage.contains("Entry 'My newest post' created successfully."));
	}
}
