package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericmethods.BaseClass;
import pompages.HomePage;
import pompages.HomePage1;
import pompages.SearchresultsPage;
import pompages.Searchresultspage1;

public class AmazonpriceTest extends BaseClass
{
public static String amazonprice;
public String flipkartprice;
public static int amazonphprice;

@Test(invocationCount=1,priority=0)
public void launchamazon() throws InterruptedException
{
	HomePage hp=new HomePage(driver);
	hp.entersearchtext();
	hp.clickgobtn();
	Thread.sleep(3000);
SearchresultsPage sr=new SearchresultsPage(driver);
 amazonprice=sr.getprice();

Reporter.log(amazonprice,true);


int aprice=Integer.parseInt(sr.trrim2(amazonprice).trim().replaceAll("\\s+", ""));
amazonphprice=aprice;
System.out.println(aprice);

}
}
