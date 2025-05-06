import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1,valor2,valor3;

        System.out.println("Valor 1 --> ");
        valor1 = sc.nextInt();

        System.out.println("Valor 2 --> ");
        valor2 = sc.nextInt();

        System.out.println("Valor 3 --> ");
        valor3 = sc.nextInt();


        if (valor1 != valor2 && valor2 != valor3 && valor3 != valor1){
            if(valor1 < valor2 && valor1 < valor3){
                System.out.println("O menor valor é " + valor1);
            }
            else if(valor2 < valor1 && valor2 < valor3){
                System.out.println("O menor valor é " + valor2);
            }
            else{
                System.out.println("O menor valor é " + valor3);
            }
        }
        else{
            System.out.println("Os valores tem q ser diferentes");
        }
    }
}
