public abstract class Conta implements InterfaceConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia= AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente=cliente;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if(valor<=saldo){
            saldo-=valor;
        }else{
            System.out.println("Saldo insuficiente");
        }

    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;

    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        if(saldo<=valor){
            this.sacar(valor);
            contaDestino.depositar(valor);

        }
        else{
            System.out.println("Saldo insuficiente");
        }
      

    }
    protected void imprimirInfromação(){
        
        System.out.println(String.format("Cliente: %s",cliente.getNome()));
        System.out.println(String.format("Agencia %d", agencia));
        System.out.println(String.format("Conta %d", numero));
        System.out.println(String.format("Saldo %.2f",saldo));
     

    }

}
