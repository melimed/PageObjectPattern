package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	By username = By.cssSelector("#email");
	By password = By.cssSelector("#pass");
	By LoginButton = By.cssSelector("input[value='Iniciar sesión']");
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement LoginButton()
	{
		return driver.findElement(LoginButton);
	}
	

}
