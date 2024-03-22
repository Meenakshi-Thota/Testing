package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelApp {

	//public static void main(String[] args) {
		WebDriver driver;
		public HotelApp(WebDriver driver) {
			this.driver=driver;
			System.out.println("driver");
		}
		By uname=By.id("username");
		By pw=By.id("password");
		By log=By.id("login");
		
		public void EnterUsername(String username) {
			driver.findElement(uname).sendKeys(username);
		}
		public void EnterPassword(String password) {
			driver.findElement(pw).sendKeys(password);
		}
		public void Login() {
			driver.findElement(log).click();
		}
		
		
		// TODO Auto-generated method stub

	//}

}
