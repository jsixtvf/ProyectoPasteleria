/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pasteleria_caja;

//import java.awt.Button;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sixto
 */
public class BBDD extends javax.swing.JFrame {

    /**
     * Creates new form BBDD
     */
    private DefaultTableModel modelo;
    ConexionGUIMySQL mysql = new ConexionGUIMySQL();
    Connection cn = mysql.conectar();

    public BBDD() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("BBDD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 448, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 33, 1212, 182));

        jButton1.setText("cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 227, -1, -1));

        jButton2.setText("cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 373, -1, -1));

        jButton3.setText("cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 373, -1, -1));

        jButton4.setText("proveedor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 262, -1, -1));

        jButton5.setText("proveedor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 408, -1, -1));

        jButton6.setText("proveedor");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 408, -1, -1));

        jButton7.setText("empleado");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 297, -1, -1));

        jButton8.setText("empleado");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 443, -1, -1));

        jButton9.setText("cliente");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 227, -1, -1));

        jButton10.setText("proveedor");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 262, -1, -1));

        jLabel2.setText("Eliminar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 413, -1, -1));

        jLabel3.setText("Insertar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 267, -1, -1));

        jLabel4.setText("Modificar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 413, -1, -1));

        jLabel5.setText("Ver");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 267, -1, -1));

        jButton11.setText("empleado");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 443, -1, -1));

        jButton12.setText("empleado");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 297, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 33, -1, 73));

        jButton13.setText("Salir");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 248, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

