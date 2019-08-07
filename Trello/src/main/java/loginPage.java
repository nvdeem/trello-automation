import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public static WebElement email;
	public static WebElement password;
	public static WebElement loginBtn;
	
	public loginPage() {
		buildPage();
	}
	
	private static void buildPage() {
		email = driver.getDriver().findElement(By.xpath("//\"//*[@id=\\\"login\\\"]\"*[@id='user']"));
		password = driver.getDriver().findElement(By.xpath("//*[@id=\"password\"]"));
		loginBtn = driver.getDriver().findElement(By.xpath("//*[@id=\"login\"]"));
	}
	
}
