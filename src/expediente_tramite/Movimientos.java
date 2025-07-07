/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expediente_tramite;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author nemi
 */
public class Movimientos {
    private String movimiento;
    private LocalDateTime fechainicio;
    private LocalDateTime fechafinal;

    public Movimientos(String movimiento, LocalDateTime fechainicio, LocalDateTime fechafinal) {
        this.movimiento = movimiento;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
    }

    public Movimientos() {
        this.movimiento = "";
        this.fechainicio = null;
        this.fechafinal = null;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public LocalDateTime getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDateTime fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDateTime getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(LocalDateTime fechafinal) {
        this.fechafinal = fechafinal;
    }
    
    public String VerInfo() {
        if (this.fechafinal != null){
            return "Movimiento: " + movimiento + "\nInicio proceso: " + this.fechainicio.toString() + "\nFinal proceso: " + this.fechafinal.toString();
        }else{
            return "Movimiento: " + movimiento + "\nInicio proceso: " + this.fechainicio.toString() + "\nFinal proceso: ---";
        }
    }
}
