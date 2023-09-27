import java.util.Scanner;


public class lista {
    public int listar() {
        Scanner lere = new Scanner(System.in);

        int i, n1;
        System.out.print("");
        System.out.print("Digite o número máximo: ");
        n1 = lere.nextInt();

        for(i=0; i<=n1; i++){
            System.out.print("Número: "+i);
        }

        return i;
    }
}
