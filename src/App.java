import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Soal soal = new Soal();
        Object[][] array = soal.soal();
        // iki mek gae contoh jawaban user e, ngkok dicocokno gae fungsi ndek class
        // Fungsi
        Object[][] jawaban = new Object[array.length][2];
        Scanner input = new Scanner(System.in);

        // Object[][] hasil = Fungsi.quiz(array, jawaban);

        // System.out.println(Arrays.deepToString(hasil));
        Boolean lanjut = true;
        while (lanjut) {
            System.out.println("======================================");
            System.out.println("Soal - soalan");
            System.out.println("");
            System.out.println("1. Start");
            System.out.println("2. Keluar");
            System.out.println("======================================");
            System.out.println("Pilih Menu :");
            int menu = input.nextInt();
            if (menu == 1) {
                System.out.println("Quiz 1: " + array[0][1]);
                System.out.println("1. " + array[0][3]);
                System.out.println("2. " + array[0][4]);
                System.out.println("3. " + array[0][5]);
                System.out.println("4. " + array[0][6]);
            } else {
                lanjut = false;
            }
        }

    }
}
