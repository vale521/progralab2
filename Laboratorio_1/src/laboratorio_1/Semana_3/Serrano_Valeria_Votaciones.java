
package laboratorio_1.Semana_3;
import java.util.Scanner;
import java.util.Random;
import java.security.SecureRandom;

public class Serrano_Valeria_Votaciones {
    public static void main (String[] args){
    Scanner lea = new Scanner (System.in);
    lea.useDelimiter ("\n");
    Random numerox = new Random(System.currentTimeMillis());
    numerox.nextInt(100);
    
    boolean sesion=true;
   
    do
    {
    System.out.println("--------------------------    MENÚ PRINCIPAL    ------------------------ ");
    System.out.println("Elige una de las siguientes opciones: \n    1) Abrir Caj \n    2) numero perfecto \n    3) primos \n    4) Votaciones \n    5) Salir");
    
    System.out.print("Opción: ");
    int opcion_menu = lea.nextInt();
    
    
    switch (opcion_menu)
    {
    case 3:
        int numerorandom =numerox.nextInt(100);
        System.out.println("NUMERO RANDOM: "+numerorandom);   
        //variables
        int contar =0;
        int i;
        int residuo;
        
        
        
            for (i=1; i<=numerorandom; i++)
            {
            residuo = (numerorandom%2);
            if (residuo==0)
            {
                
            contar ++;
            }
            }
            
            if (contar ==2)
            {
                System.out.print("Es primo");
                
            } else 
            {
                System.out.println("no es primo");
            }
            
            
        
        
        
        
        break;
        
        
        
        
        
        
        
        
        
    case 4:
    //Declarar variables
    int num_voto =1;
    int votantes;
    int opcion;
    int rojo=0;
    int azul=0;
    int negro=0;
    int amarillo=0;
    int voto_nulo=0;
    double porcentajeVotos60;
    int votos_validos;
 System.out.println("-------------------------- SELECCIONASTE VOTACIONES ------------------------ ");
    System.out.println("¿Cuantos votantes tiene el país?");
    votantes = lea.nextInt();
    
    while (num_voto <= votantes)
    {
        System.out.println("--- Planillas ---");
        System.out.println("Elige una de las siguientes planillas: \n 1) Azul \n 2) Rojo \n 3) Negro \n 4) Amarillo");
        opcion = lea.nextInt();
        
        if (opcion==1)
        {
            System.out.println("Votaste por Rojo");  
            rojo ++; 
        }
        else if (opcion==2)
        {
            System.out.println("Votaste por Azul");  
            azul ++; 
        }
        else if (opcion==3)
        {
            System.out.println("Votaste por Negro");  
            negro ++; 
        }
        else if (opcion==4)
        {
           System.out.println("Votaste por Amarillo");  
            amarillo ++;  
        }
        else 
        {
            System.out.println("Tu voto es nulo");
            voto_nulo++;
        }
    num_voto ++;    
    }
    porcentajeVotos60= votantes*.60;
    votos_validos = votantes-voto_nulo;
    
    if (votos_validos>= porcentajeVotos60)
    {
        if (rojo> azul || rojo> negro || rojo>amarillo)
        {
           System.out.println("El ganador es la planilla Rojo \n" + "Con " + rojo +  "votos de" + votos_validos);
        }
        else if (azul>rojo  || azul> negro || azul>amarillo)
        {
           System.out.println("El ganador es la planilla Azul \n" + "Con " + azul +  "votos de" + votos_validos);
        }
        else if (negro>rojo || negro>azul || negro>amarillo)
        {           
            System.out.println("El ganador es la planilla Negro \n" + "Con " + negro +  "votos de" + votos_validos);

        }
        else if (amarillo>rojo || amarillo>azul || amarillo>negro)
        {
            System.out.println("El ganador es la planilla amarillo \n" + "Con " + amarillo +  "votos de" + votos_validos);
        }
            
    } else 
    {
        System.out.println("Votación fallida");
    }
        
    break;
    
    case 5:
        
        System.out.println("-------------------------- SELECCIONASTE SALIDA ------------------------ ");
        
        
        
        System.out.println("Byeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        sesion=false;
        break;
    default:
    break;
    }    
    }while (sesion==true);
    } 
}
