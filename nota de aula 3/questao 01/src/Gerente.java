import java.time.LocalDate;

public class Gerente extends Funcionario{
    private  String nomeP;

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public Gerente(){

    }

    public Gerente(String nome, LocalDate nasc, double salario, String nomeP){
        super( nome, nasc, salario);
        this.nomeP = nomeP;


    }

    public void informarP() {
        if (nomeP.equalsIgnoreCase("projeto java")||nomeP.equalsIgnoreCase("projeto pyhton")||nomeP.equalsIgnoreCase("projeto c")){
            System.out.println(" o projeto consta no banco de dados bem vindo aos dados do projeto  " + nomeP);
        }else{
            System.out.println("o projeto não consta no nosso banco de dados");
        }
    }

    }



