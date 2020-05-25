/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.InputStream;

/**
 *
 * @author Thomas
 */
public class registro {
    int idDNI;
    String nombre;
    String apellido;
    int edad;
    InputStream foto;
    public registro(){
    
    }

    public registro(int idDNI, String nombre, String apellido, int edad, InputStream foto) {
        this.idDNI = idDNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.foto = foto;
    }

    public int getidDNI() {
        return idDNI;
    }

    public void setidDNI(int idDNI) {
        this.idDNI = idDNI;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public InputStream getfoto() {
        return foto;
    }

    public void setfoto(InputStream foto) {
        this.foto = foto;
    }

    
}
