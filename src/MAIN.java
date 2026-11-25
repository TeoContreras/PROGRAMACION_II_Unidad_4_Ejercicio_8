import ORGANIZADOR.ServidorImpresion;
import SUBclases.ImpresoraLaser;
import SUBclases.ImpresoraMatricial;
import SUBclases.ImpresoraTinta;

public class MAIN {
    public static void main(String[] args) {
        ServidorImpresion servidor = new ServidorImpresion();
        servidor.agregarImpresora(new ImpresoraLaser("HP LaserJet", 50));
        servidor.agregarImpresora(new ImpresoraTinta("Epson EcoTank", 25));
        servidor.agregarImpresora(new ImpresoraMatricial("Epson LX-350", 6));

        System.out.println("--- Trabajo 1 ---");
        servidor.enviarTrabajo("Informe mensual");

        System.out.println("--- Trabajo 2 ---");
        servidor.enviarTrabajo("Factura 0001");

        System.out.println("--- Estado operativo ---");
        servidor.mostrarEstado();
    }
}
