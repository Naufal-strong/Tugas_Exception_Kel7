import java.util.Scanner;

public class KalkulatorPembagian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pembilang: ");
            int pembilang = input.nextInt();

            System.out.print("Masukkan angka penyebut: ");
            int penyebut = input.nextInt();

            int hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa melakukan pembagian dengan nol.");
        } catch (Exception e) {
            System.out.println("Error: Input harus berupa angka bulat.");
        } finally {
            input.close();
            System.out.println("Program selesai.");
        }
    }
}