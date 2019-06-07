import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Temporada implements ContenidoUnitario {
    private List<Capitulo> capitulos= new ArrayList<>();
    private String genero;
    private Serie serieALaQuePertenece;


    public Boolean actuoEnEsteContenido(String actor){ return this.capitulos.stream().anyMatch(c-> c.actuoEnEsteContenido(actor));}

    public String getGenero () {return serieALaQuePertenece.getGenero();}

    public List<Capitulo> getCapitulos() {   return capitulos;    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;   }

    public Boolean fueVistoCompletoPor (Usuario user){
        return this.capitulos.stream().allMatch(capitulo->capitulo.fueVistoCompletoPor(user));}

     public Integer cuantoDura () {
        return this.capitulos.stream().mapToInt(capitulo->capitulo.cuantoDura()).sum();}

     public Capitulo ultimoCapituloDisponible () {
        return this.capitulos.get(capitulos.size()-1); }
}
