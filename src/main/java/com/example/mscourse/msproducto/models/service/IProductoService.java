package com.example.mscourse.msproducto.models.service;

import com.example.mscourse.msproducto.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
}
