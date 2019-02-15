package Tareas;
import java.util.Scanner;
/**
 *
 * @author cadan
 */
public class Pruebas {
 public static void main(String args[]){
     
    int amountStudents=0;
    Scanner read = new Scanner(System.in);
    
     System.out.println("Ingrese la cantidad de Estudiantes");
     amountStudents= Integer.parseInt(read.nextLine());
     
      String[ ]   namesStudents = new  String[amountStudents];
      double [ ]   acGrades = new  double[amountStudents];
      double [ ]   exGrades = new  double[amountStudents];
      
      String temporalName="";
      double temporalAcGrade=0;
      double temporalExGrade=0;
      
      for(int i = 0; i<amountStudents; i++)
      {
        System.out.println("Ingrese el nombre del Estudiante");
        temporalName=read.nextLine();
               
        namesStudents[i]=temporalName;
        
        do{
            System.out.println("Ingrese la nota de acumulado");
            temporalAcGrade= Double.parseDouble(read.nextLine());
        }while(temporalAcGrade >50);
        acGrades[i]=temporalAcGrade;
        
        do{
            System.out.println("Ingrese la nota de examen");
            temporalExGrade= Double.parseDouble(read.nextLine());
        }while(temporalExGrade > 50);
        
        exGrades[i]=temporalExGrade;
      }
      
      System.out.println("Notas de todos los estudiantes.!");
    
      for(int i = 0; i<amountStudents; i++)
      {
        System.out.print(i+1 + " ");  
        System.out.print( namesStudents[i]);
        
        System.out.print(" Nota Acumulada: " + acGrades[i]);
        
        System.out.print(" Nota de Examen: " + exGrades[i]);
        
        System.out.print(" Total de Nota: " + (acGrades[i] + exGrades[i]));
        System.out.println();
      }
      
      
      double mayor = 0;
      int arregloMayor = 0;
      
      for(int i = 0; i<amountStudents; i++)
      {
          double notaFinal = acGrades[i] + exGrades[i];
          
          if(notaFinal > mayor){
              mayor = notaFinal;
              arregloMayor = i;
          }
          
      }
      
      System.out.println("El Estudiante con la nota Mayor es: " + namesStudents[arregloMayor]);
      
      
      double menor = 100;
      int arregloMenor = 0;
      
      for(int i = 0; i<amountStudents; i++)
      {
          double notaFinal = acGrades[i] + exGrades[i];
          
          if(notaFinal < menor){
              menor = notaFinal;
              arregloMenor = i;
          }
          
      }
      
      System.out.println("El Estudiante con la nota Mayor es: " + namesStudents[arregloMenor]);
      
      
      double NotaAcumulada = 0;
      double NotaExamen = 0;
      double NotaTotal = 0;
      
      int cantitadAprobados = 0;
      int cantidadReprobados = 0;
      
      for(int i = 0; i<amountStudents; i++)
      {
        NotaAcumulada = NotaAcumulada + acGrades[i];
        NotaExamen = NotaExamen + exGrades[i];
        NotaTotal = NotaTotal + (acGrades[i] + exGrades[i]);
        
        if((acGrades[i] + exGrades[i]) >= 60){
            cantitadAprobados++;
        }else if((acGrades[i] + exGrades[i]) < 60){
            cantidadReprobados++;
        }
        
      }
      
      
      System.out.println("El Promedio de la Nota Acumulada es: " + (NotaAcumulada /amountStudents ));
      System.out.println("El Promedio de la Nota Examen es: " + (NotaExamen /amountStudents ));
      System.out.println("El Promedio de la Nota Total es: " + (NotaTotal /amountStudents ));
      
      System.out.println("Cantida de Alumnos Aprobados: " + cantitadAprobados);
      System.out.println("Cantidad de Alumnos Reprobados: " + cantidadReprobados);
      System.out.println("Nombre de todos los Estudiantes: ");
      for(int i=0;i<amountStudents;i++)
      {
        System.out.println(i+1+" "+namesStudents[i]);
      }
      System.out.println("Graficas");
      System.out.print("\nGrafico Aprobados\n");
      for(int a=0;a<cantitadAprobados;a++)
      {
          System.out.print("*");
      }
      System.out.print("\nGrafico Reprobados\n");
      for(int a=0;a<cantidadReprobados;a++)
      {
          System.out.print("*");
      }
 }   
    
}