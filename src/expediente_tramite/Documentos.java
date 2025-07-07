/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expediente_tramite;

/**
 *
 * @author nemi
 */
public class Documentos {
    private String departamento;
    private String titulo;
    private String remitente;

    public Documentos(String departamento, String titulo, String remitente) {
        this.departamento = departamento;
        this.titulo = titulo;
        this.remitente = remitente;
    }

   

    public Documentos() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    
    
}
