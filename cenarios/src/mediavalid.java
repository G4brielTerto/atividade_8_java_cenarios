import java.util.Scanner;

public class mediavalid {
    public float valimedir() {
        Scanner mediar = new Scanner(System.in);

        float m, n1, n2;
        System.out.print("");
        System.out.print("Digite o valor de n1: ");
        n1 = mediar.nextFloat();
        System.out.print("Digite o valor de n2: ");
        n2 = mediar.nextFloat();
        while((n1<0 || n1>10) || (n1<0 || n1>10)){
            System.out.print("Digite o valor de n1: ");
            n1 = mediar.nextFloat();
            System.out.print("Digite o valor de n2: ");
            n2 = mediar.nextFloat();
        }

        m=(n1+n2)/2;
        if(m>=7){
            System.out.print("APROVADO: "+m);
        }else{
            System.out.print("REPROVADO: "+m);
        }
        
        return m;
    }
}
