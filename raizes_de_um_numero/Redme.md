# Raízes de um número

Pergunte três valores ao usuário, que correspondem às horas, minutos e segundos do horário atual. Calcule quantos segundos se passaram desde 00:00 horas.

´´´
/*criação da classe tempo_em_segundos no dia 01/03/2024*/
import java.util.Scanner;
class tempo_em_segundos{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*declaração de variaveis*/
        int horas;
        int minutos;
        int segundos;
        int horas_em_segundos;
        int minutos_em_segundos;
        int tempo_em_segundos;

        //criação do Scanner para possibilitar a entrada de dados
        Scanner entrada;
        entrada = new Scanner(System.in);

        //informa ao usuario oq ele deve digitar
        System.out.println("digite as horas correspondentes a esse momento:");
        horas = entrada.nextInt();//atribui as horas atual passada pelo usuario para a variavel 'hora'

        //informa ao usuario oq ele deve digitar
        System.out.println("digite os minutos correspondentes a esse momento:");
        minutos = entrada.nextInt();//atribui os minutos atual passado pelo usuario para a variavel 'minutos'

        //informa ao usuario oq ele deve digitar
        System.out.println("digite os segundos correspondentes a esse momento:");
        segundos = entrada.nextInt();//atribui os sugundos atual passada pelo usuario para a variavel 'segundos'

        horas_em_segundos = horas * 3600;//transforma a quantidade de horas digitada pelo usuario em segundos
        minutos_em_segundos = minutos * 60;//transforma a quantidade de minutos digitado pelo usuario em segundos
        tempo_em_segundos = horas_em_segundos + minutos_em_segundos + segundos;//soma todos os segundos para dar o resultado total

        //printa na tela o resultado final
        System.out.println("Desde as 00:00h, se passaram: " + tempo_em_segundos + " segundos.");
    }
}//fim da classe tempo_em_segundos
´´´

