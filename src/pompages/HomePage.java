package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
private WebDriver driver;
@FindBy(xpath="//input[@id='twotabsearchtextbox']") private WebElement searchbox;
@FindBy(xpath="//input[@value='Go']") private WebElement gobtn;
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	this.driver=driver;
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
