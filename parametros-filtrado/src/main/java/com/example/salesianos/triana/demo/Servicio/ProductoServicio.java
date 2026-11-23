package com.example.salesianos.triana.demo.Servicio;

import com.example.salesianos.triana.demo.Repositorio.ProductoRepositorio;
import com.example.salesianos.triana.demo.model.Producto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoServicio {

    private final ProductoRepositorio productoRepositorio;

    public List<Producto> buscarPorPrecio(List<String>rangos){

        return productoRepositorio.findByPrecioBetween(rangos)
    }
}
