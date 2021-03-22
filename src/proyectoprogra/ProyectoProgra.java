
package proyectoprogra;

import java.io.IOException;
import java.util.Scanner;
import static proyectoprogra.AccionesDispositivos.Acciones;
import static proyectoprogra.AccionesExternasDispositivo.AccionesExternas;
import static proyectoprogra.Administrar.Auriculares;
import static proyectoprogra.Administrar.Compu;
import static proyectoprogra.Administrar.Smartphone;
import static proyectoprogra.Administrar.Smartwatch;
import static proyectoprogra.Administrar.tablet;
import static proyectoprogra.Creacion.CrearDatos;

/**
 *
 * @author Enzo
 */
public class ProyectoProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int num;
        Scanner op = new Scanner(System.in);
       
        do{
           
            System.out.println("Ingrese la opcion deseada a ejecutar");
            System.out.println("1. Crear dispositivo");
            System.out.println("2. Administrar dispositivo");        
            System.out.println("3. Acciones con dispositivos");
            System.out.println("4. Acciones externas de dispositivo");
            System.out.println("5. Cargas madivas");
            System.out.println("6. Logs");
            System.out.println("7. Salir\n");
            
            num=op.nextInt();
            
            switch(num){
                case 1: 
                    CrearDispositivo();
                    break;
                case 2: 
                    Adminstrar();
                    break;
                case 3: 
                    Acciones();
                    break;
                case 4: 
                    AccionesExternas();
                    break;
                case 5: 
                    break;
                case 6: 
                    break;
                case 7:
                    System.out.println("Ha salido satisfactoriamente");
                    System.exit(0);
                    break;
                default:
                System.out.println("Ingrese un numero valido del menu.\n");
                break;
        }
                    
        }while(num !=6);
 
    }
    
public static void CrearDispositivo()
{
     int num;
        Scanner op = new Scanner(System.in);
       
        do{
           
            System.out.println("Seleccione el tipo de dispositivo a crear");
            System.out.println("1. Computadora Portatil");
            System.out.println("2. tablet");        
            System.out.println("3. SmartWatch");
            System.out.println("4. Smartphone");
            System.out.println("5. Auriculares inalambricos");
            
            num=op.nextInt();
            
            switch(num){
                case 1: //computadora portail
                    CrearDatos();
                    break;
                case 2: //tablet
                    CrearDatos();
                    break;
                case 3: //smartwatch
                    CrearDatos();
                    break;
                case 4: //smartphone
                   CrearDatos();
                    break;
                case 5://auriculares
                    break;
                default:
                System.out.println("Ingrese un numero valido del menu.\n");
                break;
        }
                    
        }while(num !=4);

}    
    
public static void Adminstrar() throws IOException
{
     int num;
        Scanner op = new Scanner(System.in);
       
        do{
           
            System.out.println("Seleccione el tipo de dispositivo a administrar");
            System.out.println("1. Computadora Portatil");
            System.out.println("2. tablet");        
            System.out.println("3. SmartWatch");
            System.out.println("4. Smartphone");
            System.out.println("5. Auriculares inalambricos");
            
            num=op.nextInt();
            
            switch(num){
                case 1: //computadora portail
                    Compu();
                    MenuAdminis();
                    break;
                case 2: //tablet
                    tablet();
                    MenuAdminis();
                    break;
                case 3: //smartwatch
                    Smartwatch();
                    MenuAdminis();
                    break;
                case 4: //smartphone
                    Smartphone();
                    MenuAdminis();
                    break;
                case 5://auriculares
                    MenuAdminis();
                    break;
                default:
                System.out.println("Ingrese un numero valido del menu.\n");
                break;
        }
                    
        }while(num !=4);

} 

public static void MenuAdminis() throws IOException
{
    int num;
        Scanner op = new Scanner(System.in);
       
        do{
           
            System.out.println("Administracion del dispositivo, seleccione una opcion");
            System.out.println("1. editar correo electronico");
            System.out.println("2. editar nombre ");        
            System.out.println("3. apagar visibilidad");
            System.out.println("4. apagar dispositivo");
            System.out.println("5. Auriculares inalambricos");
            
            num=op.nextInt();
            
            switch(num){
                case 1: System.out.println("ingrese el nuevo correo electronico");
                    Scanner a1=new Scanner(System.in);
                    String correo=a1.next();
                    System.out.println("el correo ahora es: "+correo);
                    break;
                case 2: System.out.println("ingrese el nuevo correo nombre");
                    Scanner a2=new Scanner(System.in);
                    String nombre=a2.next();
                    System.out.println("el nombre ahora es: "+nombre);
                    break;
                case 3: System.out.println("ingrese la visibilidad si/no");
                    Scanner a3=new Scanner(System.in);
                    String visib=a3.next();
                    System.out.println("la visibilidad ahora es: "+visib);
                    break;
                case 4: System.out.println("ingrese el estado encendido/apagado ");
                    Scanner a4=new Scanner(System.in);
                    String estado=a4.next();
                    System.out.println("el estado ahora es: "+estado);
                    break;
                case 5:
                    Auriculares();
                    AuricularesAdminis();
                    break;
                default:
                System.out.println("Ingrese un numero valido del menu.\n");
                break;
        }
                    
        }while(num !=4);
}
static public void AuricularesAdminis()
{
    int num;
        Scanner op = new Scanner(System.in);
       
        do{
           
            System.out.println("Adminsitracion de uriculares, seleccione una opcion");
            System.out.println("1. editar nombre");
            System.out.println("2. eliminar dispositivo sincronizadp");        
            System.out.println("3. apagar dispositivo");
            
            num=op.nextInt();
            
            switch(num){
                case 1: 
                    
                    break;
                case 2: 
                    
                    break;
                case 3: 
                   break;
                default:
                System.out.println("Ingrese un numero valido del menu.\n");
                break;
        }
                    
        }while(num !=2);
}
}
