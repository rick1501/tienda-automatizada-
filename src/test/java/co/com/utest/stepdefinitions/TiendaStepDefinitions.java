package co.com.utest.stepdefinitions;

import co.com.utest.model.TiendaDatos;
import co.com.utest.tasks.Abrir;
import co.com.utest.tasks.Irvestidos;
import co.com.utest.tasks.LLenarFormulario;
import co.com.utest.tasks.LLenarcorreo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class TiendaStepDefinitions {

    @Before
    public void  SepStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^manuel desea registrarse en la Tienda$")
    public void manuelDeseaRegistrarseEnLaTienda() {
        OnStage.theActorCalled("Manuel").wasAbleTo(Abrir.laPagina());



    }


    @When("^el usuario ingresa los datos requeridos por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistema(List<TiendaDatos>  datos) {

        OnStage.theActorInTheSpotlight().attemptsTo(LLenarcorreo.laPagina(datos),
                LLenarFormulario.laPagina(datos), Irvestidos.laPagina(datos)

        );

    }

    @Then("^el registro se completa al ver el nombre  manuel leon$")
    public void elRegistroSeCompletaAlVerElNombreManuelLeon() {

    }
}
