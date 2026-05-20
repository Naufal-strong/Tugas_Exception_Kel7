public class FormatNama {
    public static void main(String[] args) {
        String namaPengguna = null; // Mensimulasikan data kosong dari database
        String namaFormat;

        if (namaPengguna != null) {
            namaFormat = namaPengguna.toUpperCase();
        } else {
            namaFormat = "PENGGUNA BARU"; // Memberikan nilai default
        }

        System.out.println("Nama Profil: " + namaFormat);
    }
}