
package logica;

public class Vegeta extends Sayayin implements IVegetaSSj{

    public Vegeta(int numSayayin, String nombre, double peso, String sexo, int temporada) {
        super(numSayayin, nombre, peso, sexo, temporada);
    }

    
    @Override
    protected void elevarKi() {
        System.out.println("Soy Vegeta Elevando el Ki");
    }

    @Override
    protected void bolaDeEnergia() {
        System.out.println("Soy Vegeta y estoy disparando bola de energía");
    }

    @Override
    protected void volar() {
        System.out.println("Soy Vegeta y estoy volando");
    }

    @Override
    public void finalBlast() {
        System.out.println("Soy Vegeta y hago el Final Blast");
    }

    @Override
    public void autoDestruction() {
        System.out.println("Soy Vegeta y hago la autodestrucción");
    }
    
}
