public class PencarianPeringkat {

    public static void main(String[] args) {

        String[] mahasiswa = {
            "Wisnu",
            "Andhika",
            "Bagas",
            "Naufal",
            "Atta"
        };

        int peringkatDicari = 10;

        try {

            String nama = mahasiswa[peringkatDicari - 1];

            System.out.println("Mahasiswa peringkat "
                    + peringkatDicari + " adalah " + nama);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: peringkat yang dicari tidak ditemukan");
            System.out.println("Data hanya tersedia untuk peringkat 1 sampai 5");

        }

        System.out.println("Program selesai");
    }
}