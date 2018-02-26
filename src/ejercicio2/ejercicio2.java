/*
 *Desarrolle un programa que me permita realizar n cantidad de consultas sobre 
 *la estación de año de cada mes ingresado.  
 *1,2,3 -> invierno,  *4,5,6->verano,   
 *7,8,9->otoño,       *10,11,12-> primavera 
 */
package ejercicio2;
import java.util.*;
/**
 *@author alison
 * @author yadir
 */
public class ejercicio2 {
    
    int n, numero;
    
    public void estaciones(){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Cuantas consultas desea realizar: ");
        n=entrada.nextInt();
        for (int  i=1; i<=n; i++){
            System.out.println("Digite un numero: ");
            numero=entrada.nextInt();
        switch (numero){
            case 1:
                System.out.println("INVIERNO");
                break;
            case 2:
                System.out.println("INVIERNO");
                break;
            case 3:
                System.out.println("INVIERNO");
                break;
            case 4:
                System.out.println("VERANO");
                break;
            case 5:
                System.out.println("VERANO");
                break;
            case 6:
                System.out.println("VERANO");
                break;
            case 7:
                System.out.println("OTOÑO");
                break;
            case 8:
                System.out.println("OTOÑO");
                break;
            case 9:
                System.out.println("OTOÑO");
                break;
            case 10:
                System.out.println("PRIMAVERA");
                break;
            case 11:
                System.out.println("PRIMAVERA");
                break;
            case 12:
                System.out.println("PRIMAVERA");
                break;
        }
        }
    }
    
}
