/*
 * Proyecto final programación
 * Administración de pastelería

https://github.com/jsixtvf/ProyectoPasteleria

 */
package proyecto_pasteleria_caja;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


/**
 * @author Francisco José Gordo Salguero
 * Juan Sixto Vera Fernandez
 * Valentin Amez Noguera
 */

public class Proyecto_Pasteleria_caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException  {
        // TODO code application logic here
        
        boolean salir = false;
        Scanner escaner = new Scanner(System.in);
        while(! salir){
            
            MySQLCon con = new MySQLCon();
            con.connect();
            
            System.out.println("1. Introducir productos");
            System.out.println("2. Imprimir Factura");
            System.out.println("3. Abrir DD.BB.");
            System.out.println("4. Finalizar aplicacion");
            System.out.print("¿Que opción desea?: ");
            int opcion = 0;
            Caja caja = null;
            try{
                opcion = escaner.nextInt();
            }catch(java.util.InputMismatchException e){
                System.out.println("Ha introducido un valor erróneo");
                opcion = 3;
            }
            
            switch(opcion){
                case 1:
                    try{
                    caja = new Caja();
                    
                    }catch (java.util.InputMismatchException e){
                        System.out.println("Ha introducido un valor erróneo");
                    }
                    try{
                    caja.setCantidad_monedas();
                    caja.setCambio();
                    caja.mostrarCaja();
                    }catch(NullPointerException e){
                        
                    }
                    break;
                case 2:
                    try{
                    Factura.Generar_factura();
                    }catch(IOException e){
                        System.out.println("Error por valor introducido "
                                + "incorrecto");
                    } catch (SQLException e){
                        System.out.println("Error por error de sintaxis de SQL");
                    }
                    break;
                case 3:
                    new BBDD().setVisible(true);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Se ha equivocado al introducir la "
                            + "opción");
                    break;
            }
        }
    }
    
}
