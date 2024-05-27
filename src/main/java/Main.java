

public class Main {
  public static void main(String[] args) {
    System.out.println("Programa para calcular potência e consumo elétrico");
    System.out.println("");
    System.out.println("Uma Tv tem potência de 200watt:");
    double potência = 200;
    System.out.println(potência);
    System.out.println("");
    System.out.println("Essa Tv fica ligada aproximadamente 5 horas...");
  double tempo = 5;

    System.out.println(tempo);
    System.out.println("");
    System.out.println("Diárias (1 mes = 30 dias)");
    double mes = 30;
    System.out.println(mes);
    System.out.println("");
    System.out.println("Usando a formula Consumo elétrico = Potência * tempo / 1000");
  
    double consumoelétrico = potência * tempo * mes;
    System.out.println(consumoelétrico);
    double divisao = 1000;
    double consumoeletrico2 = consumoelétrico / divisao;
    System.out.println(consumoeletrico2);
  }


}