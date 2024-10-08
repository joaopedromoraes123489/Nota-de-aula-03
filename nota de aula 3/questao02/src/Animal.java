public class Animal {
    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String nome, raça;

    public Animal(){

    }

    public Animal(String nome, String raça){
        this.nome = nome;
        this.raça = raça;


    }
    public  void caminha(){
        System.out.println("o animal " + nome + " está caminhando");
    }
}
