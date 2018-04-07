/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asiguenza;

/**
 *Clase cliente
 * @author Alex Siguenza <00068817@uca.edu.sv>
 */
public class DatosFactura {
    
    private String nombre;
    private String productos;
    private int cantidadProducto;
    private int cantidadtotal;
    private int total;
    
    
    public DatosFactura () {}
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setProductos (String NombreProducto){
        this.productos = NombreProducto;
    }
    
    public String getProductos (){
        return productos;
    }
    
    public void setCantidadProductos (int CantProd){
        this.cantidadProducto = CantProd;
    }
    
    public int getCantidadProductos (){
         return cantidadProducto;
     }
     
    public void setCantidadTotal (int Total){
        this.cantidadtotal = Total;
    }
    
    public int getCantidadTotal () {
        return cantidadtotal;
    }
    
    public void setTotalFacturado (int Total) {
        this.total = Total;
    }
    
    public int getTotalFacturado (){
        return total;
    }
}
