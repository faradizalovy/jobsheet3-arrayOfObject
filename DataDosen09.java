public class DataDosen09 {
    public void dataSemuaDosen(Dosen09[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            Dosen09 d = arrayOfDosen[i];
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode         : " + d.kode);
            System.out.println("Nama         : " + d.nama);
            System.out.println("Jenis Kelamin: " + d.jenisKelamin);
            System.out.println("Usia         : " + d.usia);
            System.out.println();
        }
}
    public void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen09 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                wanita++;
            }
        }
            System.out.println("Jumlah Dosen Pria   : " + pria);
            System.out.println("Jumlah Dosen Wanita : " + wanita);
    }
     public void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
            int totalPria = 0, countPria = 0;
            int totalWanita = 0, countWanita = 0;

            for (Dosen09 d : arrayOfDosen) {
                if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalPria += d.usia;
                countPria++;
                } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalWanita += d.usia;
                countWanita++;
            }
        }
            double avgPria = countPria > 0 ? (double) totalPria / countPria : 0;
            double avgWanita = countWanita > 0 ? (double) totalWanita / countWanita : 0;
            System.out.println("Rata-rata Usia Pria   : " + avgPria);
            System.out.println("Rata-rata Usia Wanita : " + avgWanita);
    }
     public void infoDosenPalingTua(Dosen09[] arrayOfDosen) {
            if (arrayOfDosen.length == 0) return;
            Dosen09 tua = arrayOfDosen[0];
            for (Dosen09 d : arrayOfDosen) {
                if (d.usia > tua.usia) {
                tua = d;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        System.out.println("Kode         : " + tua.kode);
        System.out.println("Nama         : " + tua.nama);
        System.out.println("Jenis Kelamin: " + tua.jenisKelamin);
        System.out.println("Usia         : " + tua.usia);
        System.out.println();
    }
     public void infoDosenPalingMuda(Dosen09[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen09 muda = arrayOfDosen[0];
        for (Dosen09 d : arrayOfDosen) {
            if (d.usia < muda.usia) {
                muda = d;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        System.out.println("Kode         : " + muda.kode);
        System.out.println("Nama         : " + muda.nama);
        System.out.println("Jenis Kelamin: " + muda.jenisKelamin);
        System.out.println("Usia         : " + muda.usia);
        System.out.println();
    }
}


