
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
    private float espacioOcupado;
    public Categoria categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nom, float espacio)
    {
        // initialise instance variables
        nombre = nom;
        espacioOcupado = espacio;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombe()
    {
        // put your code here
        return nombre;
    }
    
    public float getTamañoEnMB(){
        return espacioOcupado;
    }
    public Categoria getCategoria(){
        return categoria;
    }
}
