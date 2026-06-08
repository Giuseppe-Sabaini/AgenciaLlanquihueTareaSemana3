package model;

/**
 * Esta clase se utiliza para almacenar los datos de ubicacion de los clientes
 * y empleados de Llanquihue Tour, encapsulando la calle, el numero residencial
 * y la ciudad correspondiente
 * <p>
 * @author Giuseppe Sabaini
 * @since Semana 3
 * @version 1.0
 */

public class Direccion {
    //Atributos privados (Encapsulamiento)
    private String calle;
    private String numero;
    private String ciudad;
    private String region;

    //Constructor
    public Direccion(String calle, String numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    //Métodos Getters y Setters
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    //Método ToString
    @Override
    public String toString() {
        return calle + " #" + numero + ", " + ciudad + "- Region: " + region;
    }
}