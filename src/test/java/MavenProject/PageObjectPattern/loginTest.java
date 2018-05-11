package MavenProject.PageObjectPattern;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectRepository.homePage;
import ObjectRepository.loginPage;
import ObjectRepository.homePagePOF;
import ObjectRepository.loginPagePOF;


public class loginTest {
	private static Logger log=LogManager.getLogger(loginTest.class.getName());
	@Test
	@Parameters({"username","password"})
	public void login(String username, String password) {
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Documents/Selenium-eclipse-files/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//****Using Page Object Factory
		loginPagePOF login= new loginPagePOF(driver);
		homePagePOF home= new homePagePOF(driver);
		//****Using normal page object pattern
		//loginPage login= new loginPage(driver);
		//homePage home= new homePage(driver);
		
		login.username().sendKeys(username);
		login.password().sendKeys(password);
		login.LoginButton().click();
		log.info("Successfull login");
		home.cancelNotification().click();
		
		home.profileIcon().click();
		
	
	}
}
