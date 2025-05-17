package laboratorio_1;

import java.util.Scanner;

public class cifrado {
    public static void main(String [] args){
    Scanner lea=new Scanner (System.in);
    lea.useDelimiter("\n");
    
    
    
    
    boolean sesion=true;
    int opcion=0 ;
    String encriptado="";
            
    do
    {
    System.out.println("-------------------------- BIENVENIDO A TIENDA  -------------------------");
    System.out.println("--------------------------    MENÚ PRINCIPAL    ------------------------");
    System.out.println("Elige una de las siguientes opciones: \n    1) Encriptación \n    2) Desencriptación \n    3)Salir");

    do
    {
    System.out.print("Opción: ");
    
    if (lea.hasNextInt())
    {
    opcion =lea.nextInt();
        if (opcion<1 || opcion>3)
        {
            System.out.println("Opción no válida. \nIngrese una opción de MENÚ PRINCIPAL.");
        }
    }else
    {
        System.out.println("Error. \nIngresar opción válida del MENÚ PRINCIPAL (Sin simbolos o letras).");
        System.out.println("Intentalo nuevamente.");
        lea.next();
        opcion=0;
    }
    }while (opcion<1 || opcion>3);
    
    
    switch (opcion)
    { 
       
        case 1:
        
        String par="";
        String impar="";

            System.out.print("palabra:");
            String palabra=lea.next();

            char letra;
            for(int i=0; i<palabra.length(); i++)
            {
            letra=palabra.charAt(i);
            if (i%2==0)
            {
            par +=letra;
            }
            else
            {
            impar +=letra;
            }
            }
            encriptado= par+impar;
            System.out.println("encriptado " + encriptado);
            
        break;
        case 2:
        if (encriptado.isEmpty())
        {
            System.out.println("no se ha encriptado ningun mensaje");
        }
        else
        {
        System.out.println("Encriptado "+ encriptado);
        int mitad= (encriptado.length()+1)/2;
        
        String mitad1= encriptado.substring(0,mitad);
            System.out.println(mitad1);
        String mitad2= encriptado.substring(mitad);
            System.out.println(mitad2);

        String result="";
        
        int l=0; int k=0;
        
        for(int j=0; j<=encriptado.length(); j++)
        {
            if (j % 2 ==0 &&  l< mitad1.length()) {
            result += mitad1.charAt(l);
            l++;
             
            } 
            if (j % 2 != 0 && k < mitad2.length()) {
              result += mitad2.charAt(k);
              k++;
            }
            
                     
        } 
        System.out.println("Desencriptado: " + result); 
        }
        break;
            
        case 3:
            System.out.println("Saliste");
            System.out.println("Byeeeeeeeeee");
            sesion=false;
    }
    }while (sesion==true);
    }
}
