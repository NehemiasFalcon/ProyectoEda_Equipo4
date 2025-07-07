/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expediente_tramite;
import tda.*;
/**
 *
 * @author nemi
 */
public class Dependencias {
    private String jefe;
    private String nombre;
    private Cola<Expediente> expedientes;

    public Dependencias() {
        this.jefe = "";
        this.nombre = "";
        this.expedientes = null;
    }

    public Dependencias(String jefe, String nombre, Cola<Expediente> expedientes) {
        this.jefe = jefe;
        this.nombre = nombre;
        this.expedientes = expedientes;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cola<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(Cola<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    
}
