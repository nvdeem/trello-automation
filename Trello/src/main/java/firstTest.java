import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	WebDriver webDriver;

	public static void main(String[] args) throws InterruptedException {
		String exePath = "C:\\Users\\nadeem.ahmed\\eclipse-workspace\\Trello\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.trello.com/login");
		
		// Logs into Trello using the test account details
		driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("natest151@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Selen1um!");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

		// Assertion 1 - Checks if user is on Boards page
		String pageTitle = driver.getTitle();
		if (pageTitle != "Boards | Trello") {
			System.out.println("Checkpoint 1 - Boards page.");
		} else {
			System.out.println("This is not the Boards page.");
		}

		// Wait on page for 5 seconds
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Adds a board, names it, then clicks "Create Board"
		driver.findElement(By.xpath("//div[@class='board-tile mod-add']")).click();
		driver.findElement(By.xpath("//input[@class='subtle-input']")).sendKeys("My Test Board");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Adds a list, names it, then clicks "Add List"
		// driver.findElement(By.xpath("//span[text() = 'Add a list']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("List 1");
		driver.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']")).click();

		// List 2
		driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("List 2");
		driver.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']")).click();

		// Adds a card
		driver.findElement(By.xpath("//span[@class='js-add-a-card']")).click();
		driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']"))
				.sendKeys("This is a test card");
		driver.findElement(By.xpath("//input[@class='primary confirm mod-compact js-add-card']")).click();

		// Deletes board
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='board-menu-navigation-item-link js-open-more']")).click();
		driver.findElement(By.xpath("//a[@class='board-menu-navigation-item-link js-close-board']")).click();
		driver.findElement(By.xpath("//input[@class='js-confirm full negate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='quiet js-delete']")).click();
		driver.findElement(By.xpath("//input[@class='js-confirm full negate']")).click();
		Thread.sleep(2000);

		// Closes driver
		driver.close();
	}
}
