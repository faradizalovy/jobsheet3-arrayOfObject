import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Jumlah Dosen: ");
    int n = sc.nextInt();
    sc.nextLine();

    Dosen09[] arrayDosen = new Dosen09[n];
    
    for (int i = 0; i < n; i++) {
        System.out.println("\nMasukkan Data dosen ke-" + (i + 1));
        System.out.print("Kode         : ");
        String kode = sc.nextLine();
        System.out.print("Nama         : ");
        String nama = sc.nextLine();
        System.out.print("Jenis Kelamin: ");
        String jk = sc.nextLine();
        System.out.print("Usia         : ");
        int usia = sc.nextInt();
        sc.nextLine();

        arrayDosen[i] = new Dosen09(kode, nama, jk, usia);
    }
        System.out.println("\n=== DATA DOSEN ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));
            arrayDosen[i].tampil();
        }
        DataDosen09 data = new DataDosen09();

        data.dataSemuaDosen(arrayDosen);          
        System.out.println();
        data.jumlahDosenPerJenisKelamin(arrayDosen); 
        System.out.println();
        data.rerataUsiaDosenPerJenisKelamin(arrayDosen); 
        data.infoDosenPalingTua(arrayDosen);        
        data.infoDosenPalingMuda(arrayDosen);       

        sc.close();
    }
}
