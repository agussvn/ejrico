import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] catalogo ={"George Droid" , "Skibidi69" , "SCP-67 begins" , "Diddys party" , "Sahur days"};

        System.out.println("Qué película deseas? ");
        String peliculaBuscada = sc.nextLine();

        boolean encontrada = false;

        for (String pelicula : catalogo) {
            if (pelicula.equalsIgnoreCase(peliculaBuscada)) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("La pelicula se ha encontrado");
        } else {
            System.out.println("La pelicula no se ha encontrado");
        }
        sc.close();
    }
}
