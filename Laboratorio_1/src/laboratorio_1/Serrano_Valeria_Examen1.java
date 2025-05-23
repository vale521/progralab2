
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
            
        System.out.println("-------------  Clave   -------------");
        System.out.println("Elige una de las siguientes opciones: \n 1)Encriptar \n 2)Desencriptar");
        int opcionclave=lea.nextInt();
        
        switch (opcionclave)
        {
        case 1: 
        String junto="";
        System.out.print("Ingrese un mensaje a cifrar: ");
        String mensajeEncriptado=lea.next();
        
        for (int i=0; i<=mensajeEncriptado.length(); i++)
        {
          char caracter = mensajeEncriptado.charAt(i);
          if (!(caracter>='a' && caracter>='z') && !(caracter>='a' && caracter>='z'))
          {
              junto+=caracter;
          }
          else
          {    
          if (caracter>='a' && caracter>='z' )
          {
              
              junto+=(char) 'z'-(caracter-'a');
          }
          else
          {
              junto+=(char) 'Z'-(caracter-'A');
          }
          }
              System.out.println("El mensaje cifrado es: "+ junto);
        
        }
        break;
        case 2:
        String juntar="";
        System.out.print("Ingrese un mensaje a cifrar: ");
        String mensajeDesencriptado=lea.next();
        
        for (int i=0; i<=mensajeDesencriptado.length(); i++)
        {
          char caracter = mensajeDesencriptado.charAt(i);
          if (!(caracter>='a' && caracter>='z') && !(caracter>='a' && caracter>='z'))
          {
              juntar+=caracter;
          }
          else
          {    
          if (caracter>='a' && caracter>='z' )
          {
              
              juntar+=(char) 'z'-(caracter-'a');
          }
          else
          {
              juntar+=(char) 'Z'-(caracter-'A');
          }
          }
              System.out.println("El mensaje cifrado es: "+ juntar);
        
        }
        break;
        }
        System.out.println("------------------------------------");

        break;
        case 3:
        System.out.println("--- Juego piedra, papel o tijera ---");
        boolean seguirJuego=false;
        boolean continuar=true;
        int ronda=2;
        String respuesta;
        do
        {
            do
            {
            System.out.println("Ingrese piedra, papel o tijera.");
            respuesta=lea.next();
            if (!respuesta.equals("piedra") && !respuesta.equals("papel") && !respuesta.equals("tijera"))
            {
                System.out.println("opcion no válida. Intenta con piedra, papel o tijera.");
            }   
            }while (!respuesta.equals("piedra") && !respuesta.equals("papel") && !respuesta.equals("tijera"));
            System.out.println("xx");
        /*do
        {
        System.out.println("¿Quieres seguir con ronda "+ronda+ " ? (si/no)");   
        String respuesta= lea.next();
        if (respuesta.equalsIgnoreCase("si"))
        {
           ronda++;
           validacionrespuesta=true;
           seguirJuego=true;
        }
        else if (respuesta.equalsIgnoreCase("no"))
        {
           validacionrespuesta=true;
           seguirJuego=false;
           System.out.println("Buena partida. Hasta pronto");
           break;
        }
        */
        
        
        }while(seguirJuego=true);
        System.out.println("------------------------------------");

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
