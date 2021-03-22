package proyectoprogra;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class Creacion {
    
    public static void CrearDatos()
    {
       /* Scanner lector = new Scanner(System.in);
        char confir = 's';
        do{*/
        
        String correo, nombre, visible;
        int tel,a = 0,b;
        String nota="NOTA: El dispositivo estara encendido por defecto";

        //variable tipo File
        File Archivo; //manipular al archivo 
        //variable print writer
        FileWriter escribir; //escribir en el archivo
        PrintWriter linea;//escribir lo demas en el archivo
        
        Archivo = new File("axamp.txt"); //preparando al archivo -Instancia- 
        //crear archivo
        if(!Archivo.exists()){
            try {
                System.out.println("El archivo fue creado con exito \n");
                Archivo.createNewFile();
                //ingresando datos 
                Scanner data = new Scanner(System.in);
                System.out.println("Escriba el correo electronico del dispositivo: ");
                correo=data.next();
                
                System.out.println("Escriba el nombre del dispositivo: ");
                nombre=data.next();

                System.out.println("Estara el dispositivo visible para conexion: ");
                visible=data.next();
                
                
                Scanner num = new Scanner(System.in);
                System.out.println("Deasea agregar un numero de telefono si esta creando un smartphone: 1.Si / 2.No ");
                tel=num.nextInt();
                
                if(tel==1){
                    System.out.println("Ingrese el numero de telefono del smartphone: ");
                    Scanner cel=new Scanner(System.in);
                    a=cel.nextInt();
                }else{
                    System.out.println("");
                }
                
                //mostrando datos en consola
                System.out.println("Correo electronico del dispositivo es:  "+correo);
                System.out.println("El nombre del dispositivo es:  "+nombre);
                System.out.println("Visible para conexion:  "+visible);
                System.out.println("el numero de telefono del smatphone es: "+a);
                System.out.println("NOTA:   El dispositivo estara encendido por defecto \n");
                
                escribir = new FileWriter(Archivo,true); 
                linea = new PrintWriter(escribir);
                //escrbimos/mostarndo en el archivo
                linea.println("Correo electronico del dispositivo es: "+correo);
                linea.println("El nombre del dispositivo es:  "+nombre);
                linea.println("Visible para conexion:  "+visible);
                linea.println("el numero del smartphone es: "+a);
                linea.println(nota);
                
                linea.close();
                escribir.close();
                
            } catch (Exception e) {
               
            }
            
        }else {
            try {
                System.out.println("El archivo ya fue creado anteriormente \n");
                
                //ingresando datos 
                Scanner data = new Scanner(System.in);
                System.out.println("Escriba el correo electronico del dispositivo: ");
                correo=data.next();
             
                System.out.println("Escriba el nombre del dispositivo: ");
                nombre=data.next();

                System.out.println("Estara el dispositivo visible para conexion: ");
                visible=data.next();
                
               Scanner num = new Scanner(System.in);
                System.out.println("Deasea agregar un numero de telefono si esta creando un smartphone: 1.Si / 2.No ");
                tel=num.nextInt();
                
                if(tel==1){
                    System.out.println("Ingrese el numero de telefono del smartphone: ");
                    Scanner cel=new Scanner(System.in);
                    a=cel.nextInt();
                }else{
                    System.out.println("");
                }
                
                //mostrando datos en consola
                System.out.println("Correo electronico del dispositivo es:  "+correo);
                System.out.println("El nombre del dispositivo es:  "+nombre);
                System.out.println("Visible para conexion:  "+visible);
                System.out.println("El numero del smartphone es: "+a);
                System.out.println("NOTA:   El dispositivo estara encendido por defecto \n");
                
                escribir = new FileWriter(Archivo,true); 
                linea = new PrintWriter(escribir);
                
                //escrbimos/mostarndo en el archivo
                linea.println("Correo electronico del dispositivo es: "+correo);
                linea.println("El nombre del dispositivo es:  "+nombre);
                linea.println("Visible para conexion:  "+visible);
                linea.println("El numero de telefono del smartphone es: "+a);
                linea.println("\n"+nota);
                  
                linea.close();
                escribir.close();
                
            } catch (Exception e) {
               
               /* System.out.println("valores erroneos ingresados" + e);
                do{
                    
                    confir = lector.next().charAt(0);
                    confir = 'n';
                }while (confir == 'S' || confir == 's');  */
            }
 
        }
        
       /* System.out.println("desea realizar una creacion nueva S/N ");
            confir = lector.next().charAt(0);

    }while (confir == 'S' || confir == 's');*/
              
}
    public static void Adminis()
    {
        
    }
}   
