package selenium.practice.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\felix\\eclipse-workspace\\selenium.practice\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();



	}
}