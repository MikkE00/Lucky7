import java.util.Random;
public class Lucky7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerot = new int[3];

        // Arvotaan 3 numeroa väliltä 1-10
        for (int i = 0; i < 3; i++) {
            numerot[i] = random.nextInt(10) + 1;
        }

        System.out.print("Arvotut numerot: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(numerot[i] + " ");
        }
        System.out.println();

        boolean voitto = false;

        // Tarkistetaan, onko joukossa numero seitsemän
        for (int i = 0; i < 3; i++) {
            if (numerot[i] == 7) {
                voitto = true;
                break;
            }
        }
    //Voitto- ja häviöviestit
        if (voitto) {
            System.out.println("Onneksi olkoon, voitit pelin!");
        } else {
            System.out.println("Hävisit pelin!");
        }
    }
}
