import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça o raio de um círculo
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do circulo ");
        double raio = sc.nextDouble();
        sc.close();
        //calcule e mostre sua área.


        //Math: biblioteca matematica. PI está nessa biblioteca. 
        //Math.pow utilizado para elevar a variavel ao valor desejado 
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo é: "+area);
    }
}
