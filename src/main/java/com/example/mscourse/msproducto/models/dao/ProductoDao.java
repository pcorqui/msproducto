package com.example.mscourse.msproducto.models.dao;

import com.example.mscourse.msproducto.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long> {


}
