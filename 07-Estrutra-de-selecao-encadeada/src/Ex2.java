import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double prova1, prova2;
        double trabalho1, trabalho2, trabalho3;
        double mediaFinal, mediaProva, mediaTrabalho;

        System.out.print("Nota da 1a prova --> ");
        prova1 = sc.nextDouble();
        System.out.print("Nota da 2a prova --> ");
        prova2 = sc.nextDouble();
        System.out.print("Nota do 1o trabalho --> ");
        trabalho1 = sc.nextDouble();
        System.out.print("Nota do 2o trabalho --> ");
        trabalho2 = sc.nextDouble();
        System.out.print("Nota do 3o trabalho --> ");
        trabalho3 = sc.nextDouble();

        mediaProva = (prova1 + prova2) / 2;
        mediaTrabalho = (trabalho1 + trabalho2 + trabalho3) / 3;
        mediaFinal = mediaProva * 0.7 + mediaTrabalho * 0.3;

        System.out.println("média final = " + df.format(mediaFinal));
        if(mediaFinal >= 5.999999999998) {
            System.out.println("APROVADO :)");
        }
        else {
            System.out.println("REPROVADO :(");
        }

    }
}
