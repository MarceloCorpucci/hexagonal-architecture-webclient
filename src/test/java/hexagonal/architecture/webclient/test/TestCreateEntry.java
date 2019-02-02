package hexagonal.architecture.webclient.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTManager;
import hexagonal.architecture.sample.domain.core.WebManager;
import hexagonal.architecture.sample.framework.WebAdapter;
import hexagonal.architecture.webclient.pageobject.LoginPageObject;

public class TestCreateEntry  {
	private WebAdapter webAdapter;
	private LoginPageObject loginPage;
	
	@Before
	public void setUp() {
		SUTManager webManager = new WebManager();
		SUTClient sutClient = webManager.useApplication("CHROME");
		webAdapter = new WebAdapter(sutClient);
		
	}
	
	@Test
	public void postIsSuccessfull() {
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
	
	@After
	public void tearDown() {
		webAdapter.close();
	}
	
}
