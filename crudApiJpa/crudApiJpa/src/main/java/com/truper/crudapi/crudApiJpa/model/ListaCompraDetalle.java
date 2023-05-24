
package com.truper.crudapi.crudApiJpa.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ListaCompraDetalle implements Serializable {

    @EmbeddedId ListaCompraDetalleId listaCompraDetalleId;

    @ManyToOne
    @JoinColumn(name = "idLista")
    private int idListaCompraFK;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private int idCodigoProducto;

    public ListaCompraDetalle(ListaCompraDetalleId listaCompraDetalleId, int idListaCompraFK, int idCodigoProducto) {
        this.listaCompraDetalleId = listaCompraDetalleId;
        this.idListaCompraFK = idListaCompraFK;
        this.idCodigoProducto = idCodigoProducto;
    }

    public ListaCompraDetalle() {
    }

    public ListaCompraDetalleId getListaCompraDetalleId() {
        return listaCompraDetalleId;
    }

    public void setListaCompraDetalleId(ListaCompraDetalleId listaCompraDetalleId) {
        this.listaCompraDetalleId = listaCompraDetalleId;
    }

    public int getIdListaCompraFK() {
        return idListaCompraFK;
    }

    public void setIdListaCompraFK(int idListaCompraFK) {
        this.idListaCompraFK = idListaCompraFK;
    }

    public int getIdCodigoProducto() {
        return idCodigoProducto;
    }

    public void setIdCodigoProducto(int idCodigoProducto) {
        this.idCodigoProducto = idCodigoProducto;
    }
}

@Embeddable
class ListaCompraDetalleId implements Serializable {
    int idListaCompra;
    int codigoProducto;
}
