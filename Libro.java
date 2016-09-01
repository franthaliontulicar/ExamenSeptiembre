
/**
 * Write a description of class Libros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int numPaginas;
    private boolean ficcion;
    /**
     * Constructor for objects of class Libros
     */
    public Libro(String titulo, int ac, int numP, boolean fic)
    {
        // initialise instance variables
        super(titulo,ac);
        numPaginas = numP;
        ficcion = fic;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumeroPaginas()
    {
        // put your code here
        return numPaginas;
    }
    
    public boolean getFiccion(){
               
        return ficcion;
    }
}
