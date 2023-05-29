package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CourseConsumption {

	@FindBy(how=How.XPATH,using="//input[@title='Search or enter QR code']")
	private WebElement searchtextfield;
	
	@FindBy(how=How.XPATH,using="//button[text()='Search']")
	private WebElement searchbutton;
	
	@FindBy(how=How.XPATH,using="//bdi[contains(text(),'Course')]")
	private WebElement searchedcourse;
	
	@FindBy(how=How.XPATH,using="//button[text()='Join Course']")
	private WebElement joincourse;
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement consentcheckbox;
	
	@FindBy(how=How.XPATH,using="//button[text()='Share']")
	private WebElement shareButton;
	
	@FindBy(how=How.XPATH,using="//button[text()='Start learning']")
	private WebElement startLearning;
	
	
	
}
