import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, aux;

        System.out.println("Informe o primeiro valor:");
        a = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        b = sc.nextInt();
        System.out.println("Informe o terceiro valor:");
        c = sc.nextInt();

        if(a > b){
            aux = a;
            a = b;
            b = aux;

        }
        if(a > c){
            aux = a;
            a = c;
            c = aux;
        }
        if(b > c){
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println(a + " " + b + " " + c);


    }
}
