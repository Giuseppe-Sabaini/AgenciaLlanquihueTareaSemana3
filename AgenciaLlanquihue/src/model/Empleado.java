package model;

/**
 * Esto reprecenta a un trabajador de la empresa Llanquihue Tour.
 * <p>
 * Esta clase hereda la clase persona, lo que significa que reutiliza los atributos
 * basicos de identificacion Rut, nombre, correo y direccion, y añade atributos
 * especificos como el rol dentro de la empresa y el sueldo.
 * <p>
 * @author Giuseppe Sabaini
 * @since Semana 3
 * @version 1.0
 */

public class Empleado extends Persona {
    //Atributo específico de Empleado
    private String rol; // Ejemplo Guía Turístico o Administrador
    private double sueldo;

    //Constructor (Usa super para reutilizar el constructor de Persona)
    public Empleado(String rut, String nombre, String correo, Direccion direccion, String rol, double sueldo) {
        super(rut, nombre, correo, direccion); // Llama al constructor de la clase base
        this.rol = rol;
        this.sueldo = sueldo;
    }

    //Getters y Setters específicos
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    //Método toString (Extiende el toString de Persona)
    @Override
    public String toString() {
        return super.toString() + " | Rol: " + rol + " | Sueldo: $" + sueldo;
    }
}
