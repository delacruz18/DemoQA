#Sample Feature Definition Template
@tag
Feature: Demoqa
 Esta prueba consistirá en automatizar tres flujos:

Se debe de ingresar a la opción elements->web tables y agregar un nuevo registro y que me permita eliminar cualquier registro que este en la tabla.
Se debe ingresar a la opción Widgets->Date Picker y seleccionar cualquier fecha en las opciones (Select Date y Date And Time).
Se debe ingresar a la opción Alerts,Frame & Windows->Alerts  se debe de interactuar con las 4 tipos de ventanas emergentes tanto
 parar activarlas como para cerrarlas.


 

 @tag2
  Scenario: registro
  creación y eliminación de un registro desde archivo plano.
    Given Abrir el navegador
    When Web tables y agregar un nuevo registro
    
  
     @tag3
  Scenario: Date Picker
  creación y eliminación de un registro desde archivo plano.
  	Given Abrir el navegador
    Then Date Picker seleccionar fecha  
 
  	
  	    @tag4
  Scenario: Alerts
  
  	Given Abrir el navegador
   	Then Alerts interactuar con las ventanas emergentes
  
  
   
 
    
    
    
       
   
  

