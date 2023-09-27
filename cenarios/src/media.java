import java.util.Scanner;

public class media {
    public float medir() {
        Scanner mediar = new Scanner(System.in);

        float m, n1, n2;
        System.out.print("");
        System.out.print("Digite um número: ");
        n1 = mediar.nextFloat();
        System.out.print("Digite outro número: ");
        n2 = mediar.nextFloat();
        

        m=(n1+n2)/2;
        System.out.print("O resultado da SUBTRAÇÃO é: "+m);
        return m;
    }
}
