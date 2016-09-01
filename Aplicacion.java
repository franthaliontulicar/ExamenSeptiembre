
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    // instance variables - replace the example below with your own
    private String nombre;
    private double espacioOcupado;
    private Categoria categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nom, double espacio, Categoria cate)
    {
        // initialise instance variables
        nombre = nom;
        espacioOcupado = espacio;
        categoria = cate;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre()
    {
        // put your code here
        return nombre;
    }
    
    public double getTamanoEnMB(){
           return espacioOcupado;
    }
    public Categoria getCategoria(){
        return categoria;
    }
}
