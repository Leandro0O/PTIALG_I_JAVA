import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Double valor, alc, gas;
        String cont = "s";
        do {
            System.out.println("Informe o preço da gasolina: R$");
            gas = scanner.nextDouble();
            System.out.println("Informe o preço do alcool: R$");
            alc = scanner.nextDouble();
            valor = alc / gas;
            String res = valor > 0.7 ? "A gasolina vale mais a pena"
                    : valor == 0.7 ? "Tanto faz abastecer com qualquer um" : "O alcool vale mais a pena";
            System.out.println(res);
            System.out.println("Deseja continuar?\nS --> SIM\nN --> NÂO\n");
            cont = scanner.next();
            scanner.nextLine();

        } while (cont.equalsIgnoreCase("s"));
        System.out.println("Programa finalizado!");
        scanner.close();

    }
}
