package co.com.utest.tasks;

import co.com.utest.model.TiendaDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;




import java.util.List;


import static  co.com.utest.userinterfaces.PaginaVestidos.*;

public class Irvestidos implements Task {
    public static Irvestidos laPagina(List<TiendaDatos> datos) {
        return Tasks.instrumented(Irvestidos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {





        actor.attemptsTo(Click.on(SECCION_VESTIDOS),
                Click.on(VESTIDOS_CASUALES),
                Click.on(ABRIR_VESTIDO_CASUAL),
                Click.on(ANADIR_VESTIDO_AL_CARRITO),
                Click.on(PASAR_POR_CAJA),
                Click.on(PASAR_POR_CAJA_numero_2),
                Click.on(PASAR_POR_CAJA_numero_3),
                Click.on(ACEPTAR_TERMINOS),
                Click.on(PASAR_POR_CAJA_numero_4),
                Click.on(PAGAR_TRANSFERENCIA),
                Click.on(CONFIRMAR_COMPRA)















        );






    }

}
