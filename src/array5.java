public class array5 {
    public static void main(String[] args) {

        int[] ferrari = {340, 3, 95};
        int[] lambo = {330, 2, 96};

        String[] estadísticas = {"Velocidad" , "Aceleración" , "Manejo"};

        System.out.println("Batalla de coches");

        for (int i = 0; i < estadísticas.length; i++) {
            System.out.print(estadísticas[i] + ": ");
            if (ferrari[i] > lambo[i]) {
                System.out.println(" Ferrari gana (" + ferrari[i] + " vs " + lambo[i] + ")");
            } else if (ferrari[i] < lambo[i]) {
                System.out.println("bLamborghini gana (" + lambo[i] + " vs " + ferrari[i] + ")");
            } else {
                System.out.println(" Empate (" + ferrari[i] + ")");
            }
        }
    }
}


