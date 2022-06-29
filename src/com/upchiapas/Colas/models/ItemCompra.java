package com.upchiapas.Colas.models;

public class ItemCompra extends pizza{
    private byte cantidad;
    private float subtotal;
    public ItemCompra() {

    }
    public ItemCompra(byte cantidad,float subtotal,short id,String especialidad, float precio){
        super(id, especialidad,precio);
        this.cantidad=cantidad;
        this.subtotal=subtotal;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getSubtotal() {
        return subtotal;
    }

    @Override
    public String toString() {
        return "la cantidad de Piezas ("+getCantidad()+") \n"+" El total a pagar es ("+getSubtotal()+") \n"+super.toString();
    }
}

