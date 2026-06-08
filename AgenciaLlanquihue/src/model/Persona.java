package model;

/**
 * Representa una entidad basica de persona dentro del sistema Llanquihue Tour.
 * <p>
 * Esta clase sirve como base para cualquier individuo del sistema, como cliente o
 * la clase empleado, implementa una relacion de composicion/asociacion con la clase Direccion
 * para gestionar la ubicacion residencial de la persona.
 *
 * @author Giuseppe Sabaini
 * @since Semana 3
 * @version 1.0
 */

public class Persona {
    //Atributos privados
    private String rut;
    private String nombre;
    private String correo;
    private Direccion direccion; //Aquí aplico Composicion

    //Constructor
    public Persona(String rut, String nombre, String correo, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    //Métodos Getters y Setters (Mutador y Accesor)
    public String getRut() { return rut; } //Accesor
    public void setRut(String rut) { this.rut = rut; } //Mutador

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    //Método toString
    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Correo: " + correo + " | Dirección: [" + direccion + "]";
    }
}