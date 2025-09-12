public class Pessoa {
    String nome;
    int idade;

    //Construtor
    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    //Metodo
    public void apresentar(){
        System.out.println("Nome: " + nome + " idade: " + idade);
    }
}
