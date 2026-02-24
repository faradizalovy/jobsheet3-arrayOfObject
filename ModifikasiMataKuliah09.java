import java.util.Scanner;

public class ModifikasiMataKuliah09 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Masukkan jumlah mata kuliah: ");
       int jumlah = Integer.parseInt(sc.nextLine());

       MataKuliah09[] arrayOfMataKuliah09 = new MataKuliah09[jumlah];
       String kode, nama, dummy;
       int sks, jumlahJam;

       for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------");

            arrayOfMataKuliah09[i] = new MataKuliah09("", "", 0, 0);
            arrayOfMataKuliah09[i].tambahData(kode, nama, sks, jumlahJam);
    }
       for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah09[i].cetakInfo();
            System.out.println("-------------------------------------");
       }
   }
}
