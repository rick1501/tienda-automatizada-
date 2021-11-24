package co.com.utest.tasks;

import co.com.utest.model.TiendaDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.utest.userinterfaces.PaginaFormulario.*;

public class LLenarFormulario implements Task {

    public LLenarFormulario(List<TiendaDatos> datos)
    {
        this.datos = datos;
    }

    private List<TiendaDatos> datos;

    public static LLenarFormulario laPagina(List<TiendaDatos> datos) {
        return Tasks.instrumented(LLenarFormulario.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getStrAlias()).into(ALIAS),
                Enter.theValue(datos.get(0).getStrTelefono2()).into(NTELEFONO2),
                Enter.theValue(datos.get(0).getStrTelefono1()).into(NTELEFONO1),
                Enter.theValue(datos.get(0).getStrOther()).into(INFORMACIONADICIONAL),
                Click.on(CONTENEDOR_PAIS),
                Click.on(CONTENEDOR_ESTADO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrEstado()).from(ESTADO),
                Enter.theValue(datos.get(0).getStrCodigoPostal()).into(CODIGOPOSTAL),
                Enter.theValue(datos.get(0).getStrCity()).into(CITY),
                Click.on(CHECKED),
                Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
                Enter.theValue(datos.get(0).getStrApelllido()).into(APELLIDO),
                Enter.theValue(datos.get(0).getStrContrasena()).into(CONTRASENA),

                Click.on(CONTENEDOR_DIA),
                SendKeys.of(datos.get(0).getStrDia()).into(DIA),


                /*SendKeys.of(datos.get(0).getStrDia()).into(DIA).thenHit(Keys.ARROW_DOWN, Keys.ENTER),*/
                Click.on(CONTENEDOR_MES),
                SendKeys.of(datos.get(0).getStrMes()).into(MES),

                Click.on(CONTENEDOR_ANO),
                SendKeys.of(datos.get(0).getStrAno()).into(ANO),
                Enter.theValue(datos.get(0).getStrEmpresa()).into(EMPRESA),
                Enter.theValue(datos.get(0).getStrDireccion1()).into(DIRECCION1),
                Enter.theValue(datos.get(0).getStrDireccion2()).into(DIRECCION2),
               Click.on(BOTONREGISTRARSE)










               /*

               Enter.theValue(datos.get(0).getStrDia()).into(DIA).thenHit(Keys.ARROW_DOWN, Keys.ENTER)

               SelectFromOptions.byVisibleText(datos.get(0).getStrDia()).from(DIA).

               SelectFromOptions.byVisibleText(datos.get(0).getStrMes()).from(MES),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAno()).from(ANO)*/














                /*Click.on(RADIOH)*/

        );


    }
}
