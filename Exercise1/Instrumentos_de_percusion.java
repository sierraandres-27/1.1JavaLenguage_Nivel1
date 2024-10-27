package Exercise1;

public class Instrumentos_de_percusion extends Instrumento {

    public Instrumentos_de_percusion(String name_a, int price_a){

        super(name_a,price_a);

    }



    public String tocar() {


        return "Esta siendo tocada un instrumento de percusión";


    }

    public static String tocar_static (){

        return "Un instrmento de percusión esta siendo tocado";
    }



}


