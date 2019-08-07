import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
	
	static WebDriver webDriver;
	
	public static WebDriver getDriver() {
		return webDriver;
	}
	
	public void startDriver() {
		String exePath = "C:\\Users\\nadeem.ahmed\\eclipse-workspace\\Trello\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.trello.com/login");
	}
}
