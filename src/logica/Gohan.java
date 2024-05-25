
package logica;

public class Gohan extends Sayayin implements IGohanSSj {

    public Gohan(int numSayayin, String nombre, double peso, String sexo, int temporada) {
        super(numSayayin, nombre, peso, sexo, temporada);
    }

    
    @Override
    protected void elevarKi() {
        System.out.println("Soy Gohan y estoy elevando el Ki");
    }

    @Override
    protected void bolaDeEnergia() {
        System.out.println("Soy Gohan y estoy disparando bola de energía");
    }

    @Override
    protected void volar() {
        System.out.println("Soy Gohan y estoy volando");
    }

    @Override
    public void hameHame() {
        System.out.println("Soy Gohan y hago HameHameHa");
    }

    @Override
    public void mazenko() {
        System.out.println("Soy Gohan y hago Mazenko");
    }


}