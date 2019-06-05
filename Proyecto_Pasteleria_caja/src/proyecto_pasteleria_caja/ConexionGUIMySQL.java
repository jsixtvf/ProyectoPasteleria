package proyecto_pasteleria_caja;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sixto Vera
 */
public class ConexionGUIMySQL {

    public String bd = "Pasteleria";
    public String login = "root";
    public String password = "22michu";
    public String url = "jdbc:mysql://localhost:3306/" + bd;

    public Connection conectar() {
        Connection link = null;
        try {
            //Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.login, this.password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }

}









/*
    public ConexionGUIMySQL(String tipo_user) {
        login = tipo_user;
        password = tipo_user;
    }
*/