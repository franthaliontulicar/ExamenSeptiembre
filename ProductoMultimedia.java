
/**
 * Write a description of class Multimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  abstract class ProductoMultimedia extends Producto
{
    // instance variables - replace the example below with your own
    private String titulo;
    private int añoCreacion;
    /**
     * Constructor for objects of class Multimedia
     */
    public ProductoMultimedia(String titu, int año)
    {
        // initialise instance variables
        titulo = titu;
        añoCreacion = año;
    }

    public String getTitulo(){
        return titulo;
    }
    public int getAno(){
        return añoCreacion;
    }
}

