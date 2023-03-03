//Autor: Ian dos Santos Silva
//Data: 03/03/2023
/*Pergunta: Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou 
não a sequência.*/

import java.util.Scanner;

public class App {
 
    public static int entrarUmNumero(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite aqui um número inteiro para ser verificado");
        return input.nextInt();
    }

    public static boolean retornarSeFibonacci(int valorASerVerificado){
        int valorAnterior = 0, valorAtual = 0, proximoValor = 1;

        /*Nesse caso, a questão pede no exemplo que o 0 seja contado, caso a sequência começasse pelo 1, eu poderia usar
        o valorAtual em vez do valorAnterior para a verificação, a fim de otimizar o código (Já que o próximo valor
        sempre vai ser a primeira variável a atingir um novo número de fibonacci*/

        while (valorASerVerificado > valorAtual){
            valorAnterior = valorAtual;
            valorAtual = proximoValor;
            proximoValor = valorAnterior + valorAtual;
        }
        if (valorASerVerificado == valorAtual){return true;}
        else {return false;}
    }

    public static void exibirSePertenceASequencia(boolean pertenceOuNao){
        if (pertenceOuNao == true){
            System.out.println("Este número pertence a sequência de fibonacci");
        }
        else {
            System.out.println("Este número não pertence a sequência de fibonacci");
        }
    }

    public static void main(String[] args) throws Exception {
        int numeroParaVerificacao;
        boolean verificacao;

        //Entrada de dados
        numeroParaVerificacao = entrarUmNumero();
        //Verificar se o número está presente na sequência
        verificacao = retornarSeFibonacci(numeroParaVerificacao);
        //Exibir caso o número pertença a sequência
        exibirSePertenceASequencia(verificacao);
    }
}
