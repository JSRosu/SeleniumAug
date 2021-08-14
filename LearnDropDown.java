package selenium.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		
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

		// dropdown
		
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select drpDwn = new Select(drop1);
drpDwn.selectByIndex(1);

WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dropDown = new Select(drop2);
dropDown.selectByIndex(10);

int NumOfList = drpDwn.getOptions().size();
System.out.println("The nmber is : " + NumOfList);
	}

}
