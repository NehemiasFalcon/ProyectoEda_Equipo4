/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author nemi
 */
public class Administrador {
    private String usuario;
    private String contrasena;
    
    public void Administrador(){
        this.usuario = "nehemias";
        this.contrasena = "123";
    }

    public Administrador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public boolean validar(String us, String contra){
        if (usuario.equals(us) && contrasena.equals(contra)){
            return true;
        }
        else{
            return false;
        }
    }
}
