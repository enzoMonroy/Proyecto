
package proyectoprogra;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class AccionesDispositivos {
    
    public static void Acciones() throws FileNotFoundException, IOException
    {
        System.out.println("Acciones con Dispositivos");

        CrearDispositivo();
        
        BufferedReader br1= new BufferedReader(new FileReader("axamp.txt"));
       String s1= br1.readLine();
       
        System.out.println("el correo del dipositivo es; "+s1);
        
        
    }
    public static void CrearDispositivo()
{
     int num;
        Scanner op = new Scanner(System.in);
       
        do{
           
            System.out.println("Seleccione el tipo de dispositivo ");
            System.out.println("1. Computadora Portatil");
            System.out.println("2. tablet");        
            System.out.println("3. SmartWatch");
            System.out.println("4. Smartphone");
            System.out.println("5. Auriculares inalambricos");
            
            num=op.nextInt();
            
            switch(num){
                case 1: //computadora portail
                    AcciDispositivo();
                    break;
                case 2: //tablet
                    AcciDispositivo();
                    break;
                case 3: //smartwatch
                    AcciDispositivo();
                    break;
                case 4: //smartphone
                   AcciDispositivo();
                    break;
                case 5://auriculares
                    break;
                default:
                System.out.println("Ingrese un numero valido del menu.\n");
                break;
        }
                    
        }while(num !=4);

}    
    public static void AcciDispositivo()
    {
        int num;
        Scanner op = new Scanner(System.in);
       
        do{
           
            System.out.println("1. tomar fotografia");
            System.out.println("2. copiar texto");        
            System.out.println("3. pegar texto");
            System.out.println("4. compartir documentos");
            System.out.println("5. reproducir musica");
            
            num=op.nextInt();
            
            switch(num){
                case 1: 
                    foto();
                    break;
                case 2: 
                    copiar();
                    break;
                case 3: 
                    pegar();
                    break;
                case 4: 
                   compartir();
                    break;
                case 5:
                    reproducir();
                    break;
                default:
                System.out.println("Ingrese un numero valido del menu.\n");
                break;
        }
                    
        }while(num !=4);
    }
    public static void foto()
    {
        System.out.println("la foto se ha tomado exitosamente");
    }
    public static void copiar()
    {
        System.out.println("el texto se ha copiado exitosamente");
    }
    public static void pegar()
    {
        System.out.println("el texto de ha pegado exitosamente");
    }
    public static void compartir()
    {
        System.out.println("el documento se ha compartido exitosamente");
    }
    public static void reproducir()
    {
        System.out.println("la musica se ha reproducido exitosamente");
    }
    
}
