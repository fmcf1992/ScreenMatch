import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Harry Potter");
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
        casaDragon.setMinutosPorEpisodios(56);
        casaDragon.setEpisodiosPorTemporadas(6);

        casaDragon.muestraFichaTecnica();
        System.out.println("Duracion de la serie    : "+casaDragon.getDuracionEnMinutos());

    }
}
