import java.util.List;

public class Pelicula implements ContenidoUnitario{
    private String genero;
    private Integer duracionEnMinutos;
    private List<String> actoresPrincipales;

    public Pelicula (String genero, Integer duracionEnMinutos,List<String> actoresPrincipales){
        this.genero=genero;
        this.duracionEnMinutos=duracionEnMinutos;
        this.actoresPrincipales=actoresPrincipales; }

    public Boolean actuoEnEsteContenido (String actor){ return this.actoresPrincipales.contains(actor);}

    public Boolean fueVistoCompletoPor (Usuario user){
        return user.visteCompletoUnitario(this);
    }

    public Integer cuantoDura () {return duracionEnMinutos;}

    public String getGenero () {return genero;}

    public List<String> getActoresPrincipales() {return actoresPrincipales; }

    public void setActoresPrincipales(List<String> actoresPrincipales) {this.actoresPrincipales = actoresPrincipales;}
}
