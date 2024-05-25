
package logica;

public class EjercicioDbz {


    public static void main(String[] args) {
        Goku goku=new Goku(1,"Goku",70.2,"Masculino",1); 
        System.out.println("Hola soy "+goku.getNombre()+" y aparezco en la temporada "+goku.getTemporada());
        
        Vegeta vegeta=new Vegeta(2,"Vegeta",62.1,"Masculino",3);
        System.out.println(vegeta.getNombre()+". " + "Soy el Principe ");
        vegeta.finalBlast();
        
        Gohan gohan=new Gohan(3,"Gohan",68.5,"Masculino",1);
        gohan.setNombre("Gohan Definitivo");
        System.out.println("Hola soy el hijo de Goku "+gohan.getNombre());
        gohan.mazenko();
    }
    
}
