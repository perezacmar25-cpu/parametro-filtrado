package com.example.salesianos.triana.demo.Controller;

import com.example.salesianos.triana.demo.Servicio.ProductoServicio;
import com.example.salesianos.triana.demo.model.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    private ProductoServicio productoServicio;

    @GetMapping
    public List<Producto> buscarPorRangoPrecio(@RequestParam String nombre, @RequestParam List<String> rangos){



    }
}
