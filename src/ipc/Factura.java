/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc;

import java.time.LocalDate;

/**
 *
 * @author macoas
 */
public class Factura {

    private String asunto;
    private LocalDate fecha;
    private double cantidad;
    private String tipo;

    public Factura(String asunto, LocalDate fecha, double cantidad, String tipo) {
        setAsunto(asunto);
        setFecha(fecha);
        setCantidad(cantidad);
        setTipo(tipo);
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Factura)) {
            return false;
        }

        Factura factura = (Factura) o;

        return this.asunto.equals(factura.getAsunto());
    }
    
    @Override
    public String toString(){
        return this.asunto+":"+this.tipo+":"+this.cantidad+":"+this.fecha;
    }

}
