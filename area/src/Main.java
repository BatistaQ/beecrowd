import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("TRIANGULO = " + String.format("%.3f", areaTria(a,c)));
        System.out.println("CIRCULO = " + String.format("%.3f", areaCir(c)));
        System.out.println("TRAPEZIO = " + String.format("%.3f", areaTrape(a,b,c)));
        System.out.println("QUADRADO = " + String.format("%.3f", areaQua(b)));
        System.out.println("RETANGULO = " + String.format("%.3f", areaRetan(a,b)));

        sc.close();
    }

    public static Double areaTria(double baseA, double hC){
        return (baseA * hC) / 2;
    }

    public static Double areaCir(double raioC){
        double pi = 3.14159;
        return Math.pow(raioC, 2) * pi;
    }

    public static Double areaTrape(double bA, double bB, double hC){
        return ((bA+bB) * hC) / 2;
    }

    public static Double areaQua(double ladoB){
        return ladoB * ladoB;
    }

    public static Double areaRetan(double ladoA, double ladoB){
        return ladoA * ladoB;
    }
}
