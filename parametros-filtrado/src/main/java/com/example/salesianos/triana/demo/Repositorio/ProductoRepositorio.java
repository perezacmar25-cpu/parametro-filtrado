package com.example.salesianos.triana.demo.Repositorio;

import com.example.salesianos.triana.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepositorio extends JpaRepository<Producto,Long>{

    List<Producto>findByPrecioBetween(List<String>rangos);

    List<Producto>findByNombreContains(String texto);


}
