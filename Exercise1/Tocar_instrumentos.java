package Exercise1;

public class Tocar_instrumentos {

    public static void main(String[] args) {

        Instrumento[] array_instruments=new Instrumento[3];

        array_instruments [0] = new Instrumentos_de_viento("Flauta_dulce",25);
        array_instruments[1] =new Instrumentos_de_cuerda("Guitarra española",40);
        array_instruments [2]=new Instrumentos_de_percusion("Batería eléctrica",100);

       for(int i=0;i<array_instruments.length;i++){

           System.out.println(array_instruments[i].tocar());
       }




       //aplicación método static

        System.out.println(Instrumentos_de_viento.tocar_static());
        System.out.println(Instrumentos_de_cuerda.tocar_static());
        System.out.println(Instrumentos_de_percusion.tocar_static());







    }
}
