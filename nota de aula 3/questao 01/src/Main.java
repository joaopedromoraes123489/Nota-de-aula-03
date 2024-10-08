import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Gerente g = new Gerente();
        Programador p = new Programador();
        String a,x;
        do {

            System.out.println("olá você é gerente(gerente) ou programador(programador):");
            a = sc.next();
            switch (a) {
                case "gerente":
                    System.out.println("insira o seu nome : ");
                    g.setNome(sc2.nextLine());
                    System.out.println("insira a sua data de nascimento(formato AAAA-MM-DD)");
                    g.setNasc(LocalDate.parse(sc.next()));
                    g.calcularIdade();
                    System.out.println("insira o seu salario");
                    g.setSalario(sc.nextDouble());
                    g.informarsalario();
                    System.out.println("insira o nome do projeto");
                    g.setNomeP(sc2.nextLine());
                    g.informarP();
                    break;

                case "programador":
                    System.out.println("insira o seu nome : ");
                    p.setNome(sc2.nextLine());
                    System.out.println("insira a sua data de nascimento(formato AAAA-MM-DD)");
                    p.setNasc(LocalDate.parse(sc.next()));
                    p.calcularIdade();
                    System.out.println("insira o seu salario");
                    p.setSalario(sc.nextDouble());
                    p.informarsalario();
                    System.out.println("insira a linguagem de programação que você domina");
                    p.setLinguaguemP(sc.next());
                    p.infolinguagem();
                    break;
            }
            System.out.println("deseja repetir ? (sim ou não)");
            x = sc.next();
        }while (x.equalsIgnoreCase("sim"));

    }
}