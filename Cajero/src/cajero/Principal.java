package cajero;
public class Principal {

    private static Cliente cl;
public static void main(String[] args) {
Cliente c1=new Cliente(1233,3456);
Cajero cajero=new Cajero(12,13,c1);
    System.out.println(cajero.toString());
 }
    
}
