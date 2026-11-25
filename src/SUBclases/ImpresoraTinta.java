package SUBclases;

import SUPERclases.Impresora;

public class ImpresoraTinta extends Impresora {
    public ImpresoraTinta(String modelo, int nivelTinta){
        super(modelo, nivelTinta);
    }

    @Override
    public void imprimirDocumento(String documento) {
        if (getNivelTinta() >= 20) {
            consumirTinta(10);
            System.out.println("[Tinta " + getModelo() + "] Imprimiendo a color: " + documento);
        } else {
            System.out.println("[Tinta " + getModelo() + "] Tinta insuficiente, no se imprimió: " + documento);
        }
    }
}
