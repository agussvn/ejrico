import java.util.Scanner;

public class array2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cúantos jugadores hay?");
        int n =sc.nextInt();

        int[] puntuaciones = new int[n];

        for(int i= 0; i < n; i++){
            System.out.print("Introduce la puntuación de cada jugador " + (i + 1 ) + ": ");
            puntuaciones[i] = sc.nextInt();
        }
        int max =puntuaciones[0];
        int min =puntuaciones[0];

        for(int i = 1; i < n; i++){
            if(puntuaciones[i] > max){
                max = puntuaciones[i];
            }
            if(puntuaciones[i] < min){
                min = puntuaciones[i];
            }
        }
        System.out.println("\n La puntuación más alta: " + max);
        System.out.println("\n La puntuación más baja: " + min);

        sc.close();
    }
}