import java.util.Scanner;

public class divisao {
    public float dividir() {
        Scanner lere = new Scanner(System.in);

        float res, v1, v2;
        System.out.print("");
        System.out.print("Digite um número: ");
        v1 = lere.nextFloat();
        System.out.print("Digite outro número: ");
        v2 = lere.nextFloat();
        

        res=v1/v2;
        System.out.print("O resultado da SUBTRAÇÃO é: "+res);
        return res;
    }
}
