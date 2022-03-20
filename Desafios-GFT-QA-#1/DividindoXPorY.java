/*
Desafio
Você terá o desafio de escrever um algoritmo que leia 2 números e
imprima o resultado da divisão do primeiro pelo segundo.
Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y)
que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal,
ou “divisao impossivel” caso não seja possível efetuar o cálculo.

 Exemplo de Entrada   Exemplo de Saída
3
3 -2                  -1.5
-8 0                  divisao impossivel
0 8	                  0.0
 */
package dio.gft.desafio1.dividindoXporY;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DividindoXPorY {
    public static void main(String[] args) throws IOException {

        final var localeAmericano = new Locale("en", "US");
        Locale.setDefault(localeAmericano);

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, Y;
        for (int i = 0; i < N; i++) {
            X = leitor.nextInt();
            Y = leitor.nextInt();
            if (Y == 0) System.out.println("divisao impossivel");
            else System.out.println(String.format("%.1f", (float) X / Y));
        }
    }
}
