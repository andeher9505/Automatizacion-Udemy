package stepsdefinitios;

import config.spring.DirverConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import pageobjects.LoginServices;

@ContextConfiguration(classes = {DirverConfig.class})
public class LoginStepDefinitions {

    @Autowired
    private LoginServices loginServices;

    @Value("${url}")
    private String url;

    @Given("^El usuario quiere tener una cuenta$")
    public void el_usuario_quiere_tener_una_cuenta() throws InterruptedException {

        loginServices.abrirNavegador(url);
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
