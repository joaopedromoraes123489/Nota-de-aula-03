import java.time.LocalDate;

public class Programador extends Funcionario {
    private String linguaguemP;

    public String getLinguaguemP() {
        return linguaguemP;
    }

    public void setLinguaguemP(String linguaguemP) {
        this.linguaguemP = linguaguemP;
    }

    public Programador(){

    }

    public Programador(String nome, LocalDate nasc, double salario, String linguaguemP){
        super(nome, nasc, salario);
        this.linguaguemP = linguaguemP;
    }

    public void infolinguagem() {
        if (linguaguemP.equalsIgnoreCase("java") || linguaguemP.equalsIgnoreCase("python") || linguaguemP.equalsIgnoreCase("C")) {
            System.out.println("a linguagem apresentada atente os nosso requistos bem vindo");
        }else {
        System.out.println("linguagem não utilizada ERRO");
    }
    }
}
