import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String correo;
    
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String email)
    {
        // initialise instance variables
       correo = email;
     
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombreCuenta(){
        return correo;
    }
    
}
