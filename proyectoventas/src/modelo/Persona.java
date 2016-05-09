/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juanta
 */
public class Persona {
    protected int id;
    protected String codigo;
    protected String nombre; 
    protected String apellido;
    protected String direccion;
    protected String email;
    protected int telefono1;
    protected int telefono2;

    public Persona() {
    }

    public Persona(int id, String codigo, String nombre, String apellido, String direccion, String email, int telefono1, int telefono2) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", email=" + email + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + '}';
    }
           
}
