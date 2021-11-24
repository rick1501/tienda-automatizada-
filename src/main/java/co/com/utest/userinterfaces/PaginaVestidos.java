package co.com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;




public class PaginaVestidos {

    public static final Target SECCION_VESTIDOS = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//a[@class='sf-with-ul']"));

    public static final Target VESTIDOS_CASUALES = Target.the("")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[1]/a"));

    public static final Target ABRIR_VESTIDO_CASUAL = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//a[@class='product-name']"));


    public static final Target ANADIR_VESTIDO_AL_CARRITO = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//p[@id=\"add_to_cart\"]"));

    public static final Target PASAR_POR_CAJA = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));

    public static final Target PASAR_POR_CAJA_numero_2 = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));

    public static final Target PASAR_POR_CAJA_numero_3 = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//*[@id=\"center_column\"]/form/p/button"));

    public static final Target ACEPTAR_TERMINOS = Target.the("boton lleva a pagina de registro")
            .located(By.id("cgv"));

    public static final Target PASAR_POR_CAJA_numero_4 = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//*[@id=\"form\"]/p/button"));

    public static final Target PAGAR_TRANSFERENCIA = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));

    public static final Target CONFIRMAR_COMPRA = Target.the("boton lleva a pagina de registro")
            .located(By.xpath("//*[@id=\"cart_navigation\"]/button"));



























































}
