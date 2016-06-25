package Sample;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {

  public void f(String test) {
	  WebDriver driver = new FirefoxDriver();
		driver.get("http://www.lufthansa.com/ua/en/Homepage#");
		driver.manage().window().maximize();
		//@SuppressWarnings("unused")
		//@SuppressWarnings("unused")
		//@SuppressWarnings("unused")
		String st=driver.getTitle();
		String gt="Ready for";
		Assert.assertEquals(st,gt);
		System.out.println(test);
		driver.quit();
  }
}
