package Exercise1;

   public abstract class Instrumento {

    public Instrumento(String name_a, int price_a) {

     name=name_a;

     price=price_a;




    }


    public abstract String tocar();









    private String name;

    private int price;










}
