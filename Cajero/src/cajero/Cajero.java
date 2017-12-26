package cajero;
public class Cajero {
   public int Ingresapin;
   public int Cliente;
   public boolean Pin;
   public boolean Retiro;
   public String Deposito;
   public String Cosulta;
   public int Dinero;
   public String Recibo;
   Cliente c;

    public Cajero(int Ingresapin, int Cliente, Cliente c) {
        this.Ingresapin = Ingresapin;
        this.Cliente = Cliente;
        this.c=c;
    }
public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
@Override
    public String toString() {
        return "Cajero{" + "Ingresapin=" + Ingresapin + ", Cliente=" + Cliente + ", c=" + c + '}';
    }
Sistemacentral Verpin=new Sistemacentral();
Sistemacentral VerCliente=new Sistemacentral();
    public int getIngresapin() {
        if (Ingresapin==Verpin.Verificapin){
            
        }
        return 0;
    }
public int getCliente() {
        if (Cliente==VerCliente.Verficacliente){
            
        }
        return 0;
    }


   

    
  
}
