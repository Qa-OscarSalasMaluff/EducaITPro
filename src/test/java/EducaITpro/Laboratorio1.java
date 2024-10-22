package EducaITpro;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laboratorio1 {

	@Test
	public void holamundo() {
		
		System.out.println("Hola Mundo de Automatizacion");
	}
	
	@Ignore
	public void lab1_e1() {
		
		System.setProperty("webdriver.chrome.driver", "..\\EducaITPro\\Drivers\\chromedriver.exe"); //donde esta el driver
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.automationpractice.pl/index.php");
		driver.close();
	}
	
	@Test
	public void lab1_e2() {
		System.setProperty("webdriver.chrome.driver", "..\\EducaITPro\\Drivers\\chromedriver.exe"); //donde esta el driver
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		WebElement txt_Buscador = driver.findElement(By.id("search_query_top")); //seleccionar un elemento de la pagina
		txt_Buscador.sendKeys("Blousa");
		txt_Buscador.sendKeys(Keys.ENTER);
		
		driver.close();
	}
	
}
