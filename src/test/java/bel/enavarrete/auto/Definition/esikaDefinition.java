package bel.enavarrete.auto.Definition;

import static org.junit.Assert.assertEquals;

import bel.enavarrete.auto.Steps.esikaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class esikaDefinition {

	@Steps esikaSteps esikaSteps;


	@Given("^que un usuario entra a su ([^\"]*) correo$")
	public void queUnUsuarioEntraASuCorreo(String strEmail) {
		esikaSteps.Browser(strEmail);
	}


	@When("^selecciona el correo elegido$")
	public void seleccionaElCorreoElegido() {

	}

	@Then("^valida el ([^\"]*)$")
	public void validaEl(String strAsunto){
		esikaSteps.seleccionarAsunto(strAsunto);
	}

	@Then("^valida ([^\"]*) del cuerpo del correo$")
	public void validaDelCuerpoDelCorreo(String strLinks) throws InterruptedException {
		esikaSteps.validarlinks(strLinks);
	}


}
