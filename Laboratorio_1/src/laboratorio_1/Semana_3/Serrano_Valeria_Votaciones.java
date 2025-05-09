
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
   int vecesPalabra=0;
   int vecesPerfecto=0;
   int vecesPrimos=0;
   int vecesVotaciones=0;
    do
    {
    System.out.println("--------------------------    MENÚ PRINCIPAL    ------------------------ ");
    System.out.println("Elige una de las siguientes opciones: \n    1) Abrir Caj \n    2) numero perfecto \n    3) primos \n    4) Votaciones \n    5) Salir");
    
    System.out.print("Opción: ");
    int opcion_menu = lea.nextInt();
    
    
    switch (opcion_menu)
    {
    case 1:
        vecesPalabra++;
        String palabra;
        System.out.print("PALABRA: ");
        palabra =lea.next();
        
        
        System.out.print("AL REVES: ");
        
        
        break;
    case 2:
        vecesPerfecto++;
        
        
        int numero;
        int j;
        int suma=0;
        
        
        System.out.println("-------------------------- SELECCIONASTE NUMERO PERFECTO    ------------------------ ");
        System.out.print("Ingrese número:");
        numero= lea.nextInt();
        for (j=1; j<=numero; j++ )
        {
        if (numero%j==0)
        {
            suma+=j;
        }
        }
        
        if (suma==numero)
        {
            System.out.println("Es perfecto");
        }
        else
        {
            System.out.println("No es perfecto");
        }
        
        break;
    case 3:
        vecesPrimos++;
        System.out.println("-------------------------- SELECCIONASTE NUMERO RANDOM ES PRIMO    ------------------------ ");

        int numerorandom =numerox.nextInt(100);
        System.out.println("NUMERO RANDOM: "+numerorandom);   
        //variables
        int contar =0;
        int i;
        int k;
        int residuo;
        int residuodivisor;
        int x=0;
        String listanumeros= "";
        
            for (i=1; i<=numerorandom; i++) //primo o no primo
            {
            residuo = (numerorandom%2); // residuo para saber si es primo
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
            
            for (k=1; k < numerorandom; k++) //for para divisores
            {
             residuodivisor= (numerorandom%k);
             if (residuodivisor ==0)
             {
                 x++;
                 listanumeros= listanumeros + ", " + k;
             }
             }
            
            System.out.println("Numero de divisores "+ x);
            System.out.println(listanumeros);
            
        break;
    
    case 4:
    vecesVotaciones++;

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
        System.out.println("Elige una de las siguientes planillas: \n 1) Rojo  \n 2) Azul \n 3) Negro \n 4) Amarillo");
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
           System.out.println("El ganador es la planilla Rojo \n" + "Con " + rojo +  " votos de " + votos_validos);
        }
        else if (azul>rojo  || azul> negro || azul>amarillo)
        {
           System.out.println("El ganador es la planilla Azul \n" + "Con " + azul +  " votos de " + votos_validos);
        }
        else if (negro>rojo || negro>azul || negro>amarillo)
        {           
            System.out.println("El ganador es la planilla Negro \n" + "Con " + negro +  " votos de " + votos_validos);

        }
        else if (amarillo>rojo || amarillo>azul || amarillo>negro)
        {
            System.out.println("El ganador es la planilla amarillo \n" + "Con " + amarillo +  " votos de " + votos_validos);
        }
        else
        {
            System.out.println("Queda empate, no hay ganador.");
        }
            
    } else 
    {
        System.out.println("Votación fallida");
    }
        
    break;
    
    case 5:
        
        System.out.println("-------------------------- SELECCIONASTE SALIDA ------------------------ ");
        System.out.println();
        
        System.out.println("Veces que se entra en Palabras al reves: " + vecesPalabra);
        System.out.println("Veces que se entra en Numero Perfecto: " + vecesPerfecto);
        System.out.println("Veces que se entra en Palabras al reves: " + vecesPrimos);
        System.out.println("Veces que se entra en Palabras al reves: " + vecesVotaciones);
        System.out.println("Byeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        sesion=false;
        break;
    default:
    break;
    }    
    }while (sesion==true);
    } 
}
