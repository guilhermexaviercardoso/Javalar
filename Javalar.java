package javalar.java;


import java.util.ArrayList;
import java.util.Scanner;

public class Javalar {
    public void executar() {
        ArrayList<Planeta> planetas = new ArrayList<>();

        planetas.add(new Python());
        planetas.add(new JavaScript());
        planetas.add(new Ruby());
        planetas.add(new PHP());
        planetas.add(new CSharp());

        Scanner scanner = new Scanner(System.in);

        {
        	System.out.println("bem vindo ao sistema javalar");
        	System.out.println(" ");
        	System.out.println("o sistema ira calcular a posiçao dos planetas no plano e dizer quanto tempo se passou conforme as regras de cada planeta");
        	System.out.println("");
        	System.out.println("curta a experiencia");
        	System.out.println("");
        }

        while (true) {
            System.out.print("Digite a quantia de tempo (em horas, valor negativo para sair): ");
            int tempo = scanner.nextInt();

            if (tempo < 0) {
                System.out.println("Saindo do programa.");
                break;
            }

            for (Planeta planeta : planetas) {
                planeta.mover(tempo);
                System.out.println(planeta.toString() + " - Horas Passadas: " + tempo);
                planeta.rotacao(tempo); // Calcula e exibe dias e horas de rotação
            }
        }

        scanner.close();
    }
}
