
package Serrano_Valeria_Examen1;

import java.util.Scanner;
import java.util.Random;
public class Serrano_Valeria_Examen1 {
    public static void main(String[] args) {
    Scanner lea=new Scanner(System.in);
    lea.useDelimiter("\n");
    Random random=new Random();
        
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
        boolean seguirJuego=true;
        
        int ronda=2;
        String answer;
        String respuesta;
        String choose;
        
        System.out.println("--- Juego piedra, papel o tijera ---");
        while(seguirJuego==true)
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
            
            int numRandom= random.nextInt(3);
            if (numRandom==0)
            {
                choose="piedra";
            }
            else if (numRandom==1)
            {
               choose="papel"; 
            }    
            else
            {
                choose="tijera";
            }
            System.out.println("El programa eligió: "+ choose);
            
            if (respuesta.equals(choose))
            {
                System.out.println("Empate");
            }
            else
            {
                if ((respuesta.equals("papel") && choose.equals("piedra")) || (respuesta.equals("tijera") && choose.equals("papel")) || (respuesta.equals("piedra") && choose.equals("tijera")) )
                {
                    System.out.println("Ganó!! Felicidades");
                }
                else
                {
                    System.out.println("Perdió. :( ");
                }
                        
            }
            
            do
            {
                System.out.println("¿Quieres continuar con la ronda "+ronda);
                answer=lea.next();
                
                if (!answer.equals("si") && !answer.equals("no"))   
                {
                    System.out.println("Respuesta invalida. Intente nuevamente.");
                } 
                else
                {

                }

            }while (!answer.equals("si") && !answer.equals("no"));
            ronda++;
                    if (answer.equals("no"))
                    {
                        seguirJuego=false;
                    }  
        
        }
        System.out.println("------------------------------------");

        break;
        case 4:
        int random100 =random.nextInt(100)+1;
        int num=0;
        boolean adivino=false;
        
        System.out.println("------------- Adivinar -------------");
        System.out.println("Recuerda. Tienes solo 10 intentos.");
        
        for (int i=1; i<=10;i++)
        {
            System.out.println("Ingrese un numero entre 0 y 100. Intento n."+i);
            num=lea.nextInt();
            
        if (num<random100 && num>=0 && num<=100)
        {
            System.out.println("El numero a adivinar, es menor al ingresado");
        }
        else if (num>random100 && num>=0 && num<=100)
        {
            System.out.println("El numero a adivinar, es mayor al ingresado");
        }
        else if (num==random100 && num>=0 && num<=100)
        {
            System.out.println("Felicidades adivinaste!!!");
            i=11;
            adivino=true;
        }
        else 
        {
            System.out.println("Tu numero sale del rango de 0-100");
        }
        }
        
        if (adivino==false)
        {
            System.out.println("\nLo sentimos, tus intentos han acabado");
            System.out.println("El numero a adivinar era: "+random100);
        }
             
        System.out.println("------------------------------------");
        break;
        case 5:
        System.out.println("------------- Salir ----------------");
        System.out.println("Byyyyyyyyyyyyeeeeeeeeee");
        System.out.println("------------------------------------");
        sesion=false;
        break;
        default:
        break;
    }
    }while (sesion==true);
    }
}
