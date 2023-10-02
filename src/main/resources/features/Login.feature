Feature: Inicio de sesion

  Scenario: El cliente se logea en la pagina
    Given El usuario quiere tener una cuenta
    When Envia la informacion correspondiente para obtener la cuenta
    Then Se crea la cuenta en el sistema