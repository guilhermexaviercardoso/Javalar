package javalar.java;

public class Planeta {
   
private String nome;
private double posicaoX;
private double posicaoY;
private double velocidadeTranslacao;
private int horasPorDia;

public Planeta(String nome, double posicaoXInicial, double posicaoYInicial, double velocidadeTranslacao, int horasPorDia) {
    this.nome = nome;
    this.posicaoX = posicaoXInicial;
    this.posicaoY = posicaoYInicial;
    this.velocidadeTranslacao = velocidadeTranslacao;
    this.horasPorDia = horasPorDia;
}

public void mover(int tempo) {
    int dias = tempo / this.horasPorDia;
    int horasRestantes = tempo % this.horasPorDia;

    for (int i = 0; i < dias; i++) {
        // Movimento ao longo do eixo Y
        posicaoY++;

        // Movimento ao longo do eixo X
        if (i % 2 == 0) {
            posicaoX++;
        } else {
            posicaoX--;
        }
    }

    // Movimento adicional com base nas horas restantes
    posicaoX += horasRestantes * this.velocidadeTranslacao;
}


public double getPosicaoX() {
    return posicaoX;
}

public double getPosicaoY() {
    return posicaoY;
}

public int getHorasPorDia() {
    return horasPorDia;
}

@Override
public String toString() {
    return "Planeta " + nome + ": Posição (" + posicaoX + ", " + posicaoY + ")";
}

    public void rotacao(int tempo) {
        int diasPlaneta = tempo / this.horasPorDia;
        int horasPlaneta = tempo % this.horasPorDia;

        System.out.println("Planeta " + nome + " - Dias: " + diasPlaneta + ", Horas: " + horasPlaneta);
    }


}

