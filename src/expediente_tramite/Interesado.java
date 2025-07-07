/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expediente_tramite;

/**
 *
 * @author nemi
 */
public class Interesado {
    private int dni;
    private String nombres;
    private int telefono;
    private String email;
    private String tipo;
    
    public Interesado() {
        this.dni = 999;
        this.nombres = "";
        this.telefono = 999;
        this.email = "";
        this.tipo = "";
    }

    public Interesado(int dni, String nombres, int telefono, String email, String tipo) {
        this.dni = dni;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
        this.tipo = tipo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String VerInfo() {
        return "\nDNI: " + dni + "\nNombres: " + nombres + "\nTelefono: " + telefono + "\nEmail: " + email;
    }
    
    
}
