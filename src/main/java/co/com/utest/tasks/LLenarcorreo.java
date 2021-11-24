package co.com.utest.tasks;

import co.com.utest.model.TiendaDatos;
import co.com.utest.userinterfaces.PaginaCorreo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.utest.userinterfaces.PaginaCorreo.*;

public class LLenarcorreo implements Task {

    public LLenarcorreo(List<TiendaDatos> datos) {

        this.datos = datos;
    }


    private List<TiendaDatos> datos;

    public static LLenarcorreo laPagina(List<TiendaDatos> datos) {

        return Tasks.instrumented(LLenarcorreo.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCorreo()).into(CORREO),
                Click.on(BOTON_REGISTRO2)


        );

    }
}
