package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {

	WebDriver driver;

	public RediffLoginPageFactory(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	

	public WebElement Username() {
		return username;
	}

	

}
