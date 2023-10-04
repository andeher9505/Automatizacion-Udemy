package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginServices {

    @Autowired
    private LoginPage loginPage;
    private WebDriver driver;

    @Autowired
    public LoginServices(WebDriver driver) {
        this.driver=driver;
    }

    public void abrirNavegador (String url) {
        this.driver.get(url);
    }

    public void escribirNombre (String nombre){
        this.loginPage.getTxtNombre().sendKeys(nombre);
    }

    public void escribirApellido (String apellido){
        this.loginPage.getTxtApellido().sendKeys(apellido);
    }

    public void escribirCorreo (String correo){
        this.loginPage.getTxtemail().sendKeys(correo);
    }

    public void escribirTelefono (String tel){
        this.loginPage.getTxttelefono().sendKeys(tel);
    }

    public void ClicMale (){
        this.loginPage.getRadioMale().click();
    }

    public void clicFemale (){
        this.loginPage.getRadioFemale().click();
    }

    public void seleccionarSkills (String skill){
        new Select(this.loginPage.getSelectSkills()).selectByValue(skill);
    }
    /*
        public void escribirApellido (String apellido){
            this.driver.findElement(this.txtApellido).sendKeys(apellido);
        }
    */
    public void seleccYear (String year){
        new Select(this.loginPage.getSelecYear()).selectByVisibleText(year);
    }

    public void seleccMes (String mes){
        new Select(this.loginPage.getSelectMes()).selectByVisibleText(mes);
    }

    public void seleccDia (String dia){
        new Select(this.loginPage.getSelectDia()).selectByVisibleText(dia);
    }

    public void escribirClave (String clave){
        this.loginPage.getTxtpassword().sendKeys(clave);
    }

    public void escribirClaveConfirm (String confirm){
        this.loginPage.getTxtconfimPassword().sendKeys(confirm);
    }

    public void clicConfirmar (){
        this.loginPage.getBtnConfirmar().click();

    }

}
