import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double volume = Math.pow(raio,3) * 4/3 * pi;
        System.out.println("VOLUME = " + String.format("%.3f", volume));

        sc.close();
    }
}