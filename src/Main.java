import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> populasi = new ArrayList<>();
        int jumlahIndividu = 10;

        for (int i = 0; i < 10; i++) {
            int[] individu = generateKrom(jumlahIndividu);
            populasi.add(individu);
        }

        for (int i = 0; i < populasi.size(); i++) {
            int[] individu = populasi.get(i);
            System.out.println("Individu " + (i + 1) + ":");
            int jumlah = 0;
            for (int j = 0; j < individu.length; j++) {
                System.out.print(individu[j] + " ");
                if (individu[j] == 1) {
                    jumlah++;
                }

            }
            System.out.print("Isi = " + jumlah);
            System.out.println();
        }

    }

    static int[] generateKrom(int jumlah) {
        Random random1 = new Random();

        int[] individu = new int[jumlah];

        for (int i = 0; i < individu.length; i++) {
            int random = random1.nextInt(2);
            individu[i] = random;
        }
        return individu;
    }
}
