/*
 * Proyecto final programación
 * Administración de pastelería
 */
package proyecto_pasteleria_caja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Francisco José Gordo Salguero
 * Juan Sixto Vera Fernandez
 * Valentin Amez Noguera
 */

public class Caja {

    private double precio;
    private double saldo_pagado;
    private double cambio;
    private double[] tipos_monedas = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50,
        0.20, 0.10, 0.05, 0.01};
    private int[] cantidad_monedas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    Scanner escaner = new Scanner(System.in);

    public Caja() throws SQLException {
        llenarCaja();
        this.precio = setPrecio();
        this.saldo_pagado = setSaldo_pagado();
        this.cambio = this.saldo_pagado - this.precio;
    }

    public double getPrecio() {
        return precio;
    }

    public double getSaldo_pagado() {
        return saldo_pagado;
    }

    public double getCambio() {
        return cambio;
    }

    public double[] getTipos_monedas() {
        return tipos_monedas;
    }

    public int[] getCantidad_monedas() {
        return cantidad_monedas;
    }

    public double setPrecio() throws SQLException {
        ArrayList<Integer> productos = new ArrayList<>();
        MySQLCon conn = new MySQLCon();
        double precio = 0;
        boolean salir = false;
        PreparedStatement producto_precio = null;

        while (!salir) {
            int opcion;
            System.out.println("1. Introducir producto");
            System.out.println("2. Salir");
            System.out.print("¿Que opción desea?: ");
            opcion = escaner.nextInt();
            switch (opcion) {
                case 1:
                    try (Connection connection = conn.connect();
                            Statement st = connection.createStatement();) {
                        ResultSet rs = st.executeQuery("Select Id_producto,"
                                    + "nombre_producto, cantidad, precio, "
                                    + "descuento from Productos");
                        while (rs.next()) {
                            System.out.println(rs.getString("Id_producto") + " | "
                                    + rs.getString("nombre_producto") + " | "
                                    + rs.getString(3) + " unidades | "
                                    + rs.getString("precio")+ " €");
                        }

                        System.out.print("Id producto: ");
                        int producto=escaner.nextInt();
                            st.executeUpdate("Update Productos SET cantidad= "
                                + "cantidad-1 where Id_producto="
                                    + producto);
                            if(producto == 1 || producto == 2){
                            productos.add(producto);
                            } else if(producto == 0){}
                        
                    } catch (NullPointerException e) {
                        System.out.println("No hay productos");
                    }
                    break;
                case 2:
                    try (Connection connection = conn.connect();
                            Statement st = connection.createStatement();) {
                        for (int producto = 0; producto < productos.size();
                                producto++) {
                            
                            ResultSet rs = st.executeQuery("Select precio from "
                                    + "Productos where Id_producto="
                                    + productos.get(producto));
                            
                            while (rs.next()) {
                                precio = precio
                                        + Double.parseDouble(rs.getString(
                                                        "precio"));
                            }
                        }
                    System.out.println("Precio a pagar por el cliente: "+precio);
                    }
                    salir = true;
                    break;
                default:
                    System.out.println("Opción equivocada");
                    break;
            }
        }
        return precio;
    }

    public double setSaldo_pagado() {
        double saldo_pagado = 0;
        do {
            Scanner escaner = new Scanner(System.in);
            System.out.print("Introduzca el valor pagado por el cliente: ");
            saldo_pagado = escaner.nextDouble();
            if (saldo_pagado < getPrecio()) {
                System.out.println("La cantidad pagada es inferior al precio");
            };
        } while (saldo_pagado < getPrecio());
        return saldo_pagado;
    }

    public void setCambio() {
        double cambio_auxiliar = this.getCambio();
        int posicion = 0;
        int[] cantidad_monedas_auxiliar = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0};
        String palabra = "";

        System.out.println("El cambio es: " + this.getCambio() + " €");

        while (posicion < this.tipos_monedas.length && cambio_auxiliar > 0) {
            if (this.tipos_monedas[posicion] > cambio_auxiliar
                    || this.cantidad_monedas[posicion] == 0) {
                posicion++;
            } else if (cambio_auxiliar == 0) {
                posicion = this.cantidad_monedas.length;
            } else {
                int posible_cambio = (int) (cambio_auxiliar
                        / this.tipos_monedas[posicion]);
                if (posible_cambio > this.cantidad_monedas[posicion]) {
                    cantidad_monedas_auxiliar[posicion]
                            = this.cantidad_monedas[posicion];
                } else {
                    cantidad_monedas_auxiliar[posicion] = posible_cambio;
                }
                cambio_auxiliar = cambio_auxiliar
                        - cantidad_monedas_auxiliar[posicion]
                        * this.tipos_monedas[posicion];
                posicion++;
            }
        }

        for (posicion = 0; posicion < this.getCantidad_monedas().length;
                posicion++) {
            if (cantidad_monedas_auxiliar[posicion] != 0) {
                this.cantidad_monedas[posicion]
                        = this.cantidad_monedas[posicion]
                        - cantidad_monedas_auxiliar[posicion];
            }
        }

        System.out.println("Se le debe entregar al cliente: ");
        for (posicion = 0; posicion < this.cantidad_monedas.length;
                posicion++) {
            if (cantidad_monedas_auxiliar[posicion] != 0) {
                if (this.tipos_monedas[posicion] < 5) {
                    palabra = "moneda";
                } else {
                    palabra = "billete";
                }
                System.out.println("Tipo de " + palabra + " "
                        + this.tipos_monedas[posicion] + " cantidad: "
                        + cantidad_monedas_auxiliar[posicion] + " unidades.");
            }
        }
    }

    public void setTipos_monedas(double[] tipos_monedas) {
        this.tipos_monedas = tipos_monedas;
    }

    /**
     * Que cantidad de monedas de cada tipo ha dado el cliente y lo introducimos
     * en la caja
     */
    public void setCantidad_monedas() {
        int posicion = 0;
        double saldo_pagado_copia = this.saldo_pagado;
        int[] cantidad_monedas_copia = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0};
        int[] devolver = this.getCantidad_monedas();
        String palabra_tipo_billete = "cuantos billetes";

        while (posicion < this.tipos_monedas.length && saldo_pagado_copia != 0) {
            if (saldo_pagado_copia < this.tipos_monedas[posicion]
                    && saldo_pagado_copia != 0) {
                posicion++;
            } else if (saldo_pagado_copia == 0) {
                posicion = this.cantidad_monedas.length;
            } else {
                if (this.getTipos_monedas()[posicion] < 2) {
                    palabra_tipo_billete = "cuantas monedas";
                };
                System.out.print("Indique " + palabra_tipo_billete + " de "
                        + this.getTipos_monedas()[posicion]
                        + " ha introducido: ");
                cantidad_monedas_copia[posicion] = escaner.nextInt();
                if (saldo_pagado_copia - this.getTipos_monedas()[posicion]
                        * cantidad_monedas_copia[posicion] >= 0) {
                    saldo_pagado_copia = saldo_pagado_copia
                            - this.getTipos_monedas()[posicion]
                            * cantidad_monedas_copia[posicion];
                    posicion++;
                } else {
                    System.out.println("El valor introducido es erroneo, "
                            + "intentelo de nuevo");
                }
            }
        }
        if (saldo_pagado_copia == 0) {
            devolver = cantidad_monedas_copia;
        } else {
            System.out.println("Se ha equivocado introduciendo las cantidades");
        }
        for (posicion = 0; posicion < this.cantidad_monedas.length; posicion++) {
            this.cantidad_monedas[posicion] = this.cantidad_monedas[posicion]
                    + devolver[posicion];
        }

        palabra_tipo_billete = "Tipo billete: ";
        System.out.println("Tipos y cantidades de billetes/monedas "
                + "introducidos: ");

        for (posicion = 0; posicion < this.tipos_monedas.length; posicion++) {
            if (cantidad_monedas_copia[posicion] <= 2) {
                palabra_tipo_billete = "Tipo moneda: ";
            }
            if (cantidad_monedas_copia[posicion] != 0) {
                System.out.println(palabra_tipo_billete
                        + this.tipos_monedas[posicion] + " cantidad: "
                        + cantidad_monedas_copia[posicion] + " unidades");
            }
        }

    }

    public void mostrarCaja() {

        String palabra_tipo_billete = "Tipo billete: ";
        System.out.println("Tipos y cantidades de billetes/monedas que hay "
                + "actualmente en la caja: ");
        for (int posicion = 0; posicion
                < this.tipos_monedas.length; posicion++) {
            if (this.tipos_monedas[posicion] <= 2) {
                palabra_tipo_billete = "Tipo moneda: ";
            }
            if (this.cantidad_monedas[posicion] != 0) {
                System.out.println(palabra_tipo_billete
                        + this.tipos_monedas[posicion] + " cantidad: "
                        + this.cantidad_monedas[posicion] + " unidades");
            }
        }

    }

    public void llenarCaja() {
        for (int posicion = 0; posicion < this.cantidad_monedas.length;
                posicion++) {
            this.cantidad_monedas[posicion] = (int) (Math.random() * 10) + 1;
        }
    }
}
