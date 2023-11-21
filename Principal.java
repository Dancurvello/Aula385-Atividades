import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Animal
        Animal animal = new Animal();

        // Exibindo os atributos do animal
        System.out.println("Atributos do Animal:");
        animal.mostrarAtributos();
        System.out.println();

        // Instanciando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Chamando o método msgPessoa
        pessoa.msgPessoa();
        System.out.println();

        // Solicitando ao usuário que digite seu nome e idade
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Instanciando um objeto da classe PESSOA com os dados fornecidos pelo usuário
        Pessoa pessoaUsuario = new Pessoa(nome, idade);

        // Exibindo os atributos da pessoaUsuario
        System.out.println("\nAtributos da Pessoa:");
        pessoaUsuario.mostrarAtributos();

        // Fechando o scanner
        scanner.close();
    }
}
