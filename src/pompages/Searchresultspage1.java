package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Searchresultspage1 {
	private WebDriver driver;
	@FindBy(xpath="//div[text()='Apple iPhone XR (Yellow, 64 GB)']/../../descendant::div[@class='_1vC4OE _2rQ-NK']") private WebElement fprice;

	public Searchresultspage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	public static String trrim2(String str)
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


	public String getprice()
	{
		Reporter.log("The price of iPhone XR (64GB) - Yellow from Flipkart",true);
		String price=fprice.getText();
		return price;
	}

}
