
import java.util.Scanner;

/* 10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.  */
public class Ejercicio10 {

    public static void main(String[] args) {
              
        Scanner teclado = new Scanner(System.in);
        int cantidadAlturas = 0;
        float [] alturas;
        float suma = 0, media = 0, min, max;
        
        System.out.print("Introduce una cantidad de alturas: ");
        cantidadAlturas = teclado.nextInt();
        alturas = new float[cantidadAlturas];
        
        for (int i = 0; i < cantidadAlturas; i++) {
            System.out.print("Introduce una altura en metros (" + (i +1) +"/"+cantidadAlturas +"): "); 
            alturas[i] = teclado.nextFloat();
        }
        for (int i = 0; i < cantidadAlturas; i++) {
            suma += alturas[i];
        }
        media = suma/cantidadAlturas;
        
        for (int i = 0; i < cantidadAlturas; i++) {
            
        }
        
 
    }
    
}
