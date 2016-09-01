
/**
 * Write a description of class Peliculas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int duracion;
    private int calidadRepro;

    /**
     * Constructor for objects of class Peliculas
     */
    public Pelicula(String titulo, int ac, int dura, int repro)
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
    
    public String getCalidad(){
        String calidad = "HD";
        if(calidadRepro == 1080){
           calidad = "full HD";
        }
        else{
            calidad = "HD";
        }
        return calidad;
    }
}
