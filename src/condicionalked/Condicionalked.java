
package condicionalked;

import java.time.LocalDateTime;

public class Condicionalked {

    public static void main(String[] args) {
    	LocalDateTime fecha_actual = LocalDateTime.now();
    	
    	int hora = fecha_actual.getHour();
        
        //CONDICIONAL PARA CORRER LA HORA EN DIFERENTES MOMENTOS DEL DIA
        if (hora >= 1 && hora < 12) {
            System.out.println("De acuerdo a la hora actual, Buenos Días");
        } else if(hora >= 12 && hora < 18) {
            System.out.println("De acuerdo a la hora actual, Buenas Tardes");
        } else if(hora >= 18 && hora < 24) {
            System.out.println("De acuerdo a la hora actual, Buenas Noches");
        } else {
            System.out.println("No se logro obtener la hora actual");
        }
    }
    
}
