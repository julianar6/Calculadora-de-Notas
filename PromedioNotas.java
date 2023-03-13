import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numNotas;
        double sumaNotas=0;

        System.out.print("Ingrese el número de notas: ");
        numNotas = sc.nextInt();

        for (int i = 1; i <= numNotas; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            sumaNotas += sc.nextDouble();
        }

        double promedio = sumaNotas / numNotas;

        System.out.print("Ingrese el porcentaje evaluado: ");
        double porcentaje = sc.nextDouble()/100;



        double notasf = promedio*porcentaje;
        double fin= ((3-notasf)/0.3);

        System.out.println("En esto llevas la materia segun tu % Evaluado: " + notasf);

        System.out.println("Esto necesitaras para ganar:  "+fin);


        if (notasf >= 3) {
            System.out.println("El estudiante esta ganando segun su porcentaje final: ");
        } else {
            System.out.println("Al estudiante le falta nota: ");
        }



        sc.close();
    }
}