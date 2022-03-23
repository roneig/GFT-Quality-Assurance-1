/*
Desafio
Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string.

Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string,
em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

Entrada
A entrada contém vários casos de teste.
A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir.
Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres,
cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e
exiba a cadeia resultante.

Exemplo de Entrada	  Exemplo de Saída
2
aA Bb                 aBAb
aa bb                 abab

 */
package dio.gft.desafio3.combinacaoDeStrings;

import java.util.Scanner;

public class CombinacaoDeStrings {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {

            String[] cadeia1 = (leitor.next()).split("(?!^)");
            String[] cadeia2 = (leitor.next()).split("(?!^)");

            int tamanhoMaiorCadeia;
            String resultado = "";

            if (cadeia1.length >= cadeia2.length) {
                tamanhoMaiorCadeia = cadeia1.length;
            } else {
                tamanhoMaiorCadeia = cadeia2.length;
            }

            for (int j = 0; j < tamanhoMaiorCadeia; j++) {
                if (j < cadeia1.length) {
                    resultado += cadeia1[j];
                }
                if (j < cadeia2.length) {
                    resultado += cadeia2[j];
                }
            }

            System.out.println(resultado);
        }
    }
}
