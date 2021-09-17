package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Contato objeto_contato = new Contato("");
        System.out.println("Atributo sem preechimento:");
        System.out.println(objeto_contato.nome);

        System.out.println("Atributo com Preenchimento:");
        objeto_contato.nome = "Rafão";
        System.out.println(objeto_contato.nome);

    }
}
