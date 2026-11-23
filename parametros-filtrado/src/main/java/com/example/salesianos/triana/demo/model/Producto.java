package com.example.salesianos.triana.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    private Long id;

    private String nombre;

    private double precio;

    private String marca;
}
