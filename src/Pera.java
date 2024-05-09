public class Pera extends  Comida{
    public Pera(String nombre, String tamano) {
        super(nombre, tamano);
    }



    @Override
    public void sabor() {
System.out.println("Sabe a cosas "+getNombre());
    }

    @Override
    public void textura() {
        System.out.println("Basura");

    }


    @Override
    public void metodo1() {
        super.metodo1();

    }
}
