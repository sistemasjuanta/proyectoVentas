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
public class Marca extends Tipo{

    public Marca(int id, String codigo, String nombre, String detalle) {
        super(id, codigo, nombre, detalle);
    }

    @Override
    public String toString() {
        return "Marca{" + '}';
    }
    
    
}
