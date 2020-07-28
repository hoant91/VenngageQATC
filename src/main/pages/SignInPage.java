public class SignInPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String signUpLink = "//a[text() = 'Sign up']";
	
	public SignInPage(){
		this.selenium = Selenium();
	}

	/**
	 * Click on the Sign Up link
	 */
	public void clickToSignUpButton(){
		selenium.waitToElementVisible(signInButton);
		selenium.clickByXpath(signInButton);
	}
	
}