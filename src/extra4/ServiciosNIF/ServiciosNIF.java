
package extra4.ServiciosNIF;

import extra4.Atributos.NIF;
import java.util.Scanner;

public class ServiciosNIF {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public void crearNIF(NIF x){
        System.out.println("Ingrese su DNI (sin puntos)");
        x.setDNI(leer.nextInt());
        char nif [] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = x.getDNI()%23;
        x.setLetra(nif[resto-1]);
        System.out.println("La letra asignada es: "+x.getLetra());
        }
  
    public void mostrar(NIF x){       
        int dni = x.getDNI();
        int digitos = 0;
        do{
            dni = (int) dni/10;
            digitos++;
        }while(dni != 0);          
        if (digitos==8){
            System.out.println(x.getDNI()+"-"+x.getLetra()); 
        }else{
            for(int i = 0; i<8-digitos;i++){
                System.out.print("0");
            }
            System.out.println(x.getDNI()+"-"+x.getLetra());
        }      
    }
}