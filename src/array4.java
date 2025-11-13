public class array4 {
    public static void main(String[] args) {
        String[] FCB = {"Neymar" , "Messi" , "Súarez"};
        String[] Vardrid = {"CR7" , "Modric" , "Bale"};

        String[] equipoFinal = new String[FCB.length + Vardrid.length];

        System.arraycopy(FCB, 0, equipoFinal, 0, FCB.length);
        System.arraycopy(Vardrid, 0, equipoFinal, FCB.length, Vardrid.length);

        System.out.println("Peak team encontrado");
        for (String jugador : equipoFinal) {
            System.out.println(jugador);
        }
    }
}
