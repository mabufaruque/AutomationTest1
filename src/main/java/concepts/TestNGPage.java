package concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class TestNGPage {

	WebDriver driver;
	By AddCategory = By.xpath("//*[@id=\"extra\"]/select[1]");
	By Button = By.xpath("//*[@id=\"extra\"]/input[2]");
	By ExpensiveItemElement = By.xpath("/html/body/div[3]/a[7]/span");

	public void launch() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/102/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
