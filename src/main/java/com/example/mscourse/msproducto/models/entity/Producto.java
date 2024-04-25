package com.example.mscourse.msproducto.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Table
@Entity(name = "productos")
public class Producto implements Serializable { //buena practica para convertir nuestro objeto en bytes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)//para solo guardar la fecha
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
