package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='q']") private WebElement searchbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement gobtn;
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']") private WebElement xbtn;
	public HomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void clickxbtn()
	{
		xbtn.click();
	}
	public void entersearchtext()
	{
		searchbox.sendKeys(" iPhone XR (64GB) - Yellow");
	}

	public void clickgobtn()
	{
		gobtn.click();
	}


}
