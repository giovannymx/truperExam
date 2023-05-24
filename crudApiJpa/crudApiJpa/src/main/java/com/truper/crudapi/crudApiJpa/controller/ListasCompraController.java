package com.truper.crudapi.crudApiJpa.controller;

import com.truper.crudapi.crudApiJpa.model.ListaCompra;
import com.truper.crudapi.crudApiJpa.service.ListasCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ListasCompraController {

    @Autowired
    ListasCompraService listasCompraService;

    @PostMapping("/listacompra")
    public String saveListaCompra(@RequestBody ListaCompra newListaCompra) {
        return listasCompraService.saveListaCompra(newListaCompra);
    }

    @GetMapping("/listacompra")
    public List<ListaCompra> getAllListaCompra() {
        return listasCompraService.getAllListaCompra();
    }

    @PutMapping("/listacompra/{idLista}")
    public String updateListaCompra(@PathVariable int idLista, @RequestBody ListaCompra listaCompra) {
        return listasCompraService.updateListaCompra(idLista, listaCompra);
    }

    @DeleteMapping("/listacompra/{idLista}")
    public String deleteListaCompra(int idLista) {
        return listasCompraService.deleteListaCompra(idLista);
    }
}
