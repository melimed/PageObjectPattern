package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePagePOF {
	WebDriver driver;
	public homePagePOF(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='u_0_a']/div/div/div/a")
	WebElement profileIcon;
	@FindBy(xpath="//a[@action='cancel']")
	WebElement cancelNotification;
	
	public WebElement profileIcon()
	{
		return profileIcon;
	}
	public WebElement cancelNotification()
	{
		return cancelNotification;
	}
}
