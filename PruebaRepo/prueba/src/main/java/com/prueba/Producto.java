package com.prueba;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    private int idproducto;
    private String nombreproducto;
    private String descripcion;
    
}
