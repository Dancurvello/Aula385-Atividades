public class Animal {

    String especie = "Cachorro";
    int idade = 3;
    String cor = "Marrom";


    public Animal() {
    }


    public void mostrarAtributos() {
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cor: " + cor);
    }
}
