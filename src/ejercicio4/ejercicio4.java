/*
 *desarrolle un programa que dado un numero total de segundos 
 *debuelba el numero en minutos, horas, semnas y dias.
 */
package ejercicio4;
import java.util.*;
/**
 *@author alison
 * @author yadir
 */
public class ejercicio4 {
    float seg, min,hor, sem, dia;
    public void segundos(){
        Scanner entrada=new Scanner(System.in);
        System.out.printf("digite el numero de segundos");
        seg=entrada.nextInt();
        
       min=seg/60;
       hor=seg/3600;
       dia=seg/86400;
       sem=seg/518400;
       
       System.out.println("los segundos en minutos= "+min+"en horas= "+hor+"en dias= "+dia+"en semanas= "+sem);
    }
    
}
