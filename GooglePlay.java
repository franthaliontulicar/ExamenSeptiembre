import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    // instance variables - replace the example below with your own
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;
  
    /**
     * Constructor for objects of class GooglePlay
     */
   
    public GooglePlay()
    {
        // initialise instance variables
       usuarios = new ArrayList<>();
       productos = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumeroUsuarios()
    {
        // put your code here
        return usuarios.size();
    }
    
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public int getNumeroProductos(){
        return productos.size();
    }
    
    public void addProducto(Producto apli){
        productos.add(apli);
    }
    
    public void comprar(Usuario usuario, Aplicacion producto){
        
        String correo = usuario.getNombreCuenta();
        String compra = producto.getNombre();
        System.out.println("Usuario: " + correo + "/ln Compra: " + compra);
        
    }
}
