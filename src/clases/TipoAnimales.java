/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.*;

/**
 *
 * @author Olman
 */
public class TipoAnimales {
    
    private int idTipoAnimal;
    private String descripcion;  
    
    //Cola de adopciones instanciada en TipoAnimal para asignar independecia por ID tipoAnimal
    private Queue<Adopciones> adopcionesQueue = new LinkedList<>();

    public Queue<Adopciones> getAdopcionesQueue() {
        return adopcionesQueue;
    }

    public void setAdopcionesQueue(Queue<Adopciones> adopcionesQueue) {
        this.adopcionesQueue = adopcionesQueue;
    }

    
    
    public TipoAnimales() {
    }

    public TipoAnimales(int idTipoAnimal, String descripcion) {
        this.idTipoAnimal = idTipoAnimal;
        this.descripcion = descripcion;
    }

    public int getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public void setIdTipoAnimal(int idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
   
    
    
}
