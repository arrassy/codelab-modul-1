import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Masukkan nama : ");
        String nama = SC.nextLine();

        System.out.print("Masukkan jenis kelamin : ");
        String kelamin = SC.nextLine();
        String jenisKelamin = (kelamin.equalsIgnoreCase("L")) ? "Laki-laki" : "Perempuan";

        System.out.print("Masukkan tanggal lahir (dd/MM/yyyy) : ");
        LocalDate ttl = LocalDate.parse(SC.nextLine(), formatter);

        LocalDate skrg = LocalDate.now();
        Period umur = Period.between(ttl, skrg);

        System.out.println("==========Data Diri=========");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia : " + umur.getYears() + " tahun");
    }
}
