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
public class ClassProveedor {
    private String Nombre;
    private String Telefono;
    private String Producto;
    private int PrecioProd;
    private int cantidad;
    
    public ClassProveedor (){}
    
    public void setNombre (String nombre){
        this.Nombre = nombre;
    }
    
    public String getNombre (){
        return Nombre;
    }
    
    public void setTel (String tel){
        this.Telefono = tel;
    }
    
    public String getTel (){
        return Telefono;
    }
    
    public void setProd (String prod){
        this.Producto = prod;
    }
    
    public String getProd(){
        return Producto;
    }
    
    public void setPrecioProd (int Pprod){
        this.PrecioProd = Pprod;
    }
    
    public int getPrecioProd (){
        return PrecioProd;
    }
    
    public void setCant (int cant){
        this.cantidad = cant;
    }
    
    public int getCant (){
        return cantidad;
    }
}
