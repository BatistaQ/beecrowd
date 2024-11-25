import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            int cod = sc.nextInt();
            int qtd = sc.nextInt();
            double price = sc.nextDouble();
            list.add(new Product(cod,qtd,price));
        }

        double sum = 0.0;
        for (Product product : list){
            sum += product.getPrice() * product.getQtd();
        }

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f",sum));

        sc.close();
    }
}

class Product {
    private Integer cod;
    private Integer qtd;
    private Double price;

    public Product(Integer cod, Integer qtd, Double price) {
        this.cod = cod;
        this.qtd = qtd;
        this.price = price;
    }

    public Integer getQtd() {
        return qtd;
    }
    public Double getPrice() {
        return price;
    }
}