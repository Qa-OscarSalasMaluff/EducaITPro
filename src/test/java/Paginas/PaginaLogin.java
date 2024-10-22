package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class PaginaLogin {

@FindBy(id="email")
WebElement txtEmail;
	
@FindBy(id="passwd")
WebElement txtPassword;

@FindBy(id="SubmitLogin")
WebElement btnLogin;

@FindBy(xpath="//h1[contains(text(),'Authentication')]")
WebElement titleForm;

public PaginaLogin(WebDriver driver) {
	PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
	}

public void ingresarDatos(String email,String password) {
	txtEmail.sendKeys(email);
	txtPassword.sendKeys(password);
	btnLogin.click();
}

public String getTextTitleForm() {
	return titleForm.getText();
}


}
