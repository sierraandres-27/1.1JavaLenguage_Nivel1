package Exercise1;

public class Instrumentos_de_cuerda extends Instrumento {


    public Instrumentos_de_cuerda(String name_a, int price_a){


        super(name_a,price_a);

    }


    public String tocar() {

        return "Esta siendo tocado un instrumento de cuerda";


    }

    public static String tocar_static (){

        return "Un instrument de viento esta siendo tocado";
    }


}
