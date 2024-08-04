package com.example.mscourse.msproducto.controllers;

import com.example.mscourse.msproducto.models.dao.ProductoDao;
import com.example.mscourse.msproducto.models.entity.Producto;
import com.example.mscourse.msproducto.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar(){
        System.out.println("consultado");
        return productoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Producto detalle(@PathVariable Long id){
        return productoService.findById(id);
    }
}
