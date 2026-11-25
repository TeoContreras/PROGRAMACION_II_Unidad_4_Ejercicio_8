package SUBclases;

import SUPERclases.Impresora;

public class ImpresoraMatricial extends Impresora {
    public ImpresoraMatricial(String modelo, int nivelTinta){
        super(modelo, nivelTinta);
    }

    @Override
    public void imprimirDocumento(String documento) {
        if (getNivelTinta() >= 5) {
            consumirTinta(2);
            System.out.println("[Matricial " + getModelo() + "] Imprimiendo por impacto: " + documento);
        } else {
            System.out.println("[Matricial " + getModelo() + "] Cinta gastada, no se imprimió: " + documento);
        }
    }
}
