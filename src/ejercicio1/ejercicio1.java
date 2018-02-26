/*
 *Crear un software por consola que ingrese el nombre del alumno y n cantidad 
 *de notas y al final que me indique el promedio o nota final del alumno
 */
package ejercicio1;

import java.util.*;

/**
 *@author alison
 * @author yadir
 */
public class ejercicio1 {
    String nombre;
    int notas,notaFinal,i;
    float promedio=0,nota;
    
        public void promedios(){
        Scanner entrada=new Scanner(System.in);
  
        //Se guarda en la variable nombre el nombre del estudiante
        System.out.println("digite el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.println("digite cantidad de notas del estudiante: ");
        notas = entrada.nextInt();
        //cantidad de notas a ingresar
        for(i=0;i<notas;i++){
            System.out.println("digite nota: ");
            nota = entrada.nextInt();
            promedio += nota;
        }
        // impricion de los resultados y calcupromedio final 
        promedio = promedio/notas; 
        System.out.println("su promedio de notas es de: "+promedio);
        System.out.println("su nota final es de: "+promedio);
    }
}
