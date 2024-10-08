import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        String x;
        do {
            String a;
            System.out.println("seu animal é um gato(gato) ou um cachorro(cachorro) ");
            a = sc.next();
            switch (a) {
                case "cachorro":
                    System.out.println("insira o nome do cachorro");
                    c.setNome(sc2.nextLine());
                    System.out.println("insira a raça do cachorro");
                    c.setRaça(sc.next());
                    c.caminha();
                    c.late();
                    break;

                case "gato":
                    System.out.println("insira o nome do gato");
                    g.setNome(sc2.nextLine());
                    System.out.println("insira a raça do gato");
                    g.setRaça(sc.next());
                    g.caminha();
                    g.mia();
            }
            System.out.println("deseja repetir o processo ?(sim ou não)");
            x = sc.next();
        }while (x.equalsIgnoreCase("sim"));
    }
}