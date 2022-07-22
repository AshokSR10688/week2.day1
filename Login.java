package week2.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ashok");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S R");
//handle the dropdown
WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select drop1=new Select(source);
drop1.selectByIndex(8);
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ashok");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing with Selenium + JAVA");
String title = driver.getTitle();
System.out.println(title);
	}

}
