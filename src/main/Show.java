package main;

public class Show {
        public Show(){
            System.out.println("Jumlah Pengunjung Diharapkan: " + Math.round(Inspect.totalOmset / Inspect.totalKeuntungan));
            System.out.println("Jumlah Pengunjung: " + Main.jumlahPengunjung);
            System.out.println("Total Keuntungan: " + Inspect.totalKeuntungan);
            Main.Menu();
        }
}
