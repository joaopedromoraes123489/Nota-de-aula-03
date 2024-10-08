import java.time.LocalDate;
public class Funcionario {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    protected LocalDate nasc;
    protected double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, LocalDate nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;

    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return hoje.getYear() - nasc.getYear();
    }

    public void informarsalario() {
        System.out.println("o seu salario é de " + getSalario());
    }
}
