package pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import org.testng.Assert;

public class Laboratorio5_e4 {

	WebDriver driver;

	String URL="https://demo.guru99.com/test/table.html";
	String PATH="..\\EducaITPro\\Drivers\\chromedriver.exe";


	@BeforeSuite
	public void setUp() {

	    System.setProperty("webdriver.chrome.driver", PATH);
	    driver=new ChromeDriver();
	    driver.get(URL);
	    driver.manage().window().maximize();
	}


	@AfterSuite
	public void cierreNavegador() {

	driver.quit();

	}

	   @Test
	   public void verCelda() throws InterruptedException {
		   
		   WebElement verCelda = driver.findElement(By.xpath("//tbody/tr[4]/td[3]"));
		   Assert.assertEquals(verCelda.getText(), "8");

	   }
	
}
