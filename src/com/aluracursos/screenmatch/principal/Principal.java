package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Harry Potter 1",2001);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

//        miPelicula.evalua(9);
//        miPelicula.evalua(7.5);
//        miPelicula.evalua(8.3);

//        miPelicula.muestraFichaTecnica();
//        System.out.println("Media de evaluaciones   : " + miPelicula.calculaMedia());
//        System.out.println("Total de evaluaciones   : " + miPelicula.getTotalDeLasEvaluaciones());
//
//        Serie casaDragon = new Serie();
//        System.out.println();
//        casaDragon.setNombre("La casa del dragon");
//        casaDragon.setFechaDeLanzamiento(2022);
//        casaDragon.setTemporadas(1);
//        casaDragon.setMinutosPorEpisodios(50);
//        casaDragon.setEpisodiosPorTemporadas(6);

        Pelicula otrapelicula = new Pelicula("Harry Potter 2",2003);
        otrapelicula.setDuracionEnMinutos(100);
        otrapelicula.setIncluidoEnElPlan(true);

//        casaDragon.muestraFichaTecnica();
//        System.out.println("Duracion de la serie    : "+casaDragon.getDuracionEnMinutos());
//
//        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
//        calculadora.incluye(miPelicula);
//        calculadora.incluye(casaDragon);
//        calculadora.incluye(otrapelicula);
//        System.out.println("Tiempo total : "+calculadora.getTiempoToral() + " min.");
//
//
//        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
//        filtroRecomendacion.filtro(miPelicula);
//
//        Episodio episodio = new Episodio();
//        episodio.setNombre("La casa targedia");
//        episodio.setSerie(casaDragon);
//        episodio.setTotalVisualizaciones(50);
//        filtroRecomendacion.filtro(episodio);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(otrapelicula);

        System.out.println("Tamaño de la lista :" +  listaPeliculas.size());
        System.out.println("Primer elemento de la lista : " + listaPeliculas.get(0));
        System.out.println(listaPeliculas);


    }
}
