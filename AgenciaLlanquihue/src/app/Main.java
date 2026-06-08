package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

/**
*Clase principal que actua como punto de entrada para el
* Sistema de gestion de Llanquihue Tour.
* <p>
* Esta Clase se encarga de simular la carga inicial de datos del sistema
* instanciando direcciones, clientes y distintos tipos de empleados para luego
* desplegar sus datos de registro en la consola.
*
* @author Giuseppe Sabaini
 * @since Semana 3
 * @version 1.0
 */



public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN LLANQUIHUE TOUR ===");
        System.out.println("------------------------------------------");

        // Aca se crea las direcciones primero
        Direccion direccion1 = new Direccion("Vicente Pérez Rosales", "450", "Llanquihue", "Los Lagos");
        Direccion direccion2 = new Direccion("San Martín", "1220", "Puerto Varas", "Los Lagos");
        Direccion direccion3 = new Direccion("Costanera", "89", "Frutillar", "Los Lagos");
        Direccion direccion4 = new Direccion("ParqueBustamante", "777", "Viña Del Mar", "Valparaiso");

        //Creamos una instancia de Persona un cliente externo
        Persona cliente = new Persona("12.345.678-9", "María José Jennings", "mariajose@correo.cl", direccion1);

        //Creamos dos instancias de Empleado que heredan de Persona
        Empleado guia = new Empleado("18.765.432-1", "Carlos Alvarado", "carlos.guia@llanquihuetour.cl", direccion2, "Guía de Turismo Lacustre", 750000);
        Empleado admin = new Empleado("15.987.654-3", "Ana María Flores", "ana.admin@llanquihuetour.cl", direccion3, "Administradora General", 1200000);
        Empleado alojamiento = new Empleado("17.462.971-6", "Jerrie", "jerrie.Alojamiento@llanquihuetour.cl", direccion4, "Proveedor de Alojamiento", 100000);

        //Aca se Muestra los datos por consola usando toString automáticamente
        System.out.println("- REGISTRO DE CLIENTE:");
        System.out.println(cliente);
        System.out.println();

        System.out.println("- REGISTRO DE COLABORADORES / EMPLEADOS:");
        System.out.println(guia);
        System.out.println(admin);
        System.out.println(alojamiento);

        System.out.println("------------------------------------------");
        System.out.println("Estructura Cargada con exito.");
    }
}