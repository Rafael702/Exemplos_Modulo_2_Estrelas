package br.com.zup.exemploclasses.exemploanimal;

public class Main {
    public static void main(String[] args) {
        Baleia  freewilly = new Baleia(80, 500, "fundo do mar", "Orca");
        Cachorro betoven = new Cachorro("puddle", "pequeno porte",2, 50 );
        Gato frajola = new Gato("persa", "branca", 8, 50);
        Papagaio loro = new Papagaio("verde",10, true, 70 );

        if(loro.palavrao == false){
            System.out.println("Não fala palavrão.");
        }else{
            System.out.println("Fala palavrão.");
        }
    }
}
