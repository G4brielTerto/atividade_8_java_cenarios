import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        calculos calc = new calculos();
        subtracao sub = new subtracao();
        divisao div = new divisao();
        media med = new media();
        lista list = new lista();
        listanegativo listn = new listanegativo();
        mediavalid valmed = new mediavalid();

        // CENÁRIO 1
        calc.adicao();
        // CENÁRIO 2
        sub.subtrair();
        // CENÁRIO 4
        div.dividir();
        // CENÁRIO 5
        med.medir();
        // CENÁRIO 6
        list.listar();
        // CENÁRIO 7
        listn.listarn();
        // CENÁRIO 8
        valmed.valimedir();


        
    }
}
