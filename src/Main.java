import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main { public static void main (String [] args){

  List <String> actoresPrincipales1 = new ArrayList<String>();
  Stream.of("Julia Roberts", "Tom Hanks", "Gino Renni").collect(Collectors.toList());

  List <String> actoresPrincipales2 = new ArrayList<String>();
  Stream.of("Ricardo Darin", "Pablo Echarri", "Tom Hanks").collect(Collectors.toList());

  Pelicula elBebeDeRosemary = new Pelicula("Terror", 120, actoresPrincipales1);
  Serie serie1 = new Serie("Accion", actoresPrincipales2);
  Capitulo capitulo1 = new Capitulo(25, serie1 );
  Capitulo capitulo2 = new Capitulo(25, serie1);
  Capitulo capitulo3 = new Capitulo(30, serie1);
  Capitulo capitulo4 = new Capitulo(30, serie1);
  Temporada temporada1 = new Temporada();
  Temporada temporada2 = new Temporada();

  List<Capitulo> capitulosTemporada1 = new ArrayList<Capitulo>();
          Stream.of(capitulo1,capitulo2).collect(Collectors.toList());

  List<Capitulo> capitulosTemporada2 = new ArrayList<Capitulo>();
  Stream.of(capitulo3,capitulo4).collect(Collectors.toList());

  List<Temporada> temporadasSerie = new ArrayList<Temporada>();
  Stream.of(temporada1,temporada2).collect(Collectors.toList());

  temporada1.setCapitulos(capitulosTemporada1);
  temporada2.setCapitulos(capitulosTemporada2);

  serie1.setTemporadas(temporadasSerie);
  Usuario marcos = new Usuario();
  marcos.miraEsteContenido(elBebeDeRosemary);

  System.out.println(serie1.cuantoDura());
    System.out.println(marcos.visteCompleto(elBebeDeRosemary));

}
}
