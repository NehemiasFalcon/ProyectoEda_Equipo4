/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expediente_tramite;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import tda.*;

/**
 *
 * @author nemi
 */
public class Expediente {
    private int identificador;
    private String prioridad;
    private Interesado datosint;
    private String asunto;
    private LocalDateTime fecharegistro;
    private LocalDateTime fechafinalizacion;
    private ListaSimpleEnlazada<Documentos> Documentos;
    private ListaSimpleEnlazada<Movimientos> Movimientos;

    public Expediente(int identificador, String prioridad, Interesado datosint, String asunto, LocalDateTime fecharegistro, LocalDateTime fechafinalizacion, ListaSimpleEnlazada<Documentos> Documentos, ListaSimpleEnlazada<Movimientos> Movimientos) {
        this.identificador = identificador;
        this.prioridad = prioridad;
        this.datosint = datosint;
        this.asunto = asunto;
        this.fecharegistro = fecharegistro;
        this.fechafinalizacion = fechafinalizacion;
        this.Documentos = Documentos;
        this.Movimientos = Movimientos;
    }
    
    public Expediente() {
        this.identificador = 0;
        this.prioridad = "";
        this.datosint = null;
        this.asunto = "";
        this.fecharegistro = null;
        this.fechafinalizacion = null;
        this.Documentos = null;
        this.Movimientos = null;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Interesado getDatosint() {
        return datosint;
    }

    public void setDatosint(Interesado datosint) {
        this.datosint = datosint;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public LocalDateTime getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(LocalDateTime fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public LocalDateTime getFechafinalizacion() {
        return fechafinalizacion;
    }

    public void setFechafinalizacion(LocalDateTime fechafinalizacion) {
        this.fechafinalizacion = fechafinalizacion;
    }

    public ListaSimpleEnlazada<Documentos> getDocumentos() {
        return Documentos;
    }

    public void setDocumentos(ListaSimpleEnlazada<Documentos> Documentos) {
        this.Documentos = Documentos;
    }

    public ListaSimpleEnlazada<Movimientos> getMovimientos() {
        return Movimientos;
    }

    public void setMovimientos(ListaSimpleEnlazada<Movimientos> Movimientos) {
        this.Movimientos = Movimientos;
    }
    
    public String VerInfo(){
        if (fechafinalizacion != null){
            return "ID: " + this.identificador + "\nPrioridad: " + this.prioridad + "\nINTERESADO" + datosint.VerInfo() + "\nAsunto: " + this.asunto + "\nFecha registro: " + 
                    this.fecharegistro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\nFecha finalizacion: " + this.fechafinalizacion.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        }else{
            return "ID: " + this.identificador + "\nPrioridad: " + this.prioridad + "\nINTERESADO" + datosint.VerInfo() + "\nAsunto: " + this.asunto + "\nFecha registro: " + 
                    this.fecharegistro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        }
    }
}
