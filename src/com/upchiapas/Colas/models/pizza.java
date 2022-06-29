package com.upchiapas.Colas.models;

public class pizza{
    private short id;
    private String especialidad;
    private float precio;

    public pizza() {
    }
    public pizza(short id, String especialidad, float precio) {
        this.id = id;
        this.especialidad = especialidad;
        this.precio = precio;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", especialidad='" + especialidad + '\'' +
                ", precio=" + precio +
                '}';
    }
}