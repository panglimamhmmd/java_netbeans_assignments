import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("DATA PENJUALAN BARANG\nPT'PAMULANG TAMA'\nNama Kasir : Muhammad Firdaus Aldiansyah");
        DataBarang[] brg = new DataBarang[3];
        brg[0] = new DataBarang(1, "brg1", "handuk", 50000);
        brg[1] = new DataBarang(2, "brg2", "kipas", 120000);
        brg[2] = new DataBarang(3, "brg3", "guling", 35000);
        int menu;
        do{
            System.out.println("PILIH MENU");
            System.out.println("===================");
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar Program");
            System.out.println("===================");
            System.out.println("Pilih Menu ?");
            menu = scanner.nextInt();
            System.out.println("");
            switch(menu){
            case 1 -> InputData(brg, scanner);
            case 2 -> TampilData(brg, scanner);
            case 3 -> System.out.println("Selesai");
            }
        }while(menu != 3);
    }
    static void InputData(DataBarang[] brg, Scanner scanner){
        int val;
        do{
            System.out.println("pilih barang yang ingin dibeli: ");
            val = scanner.nextInt();
            switch(val){
                case 1:
                    System.out.println("Deskripsi : Handuk\nHarga: 50000\n");
                    System.out.println("mau beli berapa ? ");
                    int val2 = scanner.nextInt();
                    brg[0].jumlah_beli = val2;
                    brg[0].total_bayar = brg[0].harga_barang * val2;
                    break;
                case 2:
                    System.out.println("Deskripsi : Kipas\nHarga: 120000\n");
                    System.out.println("mau beli berapa ? ");
                    int val3 = scanner.nextInt();
                    brg[1].jumlah_beli = val3;
                    brg[1].total_bayar = brg[1].harga_barang * val3;
                    break;
                case 3:
                    System.out.println("Deskripsi : Guling\nHarga: 35000\n");
                    System.out.println("mau beli berapa ? ");
                    int val4 = scanner.nextInt();
                    brg[2].jumlah_beli = val4;
                    brg[2].total_bayar = brg[2].harga_barang * val4;
                    break;
                case 4:
                    System.out.println("Pembelian Selsai");
                }
        }while(val != 4);
    }
    static void TampilData(DataBarang[] brg, Scanner scanner){
        int jumlah_bayar = 0, diskon = 0, ppn, cara_bayar, biaya_kartu = 0;
        System.out.println("==============================================================================");
        System.out.println("No. \tKode Barang\t Nama Barang\t Harga Barang\t Jumlah Beli\t Bayar");
        for(int i = 0; i < brg.length; i++){
            jumlah_bayar += brg[i].total_bayar;
            System.out.println
            (
                brg[i].No + "\t" +
                brg[i].kd_barang + "\t\t " +
                brg[i].nama_barang + "\t\t " +
                brg[i].harga_barang + "\t\t " +
                brg[i].jumlah_beli + "\t\t " +
                brg[i].total_bayar 
            );
        }
        System.out.println("==============================================================================");
        System.out.println("Jumlah Bayar: " + jumlah_bayar);
        if(jumlah_bayar >= 500000){
            diskon = (5/100) * jumlah_bayar;   
            jumlah_bayar -= diskon;
        }
        System.out.println("Diskon: " + diskon);
        ppn = (10/100) * jumlah_bayar;
        System.out.println("PPN: " + ppn);
        jumlah_bayar += ppn;
        System.out.println("\n");
        System.out.println("Cara Bayar:\n1.Visa-Master\n2.Debit\n3.Cash");
        System.out.println("Masukkan Cara Bayar: ");
        cara_bayar = scanner.nextInt();
        String via = "";
        
        switch(cara_bayar){
            case 1: 
                via = "Visa-Master"; 
                biaya_kartu = (3/100) * jumlah_bayar;
                System.out.println("INI BIAYA WOI: " + String.valueOf(biaya_kartu));
                jumlah_bayar += biaya_kartu;
                break;
            case 2: via = "Debit"; break;
            case 3: via = "Cash"; break;
        }
        System.out.println("Cara Bayar: " + via);
        System.out.println("Biayar Kartu: " + biaya_kartu);
        System.out.println("Total Bayar: " + jumlah_bayar);
    }
}
