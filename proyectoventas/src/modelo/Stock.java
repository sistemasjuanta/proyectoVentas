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
public class Stock {
    protected int id;
    protected String codigo;
    protected String detalle;
    protected int cantidad;
    protected double precioCompra;
    protected double precioVenta;

    public Stock(int id, String codigo, String detalle, int cantidad, double precioCompra, double precioVenta) {
        this.id = id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", codigo=" + codigo + ", detalle=" + detalle + ", cantidad=" + cantidad + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + '}';
    }
    
    
       
    
}
