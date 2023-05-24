package com.truper.crudapi.crudApiJpa.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class ListaCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLista;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private int customerId;

    @Column
    private String nombre;

    @Column
    private Date fechaRegistro;

    @Column
    private Date fechaUltimaActualizacion;

    public ListaCompra(int idLista, int customerId, String nombre, Date fechaRegistro, Date fechaUltimaActualizacion) {
        this.idLista = idLista;
        this.customerId = customerId;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public ListaCompra() {
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }
}
