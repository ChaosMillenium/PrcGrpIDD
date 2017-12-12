
package Mensaje;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;

public class MensajeCompra <T>{
    private T identificador;
    private T nombre; 
    private T empresa;
    private T dineroInv;
    private ArrayList<String> mensaje;
    //region GET&SET
    public T getIdentificador() {
        return identificador;
    }

    public void setIdentificador(T identificador) {
        this.identificador = identificador;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getEmpresa() {
        return empresa;
    }

    public void setEmpresa(T empresa) {
        this.empresa = empresa;
    }

    public T getDineroInv() {
        return dineroInv;
    }

    public void setDineroInv(T dineroInv) {
        this.dineroInv = dineroInv;
    }
    //endregion
    public MensajeCompra(){
        
    }
}
