/*
 * 27/02/2018
 *Taller 1
 *Alison
 *Yadir Acuña 
 */
package Main;
import java.util.*;
import ejercicio1.ejercicio1;
import ejercicio2.ejercicio2;
import ejercicio3.ejercicio3;
import ejercicio4.ejercicio4;
import ejercicio5.ejercicio5;
/**
 *@author alison
 * @author yadir
 */
public class Main {
    
    public static void main(String[] args) {
        //llamado al menu
        Main objeto=new Main();
        objeto.menu();
    }
    
    public void menu(){
        Scanner entrada=new Scanner(System.in);
        int op;
        ejercicio1 objeto1=new ejercicio1();
        ejercicio2 objeto2=new ejercicio2();
        ejercicio3 objeto3=new ejercicio3();
        ejercicio4 objeto4=new ejercicio4();
        ejercicio5 objeto5=new ejercicio5();
        
        do{
            System.out.print("Seleccione un ejercicio: \n"
            +"1) ejercicio1\n"
            +"2) ejercicio2\n"
            +"3) ejerciocio3\n"
            +"4) ejerciocio4\n"
            +"5) ejerciocio5\n"
            +"6) SALIR \n");
            op=entrada.nextInt();
            switch(op){
                case 1:
                    objeto1.promedios();
                    break;
                case 2:
                    objeto2.estaciones();
                    break;
                case 3:
                    objeto3.edad();
                    break;
                case 4:
                    objeto4.segundos();
                    break;
                case 5:
                    objeto5.fibonacci();
                    break;
            }
        }while (op != 6);
     }
}