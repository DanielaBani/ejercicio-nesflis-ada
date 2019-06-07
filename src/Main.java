import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main { public static void main (String [] args){

  List <String> actoresPrincipales1 = Stream.of("Julia Roberts", "Tom Hanks", "Gino Renni").collect(Collectors.toList());

  List <String> actoresPrincipales2 = Stream.of("Ricardo Darin", "Pablo Echarri", "Tom Hanks").collect(Collectors.toList());

  Pelicula elBebeDeRosemary = new Pelicula("Terror", 120, actoresPrincipales1);
  Pelicula locoPorMary = new Pelicula("Accion", 140, actoresPrincipales1);
  Serie serie1 = new Serie("Accion", actoresPrincipales2);
  Capitulo capitulo1 = new Capitulo(25, serie1 );
  Capitulo capitulo2 = new Capitulo(25, serie1);
  Capitulo capitulo3 = new Capitulo(30, serie1);
  Capitulo capitulo4 = new Capitulo(30, serie1);
  Temporada temporada1 = new Temporada();
  Temporada temporada2 = new Temporada();

  List<Capitulo> capitulosTemporada1 = Stream.of(capitulo1,capitulo2).collect(Collectors.toList());

  List<Capitulo> capitulosTemporada2 = Stream.of(capitulo3,capitulo4).collect(Collectors.toList());

  List<Temporada> temporadasSerie = Stream.of(temporada1,temporada2).collect(Collectors.toList());

  temporada1.setCapitulos(capitulosTemporada1);
  temporada2.setCapitulos(capitulosTemporada2);

  capitulo4.setTitulo("Capitulo 4");

  serie1.setTemporadas(temporadasSerie);
  Usuario marcos = new Usuario();
  marcos.miraEsteContenido(elBebeDeRosemary);
  marcos.miraEsteContenido(locoPorMary);

  System.out.println(serie1.cuantoDura());
    System.out.println(marcos.visteCompleto(elBebeDeRosemary));

  marcos.miraEsteContenido(capitulo1);
  marcos.miraEsteContenido(capitulo2);

  System.out.println(marcos.visteCompleto(serie1));
  System.out.println(elBebeDeRosemary.actuoEnEsteContenido("Pablo Echarri"));

  System.out.println(temporada2.cuantoDura());
  System.out.println(serie1.ultimoCapituloDisponible().getTitulo());
  System.out.println(marcos.generosSinRepetir());
  System.out.println(marcos.generoPreferido());


}
}
