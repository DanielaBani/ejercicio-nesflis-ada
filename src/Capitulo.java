import java.util.List;

public class Capitulo implements ContenidoUnitario {

    private Integer duracionEnMinutos;
    private Serie serieALaQuePertenece;
    private List<String> actoresInvitados;

    public Boolean actuoEnEsteContenido(String actor) {return this.actoresInvitados.contains(actor);}
    //un metodo que nos diga si el actor que paso por parametro esta en la bolsa de actores invitados

    public Capitulo (Integer duracionEnMinutos, Serie serie){
        this.duracionEnMinutos=duracionEnMinutos;
        serieALaQuePertenece = serie;}

    public Boolean fueVistoCompletoPor (Usuario user){
        return user.visteCompletoUnitario(this); }

    public Integer cuantoDura () {return duracionEnMinutos;}

    public String getGenero () {return serieALaQuePertenece.getGenero();}

    public List<String> getActoresInvitados() { return actoresInvitados; }

    public void setActoresInvitados(List<String> actoresInvitados) {this.actoresInvitados = actoresInvitados;}}