// INSERTAR CLIENTES
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt); // METODO QUE MIRA EN EL TEXT DEL BUTTON.                  
        insertarCliente(buttonText); // Los metodos reciben el nombre de los botones

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        modificarProveedor(buttonText);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        insertarEmpleado(buttonText);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        borrar(buttonText);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        pintar(buttonText);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        borrar(buttonText);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        String buttonText = PadreEvento(evt);
        pintar(buttonText);


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        pintar(buttonText);


    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        borrar(buttonText);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        insertarProveedor(buttonText);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        modificarEmpleado(buttonText);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String buttonText = PadreEvento(evt);
        modificarCliente(buttonText);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BBDD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void pintar(String buttonText) {
        String[] titols = null; /** Auxiliar de las cabeceras a mostrar en la tabla*/

        String[] titolsC = {"NIF", "Nombre", "Apellido1", "Apellido2", "Fecha_nacimiento", "Telefono", "Genero", "direccion", "localidad", "C.P."};
        String[] titolsP = {"NIF", "Nombre", "Telefono", "Direccion", "Localidad", "C.P.", "Actividad"};
        String[] titolsE = {"NIF_empleado", "Nombre_empleado", "Primer apellido", "Segundo apellido", "Genero", "Correo electronico", "Telefono", "Departamento"};
        /* Se definen las cabeceras para cada tabla */
        int numero_cabeceras = 0;
        String vSQL = new String();

        switch (buttonText) { /** Segun el nombre del boton con este switch decidimos que numero de cabeceras tiene la tabla
            que cabeceras mostramos asignando al auxiliar y que select queremos
            */

            case "cliente":
                numero_cabeceras = 11;
                titols = titolsC;
                vSQL = "SELECT * FROM Clientes";
                break;
                
            case "proveedor":
                numero_cabeceras = 7;
                titols = titolsP;
                vSQL = "SELECT * FROM Proveedores";
                break;

            case "empleado":
                numero_cabeceras = 9;
                titols = titolsE;
                vSQL = "SELECT * FROM Empleados";
                break;

        }

        Object[] registro = new Object[numero_cabeceras]; /** Array de object que guarda los valores de la query */

        modelo = new DefaultTableModel(null, titols); /** Generar el objeto tabla */

        try {

            if (buttonText.equals("cliente")) { /** Ejecutar la query y recoge los valores */
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(vSQL);

                while (rs.next()) { /** Recorremos el resultset y asignamos al array de objetos registro*/

                    registro[0] = rs.getString("NIF_cliente");
                    registro[1] = rs.getString("nombre_cliente");
                    registro[2] = rs.getString("apellido1");
                    registro[3] = rs.getString("apellido2");
                    registro[4] = rs.getString("fecha_nacimiento");
                    registro[5] = rs.getString("telefono");
                    registro[6] = rs.getString("id_genero_cliente");
                    registro[7] = rs.getString("direccion");
                    registro[8] = rs.getString("localidad");
                    registro[9] = rs.getString("codigo_postal");

                    modelo.addRow(registro); /** cada posicion del registro es un campo que insertamos como una fila que los contiene*/
                }
            }

            if (buttonText.equals("proveedor")) {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(vSQL);

                while (rs.next()) {

                    registro[0] = rs.getString("NIF_proveedor");
                    registro[1] = rs.getString("nombre_proveedor");
                    registro[2] = rs.getString("telefono");
                    registro[3] = rs.getString("direccion");
                    registro[4] = rs.getString("localidad");
                    registro[5] = rs.getString("codigo_postal");
                    registro[6] = rs.getString("Id_actividad_profesional_proveedor");

                    modelo.addRow(registro);
                }
            }

            if (buttonText.equals("empleado")) {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(vSQL);

                while (rs.next()) {

                    registro[0] = rs.getString("NIF_empleado");
                    registro[1] = rs.getString("nombre_empleado");
                    registro[2] = rs.getString("apellido1_empleado");
                    registro[3] = rs.getString("apellido2_empleado");
                    registro[4] = rs.getString("id_genero_empleados");
                    registro[5] = rs.getString("correo_electronico");
                    registro[6] = rs.getString("telefono_empleado");
                    registro[7] = rs.getString("departamento");

                    modelo.addRow(registro);
                }

            }

            jTable1.setModel(modelo); /** Finalmente de una pieza al modelo tabla le insertamos la cuadricula de filas y columnas */
            //cn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex); /** Muestra un mensaje de error */
        }
    }

    private void borrar(String buttonText) {

        int filaSel = jTable1.getSelectedRow(); /** Este metodo permite guardar donde hemos seleccioado
         * 
         * la fila de la tabla */
        if (filaSel == -1) { /** Y si es el valor -1 significa que no se ha seleccionado ninguna fila */
            JOptionPane.showMessageDialog(this, "No has seleccionado una fila");
        } else {

            String clave_primaria = (String) jTable1.getValueAt(filaSel, 0); /** Casteamos la posicion cero de la fila seleccionada, que corresponde
             * a la clave primaria.
             */

            String vSQL = new String();

            if (buttonText.equals("cliente")) { /** Decidimos aqui que query aplicar */

                vSQL = "DELETE FROM Clientes WHERE NIF_cliente='" + clave_primaria + "';";

            } else if (buttonText.equals("proveedor")) {

                vSQL = "DELETE FROM Proveedores WHERE NIF_proveedor='" + clave_primaria + "';";

            } else {

                vSQL = "DELETE FROM Empleados WHERE NIF_empleado='" + clave_primaria + "';";

            }

            try {
                Statement st = cn.createStatement();
                st.executeUpdate(vSQL);
                pintar(buttonText); /** Aplicamos el mismo metodo de mostrar resultados en la tabla para actualizarla y poder ver los cambios */

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }

    private String PadreEvento(ActionEvent evt) { /** Este metodo obtiene la fuente del evento */
        Object sce = evt.getSource();
        String buttonText = null;
        if (sce instanceof JButton) { /** Comprobamos si esta fuente es heredada de JButton */
            
            //check that the source is really a button
            buttonText = ((JButton) sce).getText(); /**  Y finalmente casteamos a String la fuente */
            //System.out.println(buttonText);
        }

        return buttonText;
    }

    private void insertarCliente(String buttonText) {
        /** Metodo de insertar a la base de datos, creamos una prepareStatement pidiendo mediante una ventana modal al usuario, que valor
        quiere darle a cada item, cada campo de la tabla en este caso, tabla Cliente.
        */

        String vSQL = new String();

        vSQL = "INSERT INTO Clientes (NIF_cliente, nombre_cliente, apellido1, apellido2, fecha_nacimiento,"
                + " telefono, id_genero_cliente, direccion, localidad, codigo_postal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = cn.prepareStatement(vSQL);

            String nif = JOptionPane.showInputDialog(this, "Introduce un nif");
            ps.setString(1, nif);

            /** TRAS INSERTAR LA CLAVE NIF COMPROBAMOS SI YA EXISTE */
            boolean claveEncontrada = buscarClavePrimaria(buttonText, nif);

            // PREPARE STATEMENTS
            String nombre = JOptionPane.showInputDialog(this, "Introduce un nombre");
            ps.setString(2, nombre);

            String apellido1 = JOptionPane.showInputDialog(this, "Introduce primer apellido");
            ps.setString(3, apellido1);

            String apellido2 = JOptionPane.showInputDialog(this, "Introduce segundo apellido");
            ps.setString(4, apellido2);

            String fechaNacimiento_str = JOptionPane.showInputDialog(this, "Introduce fecha de nacimiento");

            // Tratamiento de fechas
            try {
                //(java.sql.Date)
                
                /**
                * Formateamos el string que recibimos de la ventana modal para una variable Date
                * y de esta obtenemos fecha con getTime que pasa por parametro a un objeto sql date
                * que si podremos setear para el insert
                */
                java.util.Date fecha_nacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento_str);

                java.sql.Date fecha_nacimiento_sql = new java.sql.Date(fecha_nacimiento.getTime());
                
                ps.setDate(5, fecha_nacimiento_sql);
            } catch (ParseException ex) {
                System.out.println("Error de conversion a sql date" + ex.getMessage()); /**
                 * Mostramos la posible excepcion de convertir a sql date */
            }

            String telefono = JOptionPane.showInputDialog(this, "Introduce telefono");
            ps.setString(6, telefono);

            String caracter = JOptionPane.showInputDialog(this, "Introduce inicial de genero");
            ps.setString(7, caracter);

            String direccion = JOptionPane.showInputDialog(this, "Introduce direccion");
            ps.setString(8, direccion);

            String localidad = JOptionPane.showInputDialog(this, "Introduce localidad");
            ps.setString(9, localidad);

            String codigo_postal = JOptionPane.showInputDialog(this, "Introduce codigo postal");
            ps.setString(10, codigo_postal);

            if (claveEncontrada == false) { /** Solo si no encuentra la clave permitimos el insert */
             
                ps.executeUpdate();
                pintar(buttonText);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede insertar porque ya existe");
            }

            //cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void insertarProveedor(String buttonText) { /** idem a insertarCliente salvo el tratamiento de fecha*/

        String vSQL = new String();

        vSQL = "INSERT INTO Proveedores (NIF_proveedor, nombre_proveedor, telefono, direccion,"
                + " localidad, codigo_postal, Id_actividad_profesional_proveedor) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = cn.prepareStatement(vSQL);

            String nif = JOptionPane.showInputDialog(this, "Introduce un nif");
            ps.setString(1, nif);

            // TRAS INSERTAR LA CLAVE NIF COMPROBAMOS SI YA EXISTE
            boolean claveEncontrada = buscarClavePrimaria(buttonText, nif);

            // PREPARE STATEMENTS
            String nombre = JOptionPane.showInputDialog(this, "Introduce un nombre");
            ps.setString(2, nombre);

            String telefono = JOptionPane.showInputDialog(this, "Introduce telefono");
            ps.setString(3, telefono);

            String direccion = JOptionPane.showInputDialog(this, "Introduce direccion");
            ps.setString(4, direccion);

            String localidad = JOptionPane.showInputDialog(this, "Introduce localidad");
            ps.setString(5, localidad);

            String codigo_postal = JOptionPane.showInputDialog(this, "Introduce codigo postal");
            ps.setString(6, codigo_postal);

            String Id_actividad_profesional_proveedor = JOptionPane.showInputDialog(this, "Introduce id actividad profesional");
            ps.setString(7, Id_actividad_profesional_proveedor);

            if (claveEncontrada == false) {
                ps.executeUpdate();
                pintar(buttonText);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede insertar porque ya existe");
            }

            //cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void insertarEmpleado(String buttonText) { /** idem a insertar proveedor */

        String vSQL = new String();

        vSQL = "INSERT INTO Empleados (NIF_empleado, nombre_empleado, apellido1_empleado, apellido2_empleado,"
                + "id_genero_empleados, correo_electronico, telefono_empleado, departamento ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = cn.prepareStatement(vSQL);

            String nif = JOptionPane.showInputDialog(this, "Introduce un nif");
            ps.setString(1, nif);

            // TRAS INSERTAR LA CLAVE NIF COMPROBAMOS SI YA EXISTE
            boolean claveEncontrada = buscarClavePrimaria(buttonText, nif);

            // PREPARE STATEMENTS
            String nombre = JOptionPane.showInputDialog(this, "Introduce un nombre");
            ps.setString(2, nombre);

            String apellido1 = JOptionPane.showInputDialog(this, "Introduce primer apellido");
            ps.setString(3, apellido1);

            String apellido2 = JOptionPane.showInputDialog(this, "Introduce segundo apellido");
            ps.setString(4, apellido2);

            String id_genero_empleados = JOptionPane.showInputDialog(this, "Introduce id genero");
            ps.setString(5, id_genero_empleados);

            String correo_electronico = JOptionPane.showInputDialog(this, "Introduce correo electronico");
            ps.setString(6, correo_electronico);

            String telefono_empleado = JOptionPane.showInputDialog(this, "Introduce telefono");
            ps.setString(7, telefono_empleado);

            String departamento = JOptionPane.showInputDialog(this, "Introduce departamento");
            ps.setString(8, departamento);

            if (claveEncontrada == false) {
                ps.executeUpdate();
                pintar(buttonText);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede insertar porque ya existe");
            }

            //cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void modificarCliente(String buttonText) {

        String vSQL = new String();

        vSQL = "UPDATE Clientes SET"
                + " NIF_cliente = ?, nombre_cliente = ?, apellido1 = ?, apellido2 = ?, fecha_nacimiento = ?, telefono = ?,"
                + " id_genero_cliente = ?, direccion = ?, localidad= ?, codigo_postal = ?"
                + " WHERE NIF_cliente = ?";

        try {

            PreparedStatement ps = cn.prepareStatement(vSQL);

            String nif = JOptionPane.showInputDialog(this, "Introduce un nif");
            ps.setString(1, nif);

            // TRAS INSERTAR LA CLAVE NIF COMPROBAMOS SI YA EXISTE
            boolean claveEncontrada = buscarClavePrimaria(buttonText, nif);
            // PREPARE STATEMENTS
            String nombre = JOptionPane.showInputDialog(this, "Introduce un nombre");
            ps.setString(2, nombre);

            String apellido1 = JOptionPane.showInputDialog(this, "Introduce primer apellido");
            ps.setString(3, apellido1);

            String apellido2 = JOptionPane.showInputDialog(this, "Introduce segundo apellido");
            ps.setString(4, apellido2);

            String fechaNacimiento_str = JOptionPane.showInputDialog(this, "Introduce fecha de nacimiento");
            //java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(fechaNacimiento_str);

            // Tratamiento de fechas
            try {
                //(java.sql.Date)
                java.util.Date fecha_nacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento_str);

                java.sql.Date fecha_nacimiento_sql = new java.sql.Date(fecha_nacimiento.getTime());
                System.out.println(fecha_nacimiento);
                ps.setDate(5, fecha_nacimiento_sql);
            } catch (ParseException ex) {
                System.out.println("Error de conversion a sql date" + ex.getMessage());
            }

            String telefono = JOptionPane.showInputDialog(this, "Introduce telefono");
            ps.setString(6, telefono);

            String caracter = JOptionPane.showInputDialog(this, "Introduce inicial de genero");
            ps.setString(7, caracter);

            String direccion = JOptionPane.showInputDialog(this, "Introduce direccion");
            ps.setString(8, direccion);

            String localidad = JOptionPane.showInputDialog(this, "Introduce localidad");
            ps.setString(9, localidad);

            String codigo_postal = JOptionPane.showInputDialog(this, "Introduce codigo postal");
            ps.setString(10, codigo_postal);

            // CONTENIDO DEL WHERE
            ps.setString(11, nif);

            if (claveEncontrada == true) { 
                /** 
                 * 
                 * La particularidad aqui es que si no encuentra la clave primaria no hace la actualizacion */
                ps.executeUpdate();
                pintar(buttonText);
            } else {
                JOptionPane.showMessageDialog(null, "No existe este registro.");
            }

            //cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void modificarProveedor(String buttonText) {

        String vSQL = new String();

        vSQL = "UPDATE Proveedores SET"
                + " NIF_proveedor = ?, nombre_proveedor = ?, telefono = ?, direccion = ?,"
                + " localidad = ?, codigo_postal = ?, Id_actividad_profesional_proveedor = ?"
                + " WHERE NIF_proveedor = ? ";

        try {

            PreparedStatement ps = cn.prepareStatement(vSQL);

            String nif = JOptionPane.showInputDialog(this, "Introduce un nif");
            ps.setString(1, nif);

            // TRAS INSERTAR LA CLAVE NIF COMPROBAMOS SI YA EXISTE
            boolean claveEncontrada = buscarClavePrimaria(buttonText, nif);

            // PREPARE STATEMENTS
            String nombre = JOptionPane.showInputDialog(this, "Introduce un nombre");
            ps.setString(2, nombre);

            String telefono = JOptionPane.showInputDialog(this, "Introduce telefono");
            ps.setString(3, telefono);

            String direccion = JOptionPane.showInputDialog(this, "Introduce direccion");
            ps.setString(4, direccion);

            String localidad = JOptionPane.showInputDialog(this, "Introduce localidad");
            ps.setString(5, localidad);

            String codigo_postal = JOptionPane.showInputDialog(this, "Introduce codigo postal");
            ps.setString(6, codigo_postal);

            String Id_actividad_profesional_proveedor = JOptionPane.showInputDialog(this, "Introduce id actividad profesional");
            ps.setString(7, Id_actividad_profesional_proveedor);

            //CONTENIDO DEL WHERE
            ps.setString(8, nif);

            if (claveEncontrada == true) {
                ps.executeUpdate();
                pintar(buttonText);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el registro");
            }

            //cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void modificarEmpleado(String buttonText) {

        String vSQL = new String();

        vSQL = "UPDATE Empleados SET"
                + " NIF_empleado = ?, nombre_empleado = ?, apellido1_empleado = ?, apellido2_empleado = ?,"
                + " id_genero_empleados = ?, correo_electronico = ?, telefono_empleado = ?, departamento = ?"
                + " WHERE NIF_empleado = ? ";

        try {

            PreparedStatement ps = cn.prepareStatement(vSQL);

            String nif = JOptionPane.showInputDialog(this, "Introduce un nif");
            ps.setString(1, nif);

            /** 
             * Tras insertar la clave nif comprobamos si ya existe.
             * Este metodo lo hemos utilizado en cada query
             */
            boolean claveEncontrada = buscarClavePrimaria(buttonText, nif);

            // PREPARE STATEMENTS
            String nombre = JOptionPane.showInputDialog(this, "Introduce un nombre");
            ps.setString(2, nombre);

            String apellido1 = JOptionPane.showInputDialog(this, "Introduce primer apellido");
            ps.setString(3, apellido1);

            String apellido2 = JOptionPane.showInputDialog(this, "Introduce segundo apellido");
            ps.setString(4, apellido2);

            String id_genero_empleados = JOptionPane.showInputDialog(this, "Introduce id de genero");
            ps.setString(5, id_genero_empleados);

            String correo_electronico = JOptionPane.showInputDialog(this, "Introduce un correo electronico");
            ps.setString(6, correo_electronico);

            String telefono = JOptionPane.showInputDialog(this, "Introduce  telefono");
            ps.setString(7, telefono);

            String departamento = JOptionPane.showInputDialog(this, "Introduce un departamento");
            ps.setString(8, departamento);

            //CONTENIDO DEL WHERE
            ps.setString(9, nif);

            if (claveEncontrada == true) {
                ps.executeUpdate();
                pintar(buttonText);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el registro");
            }

            //cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
/** Buscar clave primaria es el metodo que seleccionamos la clave primaria */
    public boolean buscarClavePrimaria(String buttonText, String clave) {
        String vSQL;
        boolean existeClave = false;

        try {
            if (buttonText.equals("cliente")) {
                vSQL = "SELECT NIF_cliente FROM Clientes WHERE NIF_cliente='" + clave + "';";

            } else if (buttonText.equals("proveedor")) {
                vSQL = "SELECT NIF_proveedor FROM Proveedores WHERE NIF_proveedor='" + clave + "';";

            } else {
                vSQL = "SELECT NIF_empleado FROM Empleados WHERE NIF_empleado='" + clave + "';";

            }
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(vSQL);

            while (rs.next()) { /** Comprobamos si entra en el bucle, en caso de no hacerlo nunca se setea el booleano existeClave a true */
                existeClave = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return existeClave; 
        /** Devolvemos el booleano, dependiendo de su valor true o 
         * false nos es util para determinar si se puede hacer un insert o un update
         * son logicas opuestas de hecho
         * */

    }
}
