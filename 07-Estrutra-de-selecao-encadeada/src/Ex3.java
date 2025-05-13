import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double total, totalComDesconto, valorEconomizado;

        System.out.print("Valor total das compras --> R$ ");
        total = sc.nextDouble();
        if(total > 1000) {
            totalComDesconto = total * 0.85;
        }
        else {
            totalComDesconto = total * 0.92;
        }
        valorEconomizado = total - totalComDesconto;
        System.out.println("Total com desconto R$ " + df.format(totalComDesconto));
        System.out.println("Valor economizado R$ " + df.format(valorEconomizado));
    }
}
