/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Olman
 */
public class Adopciones extends TipoAnimales{
  
    private String dni;
    private String nombre;
    private boolean certificacionRaza;
    private String domicilio;
    private double costo;

    public Adopciones() {
    }

    public Adopciones(String dni, String nombre, boolean certificacionRaza, String domicilio, double costo) {
        this.dni = dni;
        this.nombre = nombre;
        this.certificacionRaza = certificacionRaza;
        this.domicilio = domicilio;
        this.costo = costo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCertificacionRaza() {
        return certificacionRaza;
    }

    public void setCertificacionRaza(boolean certificacionRaza) {
        this.certificacionRaza = certificacionRaza;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    
    
    
}
