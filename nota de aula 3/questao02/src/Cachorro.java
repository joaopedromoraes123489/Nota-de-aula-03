public class Cachorro extends Animal {

    public Cachorro(){

    }

    public Cachorro(String nome,String raça){
        super(nome,raça);
    }

    public void late() {
        System.out.println("O cachorro " + nome + " está latindo.");
    }
}