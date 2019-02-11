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
	
	public void login(String email, String pass) {
		webAdapter
			.search("email")
			.whichRepresents("ID")
			.then()
			.addText(email);
		
		webAdapter
			.search("password")
			.whichRepresents("ID")
			.then()
			.addText(pass);
		
		webAdapter
			.search("btn-submit")
			.whichRepresents("ID")
			.then()
			.select();
	}
}