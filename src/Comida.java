public abstract class Comida {
    protected String nombre="";
    protected String tamano="";

    public Comida(String nombre, String tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void metodo1()
    {
     System.out.println("hola");
    }

    public void metodo2()
    {
        System.out.println("adios");
    }

    public abstract void sabor();
    public abstract void textura();

}
