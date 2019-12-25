package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericmethods.BaseClass1;
import pompages.HomePage1;
import pompages.Searchresultspage1;

public class FlipkartpriceTest extends BaseClass1 
{
	public static String flipkartprice;
	public static int flipkartphprice;
	@Test
	public void launchflipkart() throws InterruptedException

	{
	HomePage1 hp1=new HomePage1(driver);
	hp1.clickxbtn();
	hp1.entersearchtext();
	hp1.clickgobtn();
	Thread.sleep(3000);
	Searchresultspage1 fr=new Searchresultspage1(driver);
	flipkartprice=fr.getprice();
	String flipkartprice1=flipkartprice.substring(1);
	Reporter.log(flipkartprice1,true);
	int fprice=Integer.parseInt(Searchresultspage1.trrim2(flipkartprice1).trim().replaceAll("\\s+", ""));
	System.out.println(fprice);
	flipkartphprice=fprice;
	
	if( AmazonpriceTest.amazonphprice>FlipkartpriceTest.flipkartphprice)
	{
		Reporter.log("The price of iPhone XR (64GB) price is more in the Amazon website",true);
	}
	else
	{
		Reporter.log("The price of iPhone XR (64GB) price is more in the Flipkart website",true);
	}
    
	}
	}
