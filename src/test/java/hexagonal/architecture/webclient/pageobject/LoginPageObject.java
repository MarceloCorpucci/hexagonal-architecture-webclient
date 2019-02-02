package hexagonal.architecture.webclient.pageobject;

import hexagonal.architecture.sample.framework.WebAdapter;

public class LoginPageObject {
	private WebAdapter webAdapter;
	
	public LoginPageObject(WebAdapter webAdapter) {
		this.webAdapter = webAdapter;
	}
	
	public LoginPageObject load(String url) {
		webAdapter.open(url);
		return this;
	}
	
//	public void login(String email, String pass) {
//		driver.open(email);
//		return new HomePageObject(driver);
//	}
}