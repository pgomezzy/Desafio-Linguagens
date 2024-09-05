import java.util.Scanner;
public class TransferirSalario {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        float valorSalario = terminal.nextFloat();
        float valorAdicional = terminal.nextFloat();

        float valorImposto = 0;
        if (valorSalario > 0 && valorSalario <=1100){
            valorImposto = valorSalario * 0.05F;
            System.out.println(valorImposto);
        } else if(valorSalario > 1100 && valorSalario <=2500){
            valorImposto = valorSalario * 0.10F;
        }else{
            valorImposto = valorSalario * 0.15F; 
        }

        float receberSalario = (valorSalario - valorImposto) + valorAdicional;
        System.out.println(String.format("%.2f", receberSalario));

    }
}
