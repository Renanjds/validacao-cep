import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Dados dadosEntrada = new Dados();

        System.out.println("Qual seu nome ?");
        dadosEntrada.setNome(scanner.nextLine());

        System.out.println("Qual sua idade ?");
        dadosEntrada.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Qual CEP da sua residência ?");
        dadosEntrada.setCep(scanner.nextLine());
        scanner.close();

        dadosEntrada.validarCep();

    }
}