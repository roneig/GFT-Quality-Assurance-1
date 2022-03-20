/*
Leia 2 valores inteiros (A e B).
Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

Exemplo de Entrada	 Exemplo de Saída
6 24	             Sao Multiplos
6 25	             Nao sao Multiplos

 */
package dio.gft.desafio1.multiplos;

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();
        if ((valor1 % valor2) == 0
                || (valor2 % valor1) == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
