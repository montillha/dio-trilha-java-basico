public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Mari");
        Conta conta = new ContaCorrente(cliente);
      
        Conta conta2 = new ContaPopanca(cliente);
        conta.depositar(100);
        conta.tranferir(100, conta2);
        conta.imprimirExtrato();
        conta2.imprimirExtrato();




        
    }
    
}
