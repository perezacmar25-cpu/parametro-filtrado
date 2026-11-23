package com.example.salesianos.triana.demo;

import com.example.salesianos.triana.demo.model.Producto;
import com.example.salesianos.triana.demo.model.Rango;
import jakarta.persistence.criteria.Path;
import org.springframework.data.jpa.domain.PredicateSpecification;

import java.math.BigDecimal;
import java.util.Locale;

public class ProductoSpecifications {


    public static PredicateSpecification<Producto> contieneNombre(String texto) {
        return (from, cb) -> {

            return cb.like(
                    cb.lower(from.get("nombre")),
                    "%" + texto.toLowerCase() + "%"

            );

        };
    }

    public static PredicateSpecification<Producto>precioRango(Rango rango){

        return (from,cb)->{
            Path<BigDecimal> precio = from.get("precio");
            if(rango.max()!=null && rango.min()!=null){
                return cb.between(precio,rango.min(),rango.max());
            }
            if (rango.min()!=null){
                return cb.greaterThanOrEqualTo(precio,rango.min());
            }

            if(rango.max()!=null){
                return cb.lessThanOrEqualTo(precio,rango.max());
            }
            return cb.conjunction();

        };

    }
}