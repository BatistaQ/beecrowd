import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int formula = formula(a,b);

        if (c > formula){
            System.out.println(c + " eh o maior");
        } else {
            System.out.println(formula + " eh o maior");
        }
        sc.close();
    }

    public static Integer formula(int a, int b){
        int valorABS = a - b;
        return ((a + b) + Math.abs(valorABS)) / 2;
    }
}