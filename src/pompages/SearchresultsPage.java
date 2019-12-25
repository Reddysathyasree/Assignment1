package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SearchresultsPage
{
	private WebDriver driver;
@FindBy(xpath="//span[contains(text(),'Apple iPhone XR (64GB) - Yellow')]/../../../../../../../descendant::span[@class='a-price-whole']") private WebElement aprice;

public SearchresultsPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	this.driver=driver;
}


public String getprice()
{
	Reporter.log("The price of iPhone XR (64GB) - Yellow from Amazon",true);
	String price=aprice.getText();
	return price;
}

public String trrim2(String str)
{
	char[] ch=str.toCharArray();
	String str2="";
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==',')
			{
			str2=str2+" ";
			}
		else
		{
			str2=str2+ch[i];
		}
		
	}
	return str2;
		
}

}
