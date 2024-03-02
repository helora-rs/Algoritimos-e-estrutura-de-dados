//pergunte um numero a um usuario, e em seguida mostre a raiz quaderada e a raiz cubica desse numero
//criação da classe raizes_de_um_numero
import java.util.Scanner;

public class Raizes_de_um_numero {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        //declaração de variaveis
        float numero;
        float raiz_quadrada;
        float raiz_cubica;

        //criação do Scanner para possibilitar a entrada de dados
        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.println("digite um número real: ");//passa a instrução para o usuario oq ele deve digitar
        numero = entrada.nextInt();//atribui o numero digitado pelo usuario para a variavel numero

        //A função Math realiza os calculos necessario e já passa o valor da conta para a as variaveis indicadas
        raiz_quadrada = (float) Math.sqrt(numero);
        raiz_cubica = (float) Math.cbrt(numero);

        //printa na tela o resultado final
        System.out.println("A raiz cubica é: " + raiz_cubica + " e a raiz quadrada é: " + raiz_quadrada);
    }
    
}//fim da classe raizes_de_um_numero
