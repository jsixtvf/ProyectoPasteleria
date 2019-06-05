/*
 * Proyecto final programación
 * Administración de pastelería
 */
package proyecto_pasteleria_caja;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author Francisco José Gordo Salguero
 * Juan Sixto Vera Fernandez
 * Valentin Amez Noguera
 */

public class Factura {

    static Scanner input = new Scanner(System.in);

    /**
     *
     * @throws IOException
     * <p>
     * Nos devuelve cualquier error de tipo IO en la lectura/escritura del
     * objeto, Tambien lo que conseguiremos es que con un archivo de entrada que
     * tenga un formato lo convierta en el formato deseado iendo caracter a
     * caracter, tambien da formato de lineas gracias a los strings, cotrola
     * donde deberia ir cada palabra de la lista gracias a un contador llamado
     * "cuenta"</p>
     * @throws java.sql.SQLException
     */
    public static void Generar_factura() throws IOException, SQLException {
        
        File archivoEntrada = new File("/home/sixto/Descargas/Ventas_Juan Sixto_Vera_Fernandez_04-06-2019.txt");
        File archivoSalida = new File("destino.txt");

        try (FileReader lector = new FileReader(archivoEntrada); 
                FileWriter escritor = new FileWriter(archivoSalida);) {
            
            int unCaracter;
            int cuenta = 0;
            int numero_factura = 1;
            String posible_producto = "";
            String saltoLinea = System.getProperty("line.separator");
            String linea = "-----------------------------------------\n";
            String cartelera = "Nombre: Pa de Sucre \n"
                    + "Domicilio: calle Isabel II número 7, Soller \n"
                    + "Telefono: 971 36 37 85 \n"
                    + "Nº factura: " + numero_factura;
            String linea2 = "--------";
            String info[] = {"Primer apellido: ", "Segundo apellido: ", "CIF/DNI: ",
                "Correo: ", "Numero telefono: ", "Producto: ", "Base imponible: ",
                "IVA (10%): ", "Total: "};
            escritor.write(linea);
            escritor.write(saltoLinea);
            escritor.write(cartelera);
            escritor.write(saltoLinea);
            escritor.write(saltoLinea);
            escritor.write(linea);
            escritor.write(saltoLinea);
            while ((unCaracter = lector.read()) != -1) {
                
                char x = (char) unCaracter;
                
                if (cuenta == 6) {
                    posible_producto = posible_producto + x;
                }
                
                if (x == '{') {
                    cuenta = 0;
                    escritor.write(saltoLinea + linea2);
                    
                } else if (x == '#') {
                    if (cuenta == 0) {
                        escritor.write(linea2);
                    }
                    escritor.write(saltoLinea);
                    escritor.write(info[cuenta]);
                    cuenta++;
                    
                } else if (x == '}') {
                    
                    MySQLCon conn = new MySQLCon();
                    PreparedStatement producto_precio = null;
                    try (Connection connection = conn.connect();
                            Statement st = connection.createStatement();){
                        while (cuenta < info.length) {
                            escritor.write(saltoLinea);
                            escritor.write(info[cuenta]);
                            if (posible_producto.equalsIgnoreCase("Empanada}")) {
                                if (cuenta == 6) {
                                    ResultSet rs = st.executeQuery("SELECT "
                                            + "Productos.precio FROM Productos WHERE "
                                            + "Productos.Id_producto=1");
                                    while(rs.next()){
                                        escritor.write(rs.getString("precio"));
                                    }
                                }
                                if (cuenta == 7) {
                                    ResultSet rs = st.executeQuery("SELECT ROUND( "
                                            + "Productos.precio * 0.21,2) as precio "
                                            + "FROM Productos WHERE "
                                            + "Productos.Id_producto=1");
                                    while(rs.next()){
                                        escritor.write(rs.getString("precio"));
                                    }
                                }
                                if(cuenta == 8){
                                    ResultSet rs = st.executeQuery("SELECT "
                                            + "(Productos.precio + ROUND( "
                                            + "Productos.precio * 0.21,2)) as precio "
                                            + "FROM Productos WHERE "
                                            + "Productos.Id_producto=1");
                                    while(rs.next()){
                                        escritor.write(rs.getString("precio"));
                                    }
                                }
                                escritor.write(" €");
                            } else{
                                
                                if (cuenta == 6) {
                                    ResultSet rs = st.executeQuery("SELECT "
                                            + "Productos.precio FROM Productos WHERE "
                                            + "Productos.Id_producto=2");
                                    while(rs.next()){
                                        escritor.write(rs.getString("precio"));
                                    }
                                }
                                if (cuenta == 7) {
                                    ResultSet rs = st.executeQuery("SELECT ROUND( "
                                            + "Productos.precio * 0.21,2) as precio "
                                            + "FROM Productos WHERE "
                                            + "Productos.Id_producto=1");
                                    while(rs.next()){
                                        escritor.write(rs.getString("precio"));
                                    }
                                }
                                if(cuenta == 8){
                                    ResultSet rs = st.executeQuery("SELECT "
                                            + "(Productos.precio + ROUND( "
                                            + "Productos.precio * 0.21,2)) as precio "
                                            + "FROM Productos WHERE "
                                            + "Productos.Id_producto=1");
                                    while(rs.next()){
                                        escritor.write(rs.getString("precio"));
                                    }
                                }
                                
                                escritor.write(" €");
                                
                            }
                            cuenta++;
                        }
                    }

                } else {
                    escritor.write(unCaracter);
                }
        }
        }

    }
}
