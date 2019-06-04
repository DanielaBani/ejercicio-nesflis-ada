import java.util.List;

public class Serie implements ContenidoUnitario {
    private String genero;
    private Integer duracion;
    private List<Temporada> temporadas;
    private List<String> actoresPrincipales;

    public Serie(String genero, List<String> actoresPrincipales) {
        this.genero = genero;
    this.actoresPrincipales=actoresPrincipales;}

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;   }

    public Boolean fueVistoCompletoPor(Usuario user) {
        return this.temporadas.stream().allMatch(temporada -> temporada.fueVistoCompletoPor(user));
    }
    public Integer cuantoDura() { return this.temporadas.stream().mapToInt(temporada->temporada.cuantoDura()).sum();}

    public Capitulo ultimoCapituloDisponible () {return this.temporadas.get(temporadas.size()-1).ultimoCapituloDisponible();}
    //la serie le pregunta a la ultima temporada agregada cual es el ultimo capitulo disponible

    public String getGenero() {return genero;}

    public Boolean actuoEnEsteContenido (String actor){ return
            this.actoresPrincipales.contains(actor)|| //nos falta encontrar como escribir que cumpla una condicion O la otra
            this.temporadas.stream().anyMatch(t->t.actuoEnEsteContenido(actor));}

}
