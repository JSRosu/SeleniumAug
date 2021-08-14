package selenium.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		// wait for 10 secs to avoid unnecessary exceptions

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		// step 5: locate username and type username in the webpage as demosalesmanager

		WebElement webUser = driver.findElement(By.id("username")); // this will locate

		webUser.sendKeys("demosalesmanager"); // this will type the username

		// step 6: locate password and enter the paswrd as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// step 7: locate login button and click on it.

		driver.findElement(By.className("decorativeSubmit")).click();

		// click on the login button CRM/SFA hyperlink

		driver.findElement(By.linkText("CRM/SFA")).click();
		// click leads

		driver.findElement(By.linkText("Leads")).click();

		// Click create lead

		driver.findElement(By.linkText("Create Lead")).click();

		// enter company name

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// enter firstname

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeba");

		// enter lastname

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Roslin");

		// click create lead button

		driver.findElement(By.className("smallSubmit")).click();

		// dropdown

	}

}
