public class ValidasiUmur {

    public static void main(String[] args) {

        String inputUmur = "dua puluh";

        try {
            // Mengubah String menjadi integer
            int umur = Integer.parseInt(inputUmur);

            System.out.println("Umur pengguna: " + umur);

        } catch (NumberFormatException e) {

            System.out.println("Input umur harus berupa angka!");
            System.out.println("Terjadi error: " + e.getMessage());

        }

    }
}
//mungkiiin