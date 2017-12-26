package cajero;
public class Cliente {
 public int Pin;
 public int Ncliente;
    public Cliente(int Pin,int Ncliente) {
        this.Pin = Pin;
        this.Ncliente=Ncliente;
    }
    public int getPin() {
        return Pin;
    }
    public void setPin(int Pin) {
        this.Pin = Pin;
    }   
    public int getNcliente(){
        return Ncliente;
    }
    public void setNcliente(int Ncliente){
        this.Ncliente= Ncliente;
    }
    
  
    }
    

