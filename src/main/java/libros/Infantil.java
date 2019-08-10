package libros;

import java.util.Date;

public class Infantil extends Libro {

    private Integer edadDesde;

    private Date edadHasta;


    public Integer getEdadDesde() {
        return edadDesde;
    }

    public void setEdadDesde(Integer edadDesde) {
        this.edadDesde = edadDesde;
    }

    public Date getEdadHasta() {
        return edadHasta;
    }

    public void setEdadHasta(Date edadHasta) {
        this.edadHasta = edadHasta;
    }

}
