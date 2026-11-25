package SUBclases;

import SUPERclases.Impresora;

public class ImpresoraLaser extends Impresora {
    public ImpresoraLaser(String modelo, int nivelTinta){
        super(modelo, nivelTinta);
    }

    @Override
    public void imprimirDocumento(String documento) {
        if (getNivelTinta() >= 10) {
            consumirTinta(5);
            System.out.println("[Láser " + getModelo() + "] Imprimiendo en blanco y negro: " + documento);
        } else {
            System.out.println("[Láser " + getModelo() + "] Tóner insuficiente, no se imprimió: " + documento);
        }
    }
}
