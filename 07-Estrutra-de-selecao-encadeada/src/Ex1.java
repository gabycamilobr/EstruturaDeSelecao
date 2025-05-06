import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df =new DecimalFormat("0.00");

        double conta, taxa;
        int diaria;

        System.out.println("Digite o número de diárias");
        diaria = sc.nextInt();

        if(diaria > 15){
            taxa = 15.5;
        }
        else {
            if (diaria == 15) {
                taxa = 36;
            }
            else{
                taxa = 58.00;
            }
        }

        conta = (250 + taxa) * diaria;
        System.out.println("O valor da sua conta é: "+ df.format(conta));

    }
}
