import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double fixo = sc.nextDouble();
        double vendas = sc.nextDouble();

        double salary = finalSalary(fixo,vendas);

        System.out.println("TOTAL = R$ " + String.format("%.2f",salary));

        sc.close();
    }

    public static Double finalSalary(double fixo, double vendas){
        double comissao = vendas * 0.15;
        return fixo + comissao;
    }
}