// Custom Exception Class
public class InsufficientBalanceException extends Exception {

    private double saldoSaatIni;
    private double jumlahPenarikan;

    // Constructor dengan pesan dan detail saldo
    public InsufficientBalanceException(double saldoSaatIni, double jumlahPenarikan) {
        super(String.format(
            "Saldo tidak mencukupi! Saldo Anda: Rp %.0f, Penarikan: Rp %.0f, Kekurangan: Rp %.0f",
            saldoSaatIni, jumlahPenarikan, (jumlahPenarikan - saldoSaatIni)
        ));
        this.saldoSaatIni = saldoSaatIni;
        this.jumlahPenarikan = jumlahPenarikan;
    }

    public double getSaldoSaatIni()   { 
        return saldoSaatIni; }

    public double getJumlahPenarikan() { 
        return jumlahPenarikan; }
}