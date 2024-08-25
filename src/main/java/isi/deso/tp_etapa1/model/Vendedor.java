/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp_etapa1.model;

/**
 *
 * @author jarteaga
 */

public class Vendedor {
    private int id;
    private String nombre;
    private String direccion;
    private Coordenada coordenadas;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Coordenada getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenada coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Vendedor() {}

    public Vendedor(int id, String nombre, String direccion, Coordenada coordenadas) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.coordenadas = coordenadas;
    }

    public double distancia(Cliente cliente){
        double radio = 6378;
        double latV = this.coordenadas.getLat();
        double lonV = this.coordenadas.getLgn();
        double latC = cliente.getCoordenada().getLat();
        double lonC = cliente.getCoordenada().getLgn();
        double dentroRaiz;
        dentroRaiz = ((Math.pow(Math.sin((latC-latV)/2),2))+Math.cos(latV)*Math.cos(latC)*(Math.pow(Math.sin((lonC-lonV)/2),2)));
        
        return 2*radio*Math.asin(Math.sqrt(dentroRaiz)); 
    }
 
}
