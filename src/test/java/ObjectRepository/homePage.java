package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	WebDriver driver;
	public homePage(WebDriver driver)
	{
		this.driver = driver;
	}
	By profileIcon = By.xpath("//div[@id='u_0_a']/div/div/div/a");
	By cancelNotification = By.xpath("//a[@action='cancel']");
	
	public WebElement profileIcon()
	{
		return driver.findElement(profileIcon);
	}
	public WebElement cancelNotification()
	{
		return driver.findElement(cancelNotification);
	}
}
