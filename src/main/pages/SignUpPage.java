public class SignUpPage {
	
	private Selenium selenium;

	// Add XPaths here
	private static final String firstNameTextbox = "//input[@id = 'user_first_name']";
	private static final String lastNameTextbox = "//input[@id = 'user_last_name']";
	private static final String emailTextbox = "//input[@id = 'user_email']";
	private static final String passwordTextbox = "//input[@id = 'user_password']";
	private static final String signUpButton = "//button[@id = 'btn_register']";

	public SignUpPage(){
		this.selenium = Selenium();
	}

	public void inputToFirstNameTextbox(String firstName) {
		selenium.waitToElementVisible(firstNameTextbox);
		sendKeys(firstNameTextbox, firstName);
	}

	public void inputToLastNameTextbox(String lastName) {
		selenium.waitToElementVisible(lastNameTextbox);
		selenium.sendKeys(lastNameTextbox, lastName);
	}

	public void inputToEmailTextbox(String email) {
		selenium.waitToElementVisible(emailTextbox);
		selenium.sendKeys(emailTextbox, email);
	}
	public void inputToPasswordTextbox(String password) {
		selenium.waitToElementVisible(passwordTextbox);
		selenium.sendKeys(passwordTextbox, password);
	}

	public void clickToSignUpButton() {
		selenium.waitToElementVisible(signUpButton);
		selenium.clickByXpath(signUpButton);
	}

	public void registerAccount(Account account){
		inputToFirstNameTextbox(account.firstName);
		inputToLastNameTextbox(account.lastName);
		inputToEmailTextbox(account.email);
		inputToPasswordTextbox(account.password);
		clickToSignUpButton();
	}
}