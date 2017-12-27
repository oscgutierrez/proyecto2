
package Producto;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class listaProducto {
   public ArrayList<Producto> Productos;
   public Producto entrega;
   public Producto pro1;
   public int posicion;
   
   public void AgregarProd(Producto p){
       
       Productos.add(p);
       JOptionPane.showMessageDialog(null,"producto agregado");
   } 
   public listaProducto() {
      Productos =new ArrayList();      
    }
   
   public int largo (){
     return Productos.size();
 }  
   public int buscarProducto (String codigo){
    
       for (int i = 0; i < largo(); i++) {

       if (Productos.get(i).getCodigo().equals(codigo))
            { 
            posicion=i;
            return posicion;
            } else{
           JOptionPane.showMessageDialog(null,"producto no existe");
                    
            }
       }
     return 0;
   }
    public Producto regresaProducto (String codigo){
      String existe ="N";
       int posicion = 0;
       int i=0;
        
        if (Productos.get(i).getCodigo().equals(codigo));     
            { posicion=i;
            existe="S";
            
            }
        return Productos.get(posicion);
    }
    public Producto RegresaObje(int pos){
        
        return Productos.get(pos);
    }
}

