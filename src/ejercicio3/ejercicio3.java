/*
 *Desarrollar un programa que identifique en que categoría debo 
 *registrarme según estos datos.  
 *0-6 años -> Pre-infantil,     7-17->infantil 
 *18-25 ->juvenil,              26-45 ->mayores 
 *60 o mas ->veteranos
 */
package ejercicio3;
import java.util.*;
/**
 *@author alison
 * @author yadir
 */
public class ejercicio3 {
  int n, numero;
public void edad(){
    Scanner entrada=new Scanner(System.in);
    System.out.print("Cuantas consultas desea realizar: ");
        n=entrada.nextInt();
        for (int  i=1; i<=n; i++){
            System.out.println("Digite una edad: ");
            numero=entrada.nextInt();
        switch (n){
            case 1:
                if (numero>=0 || numero <= 6){
                System.out.println("PRE-INFANTIL");
                }
                break;
            case 2:
                if (numero>=7 || numero <= 17){
                System.out.println("INFANTIL");
                }
                break;
            case 3:
                if (numero>=18 || numero <= 25){
                System.out.println("JUVENIL");
                }
                break;
            case 4:
                if (numero >= 26 || numero <= 60){
                System.out.println("MAYORES");
                }
                break;
            case 5:
                if (numero > 60){
                System.out.println("VETERANOS");
                }
                break;
        }
        }
}  
}
