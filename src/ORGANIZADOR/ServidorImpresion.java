package ORGANIZADOR;

import SUPERclases.Impresora;

import java.util.ArrayList;
import java.util.List;

public class ServidorImpresion {
    private List<Impresora> impresoras = new ArrayList<>();

    public void agregarImpresora(Impresora impresora){
        impresoras.add(impresora);
    }

    public void enviarTrabajo(String documento){
        for (Impresora i : impresoras) {
            i.imprimirDocumento(documento);
        }
    }

    public void mostrarEstado(){
        for (Impresora i : impresoras) {
            if (i.getNivelTinta() > 0) {
                System.out.println(i.getModelo() + " | consumible: " + i.getNivelTinta() + "% | operativa");
            } else {
                System.out.println(i.getModelo() + " | consumible: " + i.getNivelTinta() + "% | sin consumibles");
            }
        }
    }
}
