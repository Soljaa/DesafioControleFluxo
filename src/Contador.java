import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            try {
                contar(parametroUm, parametroDois);

            }catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        } catch (InputMismatchException exception){
            System.out.println("Os valores devem ser inteiros");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 0; i < contagem; i++){
                int counter = i+1;
                System.out.println("Imprimindo o número " + counter);
            }
        }
    }
    static class ParametrosInvalidosException extends Exception {}
}
