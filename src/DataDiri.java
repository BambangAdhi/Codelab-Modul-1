import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        // Untuk membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Untuk meminta input nama
        System.out.print("Masukkan Nama Kamu: ");
        String nama = scanner.nextLine();

        // Untuk meminta input jenis kelamin (P atau L)
        System.out.print("Masukkan Jenis Kelamin Kamu (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Untuk meminta input tanggal lahir
        System.out.print("Masukkan Tanggal Lahir Kamu (YYYY-MM-DD): ");
        String tanggalLahirString = scanner.next();

        // Untuk mengubah input tanggal lahir menjadi objek LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Untuk menghitung umur berdasarkan tanggal lahir yang di input
        Period umur = Period.between(tanggalLahir, LocalDate.now());

        // Untuk menampilkan output yang sesuai maodul
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur Kamu Sekarang: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");

        // Menutup objek Scanner
        scanner.close();
    }
}
