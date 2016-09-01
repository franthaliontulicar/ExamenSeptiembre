
/**
 * Write a description of class Peliculas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peliculas extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int duracion;
    private boolean calidadRepro;

    /**
     * Constructor for objects of class Peliculas
     */
    public Peliculas(String titulo, int ac, int dura, boolean repro)
    {
        // initialise instance variables
        super(titulo,ac);
        duracion = dura;
        calidadRepro = repro;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getDuracion()
    {
        // put your code here
        String tiempo = " ";
        if(duracion >= 0 && duracion <= 60){
            tiempo = duracion + "minutos";
        
        }
        else if(duracion > 60){
         tiempo = duracion + (duracion - 60) + "minutos";
        }
        else{
            System.out.println("el tiempo negativo no cuenta");
        }
        return duracion;
    }
    
    public boolean getCalidad(){
        boolean hD = false;
        if(calidadRepro == true){
            hD = true;
        }
        else{
            hD = false;
        }
        return hD;
    }
}
