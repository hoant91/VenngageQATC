import object.Account;
import pages.TemplatesPate;
import pages.SignInPage;
import pages.SignUpPage;
import pages.OnBoardingPage;

public class TestSignUp {
	
	private Account account;
	private IndividualTemplatesPage templatesPage;
	private SignInPage signIpnPage;
	private SignUpPage signUpPage;
	private OnBoardingPage onBoardingPage;
	private String firstName, lastName, email, password;

	@Before
	public void setUp(){
		// Instantiate page objects here
		selenium.goToUrl("https://venngage.com/templates/");
		templatesPage = new IndividualTemplatesPage()
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		//Creat test data
		firstName = QA;
		lastName = Test;
		int randomInt = selenium.randomInt();
		email = String.format("qa.test%d@venngage.com",randomInt);
		password = "123456";
		account = new Account(firstName,lastName, email, password);
		//Click on SignIn button
		templatesPage.clickToSignInButton();
		signInPage = new SignInPage();

		//Click on SignUp Link
		signInPage.clickToSignUpButton();
		signUpPage = new SignUpPage();

		//Input account information
		signUpPage.registerAccount(account);

		//Verify that registration is successful
		onBoardingPage = new OnBoardingPage();
		String expectedText = String.format("Let's personalize your page, %s!",account.firstName);
		String actualText = onBoardingPage.getPageTitleText();
		Assert.assertEquals(actualText, expectedText);
	}
}
