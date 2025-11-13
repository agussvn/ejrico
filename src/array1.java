import java.util.Scanner;


public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúantos nombres quieres guardar?");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nombres =new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        System.out.println("\n Los nombres en el orden normal :");
        for (int i = 0; i < n; i++){
            System.out.println(nombres[i]);
        }
        System.out.println("\n Los nombres en orden inverso son: ");
        for (int i = n - 1; i >= 0; i--){
            System.out.println(nombres[i]);
        }
        scanner.close();
    }
}
