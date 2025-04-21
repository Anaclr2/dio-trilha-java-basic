public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:conhecer e importar a class Scanner

        Scanner scanner = new Scanner(System.in);

        //exibir as mensagens para usuarios

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        String saldoStr = scanner.nextLine().replace(",", ".");
        double saldo = Double.parseDouble(saldoStr);


        //obter pela class scanner os valores digitado no terminal

        String mensagem = "Olá ".concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(", conta ")
        .concat(String.valueOf(numero))
        .concat(" e seu saldo ")
        .concat(String.valueOf(saldo))
        .concat(" já está disponível para saque.");


        //exibir a mensagem da conta

        System.out.println("\nOlá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); 


    }
}
