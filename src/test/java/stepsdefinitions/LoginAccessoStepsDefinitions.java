package stepsdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginAccessoStepsDefinitions extends TestBase {

    @Given("el usuario se encuentra en el formulario de acceso")
    public void el_usuario_se_encuentra_en_el_formulario_de_acceso() throws Exception {
        Assert.assertTrue(this.loginPage.validateLogin());
    }

    @When("el usuario ingrese las credenciales validas")
    public void el_usuario_ingrese_las_credenciales_validas() throws Exception {
        String username = "standard_user";
        String password = "secret_sauce";

        this.loginPage.enterCredentials(username,password);
    }

    @Then("el usuario debera ver la lista de productos")
    public void el_usuario_debera_ver_la_lista_de_productos() throws Exception {
        String title = "Products";
        Assert.assertTrue(this.inventoryPage.validateTitle(title));
    }

    @When("el usuario ingrese las credenciales inexistentes")
    public void el_usuario_ingrese_las_credenciales_inexistentes() throws Exception {
        String username = "juan pablo";
        String password = "cualquier cosa";

        this.loginPage.enterCredentials(username,password);
    }

    @Then("el usuario debera ver un mensaje de error")
    public void el_usuario_debera_ver_un_mensaje_de_error() throws Exception {
        Assert.assertTrue(this.loginPage.validateMessageError());
    }

    @When("el usuario no ingrese ninguna credencial")
    public void el_usuario_no_ingrese_ninguna_credencial() {

    }

    @Then("el usuario debera ver un mensaje de validacion")
    public void el_usuario_debera_ver_un_mensaje_de_validacion() {

    }


}
