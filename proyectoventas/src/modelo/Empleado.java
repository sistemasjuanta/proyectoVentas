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
public class Empleado extends Persona {
    
    int dpi;

    public Empleado(int dpi, int id, String codigo, String nombre, String apellido, String direccion, String email, int telefono1, int telefono2) {
        super(id, codigo, nombre, apellido, direccion, email, telefono1, telefono2);
        this.dpi = dpi;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }
    
    
    
           
}
