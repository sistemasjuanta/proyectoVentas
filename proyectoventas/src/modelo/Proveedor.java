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
public class Proveedor extends Persona{

    int nit;

    public Proveedor(int nit, int id, String codigo, String nombre, String apellido, String direccion, String email, int telefono1, int telefono2) {
        super(id, codigo, nombre, apellido, direccion, email, telefono1, telefono2);
        this.nit = nit;
        
    }

    

    

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
     

   
    
    
}
