package com.truper.crudapi.crudApiJpa.service;


import com.truper.crudapi.crudApiJpa.model.ListaCompra;
import com.truper.crudapi.crudApiJpa.repository.ListasCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListasCompraService {
    @Autowired
    private ListasCompraRepository listasCompraRepository;

    public String saveListaCompra(ListaCompra newListaCompra) {
        listasCompraRepository.save(newListaCompra);

        return "Lista Compra guardada...";
    }
    public List<ListaCompra> getAllListaCompra() {
        return listasCompraRepository.findAll();
    }

    public String updateListaCompra(int idLista, ListaCompra listaCompra) {
        ListaCompra updatedListaCompra = listasCompraRepository.findById(idLista).get();

        updatedListaCompra.setNombre(listaCompra.getNombre());

        listasCompraRepository.save(updatedListaCompra);
        return "Lista Compra actualizada...";

    }

    public String deleteListaCompra(int idLista) {
        ListaCompra deletedListaCompra = listasCompraRepository.findById(idLista).get();

        listasCompraRepository.delete(deletedListaCompra);

        return "Lista Compra borrada...";
    }

}
