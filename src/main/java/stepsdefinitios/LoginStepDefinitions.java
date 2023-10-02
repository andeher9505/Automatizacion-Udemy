package stepsdefinitios;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobjects.LoginPage;
import pageobjects.LoginServices;
import util.HookDriver;

public class LoginStepDefinitions {


    @Given("^El usuario quiere tener una cuenta$")
    public void el_usuario_quiere_tener_una_cuenta() throws InterruptedException {


        LoginServices loginServices = new LoginServices(HookDriver.driver);
        loginServices.abrirNavegador("https://demo.automationtesting.in/Register.html");
        Thread.sleep(5000);
        loginServices.escribirApellido("Andres");
        loginServices.escribirNombre("Herrera");
        loginServices.escribirCorreo("correo@gmail.com");
        loginServices.escribirTelefono("3115558888");
        loginServices.ClicMale();
        loginServices.seleccionarSkills("Android");
        loginServices.seleccYear("1995");
        loginServices.seleccMes("September");
        loginServices.seleccDia("10");
        loginServices.escribirClave("soy123");
        loginServices.escribirClaveConfirm("soy123");
        loginServices.clicConfirmar();
        Thread.sleep(5000);
    }

    @When("^Envia la informacion correspondiente para obtener la cuenta$")
    public void envia_la_informacion_correspondiente_para_obtener_la_cuenta() {

    }

    @Then("^Se crea la cuenta en el sistema$")
    public void se_crea_la_cuenta_en_el_sistema()  {

    }

}
