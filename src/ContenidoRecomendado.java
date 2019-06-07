import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContenidoRecomendado {

    private List<ContenidoUnitario> contenidosDestacados= new ArrayList<>();
    private Usuario usuario;

    public List<ContenidoUnitario> contenidosIncompletos(){ return
            this.usuario.getContenidosVistos().stream().filter(c->!c.fueVistoCompletoPor(usuario)).collect(Collectors.toList());}

    public List<ContenidoUnitario> getContenidosDestacados(){  return contenidosDestacados;  }

    public void setContenidosDestacados(List<ContenidoUnitario> contenidosRecomendadosEmpresa) {
        this.contenidosDestacados = contenidosRecomendadosEmpresa; }




}
