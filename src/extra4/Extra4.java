
package extra4;

import extra4.Atributos.NIF;
import extra4.ServiciosNIF.ServiciosNIF;

public class Extra4 {

    public static void main(String[] args) {
        NIF a = new NIF();
        ServiciosNIF b = new ServiciosNIF();
        b.crearNIF(a);
        b.mostrar(a);
    }  
}
