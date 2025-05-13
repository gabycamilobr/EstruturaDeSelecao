import java.util.Scanner;

public class Ex5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double lado1, lado2, lado3;

            System.out.print("Lado 1 --> ");
            lado1 = sc.nextInt();
            System.out.print("Lado 2 --> ");
            lado2 = sc.nextInt();
            System.out.print("Lado 3 --> ");
            lado3 = sc.nextInt();

            // condição para ser um triângulo
            if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
                System.out.println("Os valores formam um triângulo");
            }
            else {
                System.out.println("Os valores não formam um triângulo");
            }

            // condição para não ser triângulo
            if(lado1 > lado2 + lado3 || lado2 > lado3 + lado1 || lado3 > lado2 + lado1) {
                System.out.println("Os valores não formam um triângulo");
            }
            else {
                System.out.println("Os valores formam um triângulo");
            }
        }
}
