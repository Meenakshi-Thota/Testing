package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class SearchHotel {
	WebDriver driver;
	public SearchHotel(WebDriver driver) {
		this.driver=driver;
	}
	By loc=By.id("location");
	//By hotel=
	public void Location(String location) {
		
		WebElement dropdown = driver.findElement(loc);
		Select select_loc=new Select(dropdown);
		select_loc.selectByVisibleText(location);
		
		WebElement dropdown1=driver.findElement(loc);
	}
	

}
