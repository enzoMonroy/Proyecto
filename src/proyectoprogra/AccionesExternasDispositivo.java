
package proyectoprogra;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class AccionesExternasDispositivo {
    
    public static void AccionesExternas()
    {
        System.out.println("Acciones externas de dispositivos");
        menu();
    }
    public static void menu()
    {
        int num;
        Scanner op = new Scanner(System.in);
       
        do{
            System.out.println("Seleccione accion a realizar");
            System.out.println("1. llamada telefonica");
            System.out.println("2. mensaje");        
            System.out.println("3. notificacion");
            
            num=op.nextInt();
            switch(num)
            {
                case 1: System.out.println("ingrese el numero telefonico");
                Scanner a1=new Scanner(System.in);
                String nume = a1.next();
                    System.out.println("llamando al Smartphone ");
                    break;
                case 2: System.out.println("ingrese el numero telefonico");
                Scanner a2=new Scanner(System.in);
                Scanner a3=new Scanner(System.in);
                String nummensaje= a2.next();
                String conte=a3.next();
                    System.out.println("llamando al Smartphone "+nummensaje);
                    System.out.println("el contenido del mensaje es: "+conte);
                    break;
                case 3: System.out.println("notificacion");
                Scanner a4=new Scanner(System.in);
                String noti = a4.next();
                    System.out.println("llamando al Smartphone ");
                    break;
                default:
                System.out.println("Ingrese un numero valido del menu.\n");
                break;
        }         
        }while(num !=2);
    }
}
