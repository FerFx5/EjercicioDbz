
package logica;


public class Goku extends Sayayin implements IGokuSSj{

    public Goku(int numSayayin, String nombre, double peso, String sexo, int temporada) {
        super(numSayayin, nombre, peso, sexo, temporada);
    }

    @Override
    protected void elevarKi() {
        System.out.println("Soy Goku Elevando el Ki");    }

    @Override
    protected void bolaDeEnergia() {
        System.out.println("Soy Goku y estoy disparando bola de energía");
    }

    @Override
    protected void volar() {
        System.out.println("Soy Goku y estoy volando");
    }

    @Override
    public void hameHameAumentado() {
        System.out.println("Soy Goku y hago HameHameHa aumentado");
    }

    @Override
    public void henkidama() {
        System.out.println("Soy Goku y hago la Henkidama");
    }
    
}
