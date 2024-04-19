public class SalarioReajuste {
    public static void main(String[] args) {
        double salarioColaborador, reajuste, novoSalario, aumentoReal;

        Scanner scanner = new Scanner(System.in);

        // Obter salário do colaborador
        System.out.println("Informe o Salário do Colaborador:");
        salarioColaborador = Double.parseDouble(scanner.nextLine());

        // Calculo reajuste
        if (salarioColaborador <= 280) {
            reajuste = salarioColaborador * 0.2;
        } else if (salarioColaborador <= 700) {
            reajuste = salarioColaborador * 0.15;
        } else if (salarioColaborador <= 1500) {
            reajuste = salarioColaborador * 0.1;
        } else {
            reajuste = salarioColaborador * 0.05;
        }

        // Calculo novo salário
        novoSalario = salarioColaborador + reajuste;

        // Aumento Real
        aumentoReal = novoSalario * (1 - 0.038);

        // Apresentar Dados na tela
        System.out.println();
        System.out.println("Salário antes do reajuste R$" + salarioColaborador);
        System.out.println("Percentual de aumento aplicacado R$" + reajuste);
        System.out.println("Novo salário, após o aumento R$" + novoSalario);
        System.out.println("Valor do aumento real, descontando a inflação R$" + String.format("%.2f", aumentoReal));
        System.out.println();
    }
}
