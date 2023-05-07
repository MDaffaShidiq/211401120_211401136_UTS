package main;

public class Inspect {
    static float totalOmset = 0;
    static float uangairdanlistrik = 0;
    static float totalBiayaProduksi = 0;
    static float gajiKaryawan = 0;
    static float pajak = 0;
    static float totalKeuntungan = 0;

public Inspect(){
    totalOmset = Economy.harga + Bussiness.harga + Suite.harga;
    uangairdanlistrik = 300000;
    totalBiayaProduksi = 0.25f * totalOmset + uangairdanlistrik;
    gajiKaryawan = 0.4f * totalBiayaProduksi;
    pajak = 0.1f * totalOmset;
    totalKeuntungan = totalOmset - totalBiayaProduksi - gajiKaryawan - pajak;
        System.out.println("Total Omset Penjualan: " + totalOmset);
        System.out.println("Gaji Karyawan dan Biaya Fasilitas Pendukung: " + gajiKaryawan);
        System.out.println("Biaya Produksi: " + totalBiayaProduksi);
        System.out.println("Biaya Pajak: " + pajak);
        System.out.println("Hasil Laba/Keuntungan Bersih : (totalOmset - BiayaProduksi - GajiKaryawan -  Pajak = " + totalKeuntungan);
        Main.Menu();
    }
}