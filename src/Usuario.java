import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Usuario {
    private List<ContenidoUnitario> contenidosVistos = new ArrayList<>();

    public List<ContenidoUnitario> getContenidosVistos() {return this.contenidosVistos;}

    public void miraEsteContenido (ContenidoUnitario unContenido){
        this.contenidosVistos.add(unContenido);}

    public Boolean visteCompleto (ContenidoUnitario unContenido) {
        return unContenido.fueVistoCompletoPor(this);    }

    public Boolean visteCompletoUnitario (ContenidoUnitario unContenido){
          return this.contenidosVistos.contains(unContenido); }

    public Set<String> generosSinRepetir() {
        return contenidosVistos.stream().map(contenido->contenido.getGenero()).distinct().collect(Collectors.toSet()); }

    public String generoPreferido() {return this.generosSinRepetir().stream()
                .max(Comparator.comparing(g -> this.minutosVistosDe(g))).get(); }
    //le pregunta a los generos vistos por el usuario cual fue el de mas minutos vistos

    public Integer minutosVistosDe (String genero){ return contenidosVistos.stream()
                .filter(contenidoUnitario->contenidoUnitario.getGenero().equals(genero))
            //filtra a los contenidos que tienen el genero que pasé por parametro
                 .mapToInt(contenido -> contenido.cuantoDura()).sum();}
                //a cada uno de esos contenidos le pregunta cuanto duran y los suma todos

    public Boolean sosFanDe (String actor) { return this.contenidosVistos.stream().allMatch(c->c.actuoEnEsteContenido(actor));}
}
