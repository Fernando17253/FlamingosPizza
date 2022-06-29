package com.upchiapas.Colas.models;

public class OrdenCompra extends ItemCompra{
    public OrdenCompra(){
        super();

    }

    public OrdenCompra(byte cantidad,float subtotal,short id,String especialidad, float precio){
        super(cantidad,subtotal,id, especialidad,precio);

    }
}
