package SUPERclases;

public abstract class Impresora {
    private String modelo;
    private int nivelTinta;

    public Impresora(String modelo, int nivelTinta){
        this.modelo = modelo;
        this.nivelTinta = nivelTinta;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    protected void consumirTinta(int cantidad) {
        nivelTinta = nivelTinta - cantidad;
    }

    public abstract void imprimirDocumento(String documento);
}
