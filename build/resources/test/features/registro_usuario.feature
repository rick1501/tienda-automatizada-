#Autor: Ricardo
@stories
Feature: Registro de usuario en Tienda
  @scenario

  Scenario:  Registro de manuel en la pagina de Tienda
    Given manuel desea registrarse en la Tienda
    When el usuario ingresa los datos requeridos por el sistema
    |strCorreo            |strAlias       |strTelefono1 |strTelefono2 |strOther        |strCountry       |strEstado  |strCodigoPostal|strCity |strNombre  |strApelllido |strContrasena   |strDia  |strMes  |strAno    |strEmpresa    |strDireccion1  |strDireccion2  |
    |a88Rf0KXns2@gmail.com|alias RICK     |3235308332   | 3104197185  |no hay onfo     |United States    |Alaska     |23001          |Monteria|ricard     |narvaez      |ricardo|25      |octubre |1996      |agrosol       |calle 45# 56-78|calle 67# 67-89|
    Then  el registro se completa al ver el nombre  ricrdo Narvaez



