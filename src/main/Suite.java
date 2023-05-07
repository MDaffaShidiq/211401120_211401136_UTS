package main;

import java.util.Scanner;
public class Suite{
    public static float harga;
    public void Show(){
        System.out.println("This is Suite Class Menu");
    }

    int[] biayaProduksi = new int[] {700000,850000,1000000};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Kamar:" +
                        "\n1. Kamar Tipe-A " + 1.25*biayaProduksi[0] +
                        "\n2. Kamar Tipe-B " + 1.25*biayaProduksi[1] +
                        "\n3. Kamar Tipe-C " + 1.25*biayaProduksi[2] +
                        "\n4.Kembali");
        System.out.print("\nPilih:");
        int pilihan = input.nextInt();
        
       
        switch(pilihan){
            case 1:
                System.out.println("Ingin Memesan Berapa Malam : ");
                int malam = input.nextInt();
                harga+=1.25*biayaProduksi[0]*malam;
                Booked.MalamSuiteA=Booked.MalamSuiteA+malam;
                Booked.SuiteA++;
                Menu();
                break;
            case 2:
                System.out.println("Ingin Memesan Berapa Malam : ");
                int malam2 = input.nextInt();
                harga+=1.25*biayaProduksi[1]*malam2;
                Booked.MalamSuiteB=Booked.MalamSuiteB+malam2;
                Booked.SuiteB++;
                Menu();
                break;
            case 3:
                System.out.println("Ingin Memesan Berapa Malam : ");
                int malam3 = input.nextInt();
                harga+=1.25*biayaProduksi[2]*malam3;
                Booked.MalamSuiteC=Booked.MalamSuiteC+malam3;
                Booked.SuiteC++;
                Menu();
                break;
            case 4:
                new Reservation();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }
}