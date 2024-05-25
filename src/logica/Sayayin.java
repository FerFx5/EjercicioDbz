
package logica;

public abstract class Sayayin {
   protected int numSayayin;
   protected String nombre;
   protected double peso;
   protected String sexo;
   protected int temporada;

    public Sayayin(int numSayayin, String nombre, double peso, String sexo, int temporada) {
        this.numSayayin = numSayayin;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }

    public int getNumSayayin() {
        return numSayayin;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setNumSayayin(int numSayayin) {
        this.numSayayin = numSayayin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
       
   protected abstract void elevarKi();
   protected abstract void bolaDeEnergia();
   protected abstract void volar();
}
