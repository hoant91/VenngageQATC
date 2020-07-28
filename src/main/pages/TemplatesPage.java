public class IndividualTemplatesPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String signInButton = "//a[text() ='Sign In']";
	
	public IndividualTemplatesPage(){
		this.selenium = Selenium();
	}
	// Create a function that clicks on the Sign Up button

	/**
	 * Click on the Sign In button
	 */
	public void clickToSignInButton(){
		selenium.waitToElementVisible(signInButton);
		selenium.clickByXpath(signInButton);
	}
}