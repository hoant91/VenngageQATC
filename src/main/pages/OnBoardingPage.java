public class OnBoardingPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String pageTitle = "//div[@class = 'styles__greeting--3psym']/h3";
	
	public OnBoardingPage(){
		this.selenium = Selenium();
	}

	/**
	 * Get The pageTitle after user sign up successfully
	 * @return
	 */
	public String getPageTitleText(){
		selenium.waitToElementVisible(pageTitle);
		return selenium.getTextInElement(pageTitle);
	}
}