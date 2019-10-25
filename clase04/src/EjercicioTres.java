
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTPL
 */
public class EjercicioTres {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombres completos de un estudiante
    ingreso de nota 1 (debe ser entero)
    ingreso de nota 2 (debe ser entero)
    ingreso del ciclo que cursa el alumno (debe ser cadena)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del Alumno
    Nombres Completos:
    Ciclo:
    Nota 1:
    Nota 2:
    */
   public static  void main(String [] args){
    
      Scanner entrada = new Scanner(System.in);
      String nombrescompletos;
      int nota1;
      int nota2;
      String ciclo;
      
      System.out.println("Ingrese sus nombres completos");
      nombrescompletos = entrada.nextLine();
      
      System.out.println("Ingrese nota 1");
      nota1 = entrada.nextInt();
      
      System.out.println("Ingrese nota 2");
      nota2 = entrada.nextInt();
      
      entrada.nextLine();
      System.out.println("Ingrese su ciclo que esta cursando");
      ciclo = entrada.nextLine();
      
      System.out.printf("Informe Alumno:\nNombresCompletos:%s\nCiclo:"
              + "%s\nnota1:%s\nnota2:%s\n", nombrescompletos, ciclo, nota1,
              nota2);
      
     
      
   }     
   } 

           
           
