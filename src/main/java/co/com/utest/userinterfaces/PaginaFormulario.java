package co.com.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaFormulario {

    public static final Target ALIAS = Target.the("alias")
            .located(By.id("alias"));

    public static final Target NTELEFONO2 = Target.the("")
            .located(By.id("phone_mobile"));

    public static final Target NTELEFONO1 = Target.the("")
            .located(By.id("phone"));

    public static final Target INFORMACIONADICIONAL = Target.the("")
            .located(By.id("other"));

    public static final  Target CONTENEDOR_PAIS = Target.the("")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div"));


   /* public static final  Target CONTENEDOR_ESTADO = Target.the("")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div"));*/

    public static final  Target CONTENEDOR_ESTADO = Target.the("")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[7]/label"));




    public static final  Target ESTADO = Target.the("")
            .located(By.id("id_state"));
    public static final Target CODIGOPOSTAL = Target.the("")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input"));
    public static final Target CITY = Target.the("city")
            .located(By.id("city"));


    public static final Target CHECKED = Target.the("")
            .located(By.id("id_gender1"));

    public static final Target NOMBRE = Target.the("")
            .located(By.id("customer_firstname"));

    public static final Target APELLIDO = Target.the("")
            .located(By.id("customer_lastname"));

    public static final Target CONTRASENA = Target.the("")
            .located(By.id("passwd"));





    public static final Target CONTENEDOR_DIA = Target.the("")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div"));

    public static final Target DIA = Target.the("")
            .located(By.id("days"));

    public static final Target CONTENEDOR_MES = Target.the("")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div"));


    public static final Target MES = Target.the("")
            .located(By.id("months"));

    public static final Target CONTENEDOR_ANO = Target.the("")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div"));

    public static final Target ANO = Target.the("")
            .located(By.id("years"));

    public static final Target EMPRESA = Target.the("")
            .located(By.id("company"));

    public static final Target DIRECCION1 = Target.the("")
            .located(By.id("address1"));

    public static final Target DIRECCION2 = Target.the("")
            .located(By.id("address2"));

    public static final Target BOTONREGISTRARSE = Target.the("")
            .located(By.id("submitAccount"));






































}
