/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asiguenza;

/**
 *
 * @author Alex Siguenza <00068817@uca.edu.sv>
 */
public class ClassProducto {
    private String nombre;
    private int precio;
    private int cantidad;
    private int cod;
    private String proveedor;
    
    public ClassProducto () {}
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public void setPrecio (int precio){
        this.precio = precio;
    }
    
    public int getPrecio (){
        return precio;
    }
    
    public void setCant (int cant){
        this.cantidad = cant;
    }
    
    public int getCant (){
        return cantidad;
    }
    
    public void setCod (int cod){
        this.cod = cod;
    }
    
    public int getCod () {
        return cod;
    }
    
    public void setProveedor (String prov){
        this.proveedor = prov;
    }
    
    public String getProveedor (){
        return proveedor;
    }
}
