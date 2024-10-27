package Exercise1;

public class Instrumentos_de_viento extends Instrumento {

    public Instrumentos_de_viento(String nom_a, int price_a){

        super(nom_a,price_a);
    }

    public String tocar() {


        return "Esta siendo tocado un instrumento de viento";


    }

    public static String tocar_static (){

        return "Un instrmento de viento esta siendo tocado";
    }
}
