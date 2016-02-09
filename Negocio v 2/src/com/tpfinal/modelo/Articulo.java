package com.tpfinal.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Desi
 */
public class Articulo implements Serializable{

    int idArticulo;
    String Nombre;
    String Marca;
    float Precio;
    int Stock;
    String Observaciones;
    String Descripcion;
    String Actividad;
    Date fechaAlta;

    public Articulo() {
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public float getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public void Articulo(String Nombre, String Marca, String Precio, int Stock, String Observaciones, String Descripcion, String Actividad) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Precio = (float) Integer.parseInt(Precio);
        this.Stock = Stock;
        this.Observaciones = Observaciones;
        this.Descripcion = Descripcion;
        this.Actividad = Actividad;
        this.fechaAlta = new Date();
    }

    public void CargarArticulo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ModificarArticulo(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
