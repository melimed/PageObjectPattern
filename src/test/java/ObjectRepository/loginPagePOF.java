package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPagePOF {
	
	WebDriver driver;
	public loginPagePOF(WebDriver driver)
	{
		this.driver= driver;
		//need pagefactory.initelements to initializes the elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#email")
	WebElement username;
	
	@FindBy(css="#pass")
	WebElement password;
	
	@FindBy(css="input[value='Iniciar sesión']")
	WebElement LoginButton;
	
	
	
	public WebElement username()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement LoginButton()
	{
		return LoginButton;
	}
	

}
