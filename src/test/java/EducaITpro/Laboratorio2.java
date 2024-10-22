package EducaITpro;


import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laboratorio2 {

	@Test
	public void lab2_e1() {
	System.setProperty("webdriver.chrome.driver", "..\\EducaITPro\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	driver.manage().window().maximize();
	
	WebElement txt_Email=driver.findElement(By.id("email_create"));
	txt_Email.sendKeys("micorreo"+Math.random()+"@correo.com");

	WebElement btn_Create=driver.findElement(By.name("SubmitCreate"));
	btn_Create.click();

	
	WebDriverWait mywait=new WebDriverWait(driver,10);

	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'id_gender1')]")));
	driver.findElement(By.id("id_gender1")).click();
	WebElement txt_FirstName=driver.findElement(By.name("customer_firstname"));
	txt_FirstName.sendKeys("Juan Cruz");
	WebElement txt_Password=driver.findElement(By.name("passwd"));
	txt_Password.sendKeys("123456");
	Select drp_Months=new Select(driver.findElement(By.id("months")));
	drp_Months.selectByValue("4");	
    WebElement btn_Register=driver.findElement(By.xpath("//*[text()='Register']"));
    btn_Register.click();
    driver.close();
	
	
	
	}
	
}
