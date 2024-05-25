
package logica;

public class EjercicioDbz {


    public static void main(String[] args) {
        Goku goku=new Goku(1,"Goku",70.2,"Masculino",1); 
        System.out.println("Hola soy "+goku.getNombre()+" y aparezco en la temporada "+goku.getTemporada());
        
        Vegeta vegeta=new Vegeta(2,"Vegeta",62.1,"Masculino",3);
        System.out.println(vegeta.getNombre()+". " + "Soy el Principe ");
        vegeta.finalBlast();
    }
    
}
