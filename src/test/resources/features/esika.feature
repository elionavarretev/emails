#AUTOMATION: elionavarretev@gmail.com

@tag
Feature: AUTOMATION

  @caso
  Scenario Outline: Flujo
    Given que un usuario entra a su <bandeja> correo
    When selecciona el correo elegido
    Then valida el <asunto>
    And valida <link> del cuerpo del correo
    Examples:
      | bandeja | asunto |link|
      ##@externaldata@./src/test/resources/DataDriven/dat.xlsx@Datos
|elionavarrete|Fwd: 24 h de color, hidratación y no transfer. ¡Quiero ese labial!| https://esika.tiendabelcorp.com/mx/inicio?consultantUrl=KarlaLbel&sap-outbound-id=AD2975C8BA88069A37EF8D960118F23D43E715A4&utm_source=SAPHybris&utm_medium=email&utm_campaign=SEND_TEST&utm_term=IKU_202015_MTO-ES-DT20_WU_T_ES___Link___14&utm_content=mx___ES|
|elionavarrete|Fwd: 24 h de color, hidratación y no transfer. ¡Quiero ese labial!| https://XYS.com/mx/p/200095640/KarlaLbel?sap-outbound-id=AD2975C8BA88069A37EF8D960118F23D43E715A4&utm_source=SAPHybris&utm_medium=email&utm_campaign=SEND_TEST&utm_term=IKU_202015_MTO-ES-DT20_WU_T_ES___Link___MQ-ESIKA&utm_content=mx___ES|
||||
