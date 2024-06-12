public class ContaPopanca extends Conta {

    public ContaPopanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta poupança");
        super.imprimirInfromação();
    
       
    }
  
 

}
