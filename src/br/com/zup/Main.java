<<<<<<< HEAD
package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Contato objeto_contato = new Contato("Rafa", "9999999", "rafa@rafa", "32427484309", 20);

        System.out.println("A hash do nosso objeto é: " + objeto_contato);
        System.out.println(objeto_contato.nome);
        System.out.println(objeto_contato.telefone);
        System.out.println(objeto_contato.email);
        System.out.println(objeto_contato.cpf);
        System.out.println(objeto_contato.idade);

=======

//Formatações
package br.com.zup;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
// 2. instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);

        int i, n;

        System.out.printf("Informe o número para a tabuada:\n");
        n = ler.nextInt(); // 3.1 entrada de dados (lendo um valor inteiro)

        System.out.printf("\n" + "--Resultado--+\n");
        for (i = 1; i <= 10; i++) {
            System.out.printf("| %2d * %d = %2d |\n", i, n, (i * n));
        }
        System.out.printf("+-------------+\n");
>>>>>>> 6adb1f5a9cb18f908eb90059cef264c634ed6d0e

    }
}
