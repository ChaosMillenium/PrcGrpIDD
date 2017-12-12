
package Mensaje;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
public class MensajeVenta <T>{
    private T identificador;
    private T nombre; 
    private T empresa;
    private T numAcciones;
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
        return numAcciones;
    }

    public void setDineroInv(T dineroInv) {
        this.numAcciones = dineroInv;
    }
    //endregion
    public MensajeVenta(){
        //mensaje<>();
    }
    

   
}
