package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPage;

public class LoginApplication {

	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.Username().sendKeys("maheshkalluri686@gmail.com");
		rd.Password().sendKeys("Mahi@425.");
		rd.Login().click();
	}
}
