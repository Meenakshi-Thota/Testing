package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HotelApp;
import pages.SearchHotel;
public class NewTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://adactinhotelapp.com/");
	  HotelApp app=new HotelApp(driver);
	  app.EnterUsername("vasuvespag");
	  app.EnterPassword("vasu1234");
	  app.Login();
	  SearchHotel searchH=new SearchHotel(driver);
	  searchH.Location("Sydney");
	  
  }
}
