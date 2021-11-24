package co.com.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")

public class PaginaTienda extends PageObject {

    public static final Target BOTON_REGISTRO = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//a[@class='login']"));

}
