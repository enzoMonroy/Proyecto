
package proyectoprogra;

import java.io.*;
import java.util.stream.Stream;

/**
 *
 * @author Enzo
 */
public class Administrar {
    
    public static void Compu ()throws FileNotFoundException, IOException
    {
        //leyendo correo del dispositivo
        System.out.println("Computadoras portatiles creadas");
        System.out.println("listado de dispositivos");
        
       BufferedReader br1= new BufferedReader(new FileReader("axamp.txt"));
       String s1= br1.readLine();
       
        System.out.println(s1);
      
       while(s1 != null)
           {
               //Hacer lo que sea con la línea leída
               System.out.println(s1);
               //Leer la siguiente línea
               s1 = br1.readLine();
           }
    }
    public static void tablet()throws FileNotFoundException, IOException
    {
        //leyendo correo del dispositivo
        System.out.println("Computadoras portatiles creadas");
        System.out.println("listado de dispositivos");
        
       BufferedReader br1= new BufferedReader(new FileReader("axamp.txt"));
       String s1= br1.readLine();
       
        System.out.println(""+s1);
      
       while(s1 != null)
           {
               //Hacer lo que sea con la línea leída
               System.out.println(s1);
               //Leer la siguiente línea
               s1 = br1.readLine();
           }
    }
    public static void Smartwatch()throws FileNotFoundException, IOException
    {
        //leyendo correo del dispositivo
        System.out.println("Computadoras portatiles creadas");
        System.out.println("listado de dispositivos");
        
       BufferedReader br1= new BufferedReader(new FileReader("axamp.txt"));
       String s1= br1.readLine();
       
        System.out.println(""+s1);
      
       while(s1 != null)
           {
               //Hacer lo que sea con la línea leída
               System.out.println(s1);
               //Leer la siguiente línea
               s1 = br1.readLine();
           }
    }
    public static void Smartphone() throws FileNotFoundException, IOException
    {
        //leyendo correo del dispositivo
        System.out.println("Computadoras portatiles creadas");
        System.out.println("listado de dispositivos");
        
       BufferedReader br1= new BufferedReader(new FileReader("axamp.txt"));
       String s1= br1.readLine();
       
        System.out.println(""+s1);
      
       while(s1 != null)
           {
               //Hacer lo que sea con la línea leída
               System.out.println(s1);
               //Leer la siguiente línea
               s1 = br1.readLine();
           }
    }
    public static void Auriculares()throws FileNotFoundException, IOException
    {
        //leyendo correo del dispositivo
        System.out.println("Computadoras portatiles creadas");
        System.out.println("listado de dispositivos");
        
       BufferedReader br1= new BufferedReader(new FileReader("axamp.txt"));
       String s1= br1.readLine();
       
        System.out.println(""+s1);
      
       while(s1 != null)
           {
               //Hacer lo que sea con la línea leída
               System.out.println(s1);
               //Leer la siguiente línea
               s1 = br1.readLine();
           }
    }
}
