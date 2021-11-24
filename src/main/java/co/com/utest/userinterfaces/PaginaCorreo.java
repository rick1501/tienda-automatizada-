package co.com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCorreo {

    public static final Target CORREO = Target.the("correo")
            .located(By.id("email_create"));





    public static final Target BOTON_REGISTRO2 = Target.the("boton registro 2")
            .located(By.id("SubmitCreate"));



}
