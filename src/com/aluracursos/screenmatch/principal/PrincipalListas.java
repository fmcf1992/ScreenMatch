package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Harry Potter 1",2001);
        miPelicula.evalua(9);
        Pelicula otrapelicula = new Pelicula("El hombre araña",2003);
        otrapelicula.evalua(8);
        Serie casaDragon = new Serie("Casa de papel",2021);
        casaDragon.evalua(6);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otrapelicula);
        lista.add(casaDragon);

        System.out.println();
//        for(Titulo item: lista){
//            System.out.println(item);
//            if ( item instanceof Pelicula pelicula) {
//                System.out.println(pelicula.getClasificacion());
//            }
//        }
        System.out.println();
        lista.forEach(System.out::println);

        System.out.println("Titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

//
//        System.out.println();
//        lista.forEach(item -> System.out.println(item));

    }
}
