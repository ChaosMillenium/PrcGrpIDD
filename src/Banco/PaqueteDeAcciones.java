package Banco;
public class PaqueteDeAcciones{
    //region Atributos
    private String nombreEmpresa;
    private Integer numeroTitulos;
    private Double precioIndividual;

    //Atributos derivados
    private Double precioCompleto;
    private Double precioOriginal;
    private Double variacion;

    //endregion
    //region Constructor
    public PaqueteDeAcciones(String nombreEmpresa, Integer numeroTitulos, Double precioIndividual) {
        this.nombreEmpresa = nombreEmpresa;
        this.numeroTitulos = numeroTitulos;
        this.precioOriginal = precioOriginal;
    }

    //endregion
    //region Getters y Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Integer getNumeroTitulos() {
        return numeroTitulos;
    }

    public void setNumeroTitulos(Integer numeroTitulos) {
        this.numeroTitulos = numeroTitulos;
    }

    public Double getPrecioIndividual() {
        return precioIndividual;
    }

    public void setPrecioIndividual(Double precioIndividual) {
        this.precioIndividual = precioIndividual;
    }

    public Double getPrecioCompleto() {
        return precioCompleto;
    }

    public void setPrecioCompleto(Double precioCompleto) {
        this.precioCompleto = (getNumeroTitulos() * getPrecioIndividual());
    }

    public Double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(Double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public Double getVariacion() {
        return variacion;
    }

    public void setVariacion(Double variacion) {
        this.variacion = (getPrecioCompleto() - getPrecioOriginal());
    }

    //endregion

}