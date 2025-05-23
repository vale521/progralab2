
package laboratorio_1;

import java.util.Scanner;
public class Serrano_Valeria_Examen1 {
    public static void main(String[] args) {
    Scanner lea=new Scanner(System.in);
    lea.useDelimiter("\n");
        
    boolean sesion=true;
    int opcion;   

    do
    {
        System.out.println("-------------- Examen --------------");
        
        System.out.println("Elige una de las siguientes opciones: \n 1)Piramide \n 2)Clave \n 3)Juego piedra, papel o tijera \n 4)Adivinar \n 5)Salir");
        opcion=lea.nextInt();
        
    switch (opcion) 
    {
        case 1:
        System.out.println("------------- Pirámide -------------");
        System.out.print("Cantidad de filas en la piramide:");
        int filas=lea.nextInt();
        int suma=0;
        int noPar=1;
        for (int i=1; i<=filas; i++)
        {
        suma=0;
        for (int k=1; k<=i; k++)
        {
           System.out.print(noPar+" "); 
           suma+=noPar;
           noPar+=2;
        }
        System.out.println (" = "+suma);
        }
        System.out.println("------------------------------------");
        break;
        case 2:
        //variable
        String junto="";
            
        System.out.println("-------------  Clave   -------------");
        System.out.print("Ingrese un mensaje a cifrar o desifrar: ");
        String mensaje=lea.next();
        
        for (int i=0; i<=mensaje.length(); i++)
        {
          char caracter = mensaje.charAt(i);
          
        }
        break;
        case 3:
        break;
        case 4:
        break;
        case 5:
            sesion=false;
        break;
        default:
        break;
    }
            
            
            
            
    }while (sesion=true);
    }
}
