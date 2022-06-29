package com.upchiapas.Colas;
import com.upchiapas.Colas.models.CatalogoPizza;
import com.upchiapas.Colas.models.OrdenCompra;
import com.upchiapas.Colas.models.pizza;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static CatalogoPizza entry = new CatalogoPizza();

    public static OrdenCompra ordenentry = new OrdenCompra();
    public static Queue<CatalogoPizza> vecCatalogo = new LinkedList<CatalogoPizza>();
    public static Queue<OrdenCompra> vecOrden = new LinkedList<T>();

    private static java.lang.Object System;
    public static Scanner teclado = new Scanner(System.in);

    public static <String> void main(String[] args){
        int estado=0;
        do{
            estado=Inicio(estado);
        }while(estado!=2);
    }
    public static int Inicio(int estado){
        int i=0;
        do{
            System.out.println("Bienvenido a Menu Flamingos");
            System.out.println("(1)= |(Catalogo Pizza Agregar)|");
            System.out.println("(2)= |(Tomar Ordenes De Tienda)|");
            System.out.println("(4)= |(salir del Sitema)|");
            switch (teclado.nextInt()){
                case 1:{

                    do{
                        System.out.println("Ingrese el Id del la Pizza");
                        entry.setId(teclado.nextShort());
                        System.out.println("Ingrese la Especialida de Pizza");
                        entry.setEspecialidad(teclado.nextLine());
                        entry.setEspecialidad(teclado.nextLine());
                        System.out.println("Ingrese el costo de la pizza");
                        entry.setPrecio(teclado.nextFloat());
                        vecCatalogo.add(new CatalogoPizza(entry.getId(),entry.getEspecialidad(),entry.getPrecio()));
                        System.out.println("Deseas Ejecutar de nuevo |(1)= (si)| O |(2)=(No)|");
                        i=teclado.nextInt();
                    }while(i!=2);
                }break;
                case 2:{
                    OrdenPizza();
                }break;
                case 3:{

                }break;
                case 4:{
                    estado=2;
                }break;
            }
        }while(estado!=2);
        return estado;
    }
    public static void OrdenPizza(){
        int i=0;
        short id_compra = 0;
        byte piezas=0;
        float subSuma=0;

        MostrarCatalogo();
        System.out.println("ingrese el (id) |(Pizza a comprar)|");
        id_compra=teclado.nextShort();
        for (CatalogoPizza entra :vecCatalogo) {
            if(entra.getId()==id_compra){
                System.out.println("cuantas cajas de pizza se llevara");
                ordenentry.setCantidad(teclado.nextByte());
                subSuma=entra.getPrecio()*ordenentry.getCantidad();
                ordenentry.setSubtotal(subSuma);
                vecOrden.add(new OrdenCompra(ordenentry.getCantidad(),ordenentry.getSubtotal(),entra.getId(),entra.getEspecialidad(),entra.getPrecio()));
                System.out.println("Se encontro");
            }
        }
        MostrarOrden();
    }
    public static void MostrarCatalogo(){
        int i=0;
        for (CatalogoPizza entra: vecCatalogo) {
            System.out.println(entra.toString());
        }
        /*
        while (!listaPizza.isEmpty()){
            System.out.println(listaPizza.poll());
            i++;
        }*/
    }
    public static void MostrarOrden(){
        for (OrdenCompra entra: vecOrden) {
            System.out.println(entra.toString());
        }
    }

}

