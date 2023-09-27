import java.util.Scanner;

public class calculos {
    public int adicao() {
        Scanner ler = new Scanner(System.in);

        int a, b, c, d;
        System.out.print("Digite um número: ");
        a = ler.nextInt();
        System.out.print("Digite outro número: ");
        b = ler.nextInt();
        System.out.print("Digite mais um último número: ");
        c = ler.nextInt();

        d=a+b+c;
        System.out.print("O resultado da ADIÇÃO é: "+d);
        return d;
    }   
}
