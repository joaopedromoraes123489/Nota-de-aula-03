public class Gato extends Animal {

    public Gato (){

    }

    public Gato (String nome,String raça){
        super(nome,raça);
    }

    public void mia() {
        System.out.println("O gato " + nome + " está miando.");
    }
}