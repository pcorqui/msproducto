package com.example.mscourse.msproducto.models.service;

import com.example.mscourse.msproducto.models.dao.ProductoDao;
import com.example.mscourse.msproducto.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoDao productoDao;
    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }
}
