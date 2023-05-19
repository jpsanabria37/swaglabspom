Feature: Login Acceso
  Como cliente de la tienda swaglabs
  quiero poder ingresar a la tienda virtual con mi usuario y clave
  pare poder realizar comprar

  Scenario: cuando se ingrese una username y un password valido, pagina de login debe cargar la tienda virtual
    Given  el usuario se encuentra en el formulario de acceso
    When el usuario ingrese las credenciales validas
    Then el usuario debera ver la lista de productos

  Scenario: cuando se ingrese un username y password inexistente, la pagina de login debe mostrar un error de validacion
    Given el usuario se encuentra en el formulario de acceso
    When  el usuario ingrese las credenciales inexistentes
    Then  el usuario debera ver un mensaje de error

  Scenario: cuando no se ingrese ningun username o password se debe mostrar un mensaje de validacion
    Given el usuario se encuentra en el formulario de acceso
    When el usuario no ingrese ninguna credencial
    Then el usuario debera ver un mensaje de validacion