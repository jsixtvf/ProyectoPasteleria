/*
 * Proyecto final programación
 * Administración de pastelería
 */
package proyecto_pasteleria_caja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author Francisco José Gordo Salguero
 * Juan Sixto Vera Fernandez
 * Valentin Amez Noguera
 */

public class MySQLCon {
        public Connection connect() {
        String url = "jdbc:mysql://localhost:3306/Pasteleria";
        String user = "root";
        String pass = "22michu";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
}
