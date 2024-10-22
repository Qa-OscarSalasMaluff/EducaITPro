package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Paginas.PaginaLogin;

public class Laboratiorio5 {


    WebDriver driver;
    PaginaLogin login;


    String URL="http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";
    String PATH = "..\\EducaITPro\\Drivers\\chromedriver.exe";
    
    @BeforeMethod
    public void setUp() {

            System.setProperty("webdriver.chrome.driver", PATH);
            driver=new ChromeDriver();
            driver.get(URL);
            driver.manage().window().maximize();
    }


    @AfterMethod
    public void cierreNavegador() {

        driver.quit();

    }

    @Test(dataProvider="Datos Login")
    public void irRegistroLogin(String email, String pass) {

    	login = new PaginaLogin(driver);
    	login.ingresarDatos(email, pass);
    	Assert.assertEquals(login.getTextTitleForm(), "AUTHENTICATION");
    	
    }
    
    @DataProvider(name="Datos Login")
    public Object[][] getData(){

        Object[][]data= new Object [3][2];
        data[0][0]="test1@gmail.com";data[0][1]="1234";
        data[1][0]="test2@gmail.com";data[1][1]="5678";
        data[2][0]="test3@gmail.com";data[2][1]="9123";
        return data;
     }
    
    
    
}
