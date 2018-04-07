/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.asiguenza;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex Siguenza <00068817@uca.edu.sv>
 */
public class ClassFactura {

    private ArrayList<DatosFactura> factura; 

    public ClassFactura (){
        factura = new ArrayList<>();
    }
    
    public void generar(){
        DatosFactura df = new DatosFactura();
        
        Scanner in = new Scanner(System.in);
        
        factura.add(df);
        System.out.println("Nombre del cliente:");
        df.setNombre(in.nextLine());
        System.out.println("Productos:");
        df.setProductos(in.nextLine());
        System.out.println("Cantidad de dicho producto:");
        df.setCantidadProductos(in.nextInt());
        System.out.println("Cantidad total de productos:");
        df.setCantidadTotal(in.nextInt());
        System.out.println("Total:");
        df.setTotalFacturado(in.nextInt());
    }
}
