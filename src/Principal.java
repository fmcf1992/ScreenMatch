import com.aluracursos.screenmatch.calculo.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculo.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Harry Potter 1");
        miPelicula.setFechaDeLanzamiento(2001);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evalua(9);
        miPelicula.evalua(7.5);
        miPelicula.evalua(8.3);

        miPelicula.muestraFichaTecnica();
        System.out.println("Media de evaluaciones   : " + miPelicula.calculaMedia());
        System.out.println("Total de evaluaciones   : " + miPelicula.getTotalDeLasEvaluaciones());

        Serie casaDragon = new Serie();
        System.out.println();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporadas(6);

        Pelicula otrapelicula = new Pelicula();
        otrapelicula.setNombre("Harry Potter 2");
        otrapelicula.setFechaDeLanzamiento(2003);
        otrapelicula.setDuracionEnMinutos(100);
        otrapelicula.setIncluidoEnElPlan(true);

        casaDragon.muestraFichaTecnica();
        System.out.println("Duracion de la serie    : "+casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otrapelicula);
        System.out.println("Tiempo total : "+calculadora.getTiempoToral() + " min.");


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("La casa targedia");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtro(episodio);
    }
}
