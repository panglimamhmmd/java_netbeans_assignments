/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MrToms
 */
public class DataBarang {
    public int No;
    public String kd_barang;
    public String nama_barang;
    public int harga_barang;
    public int jumlah_beli;
    public int total_bayar;
    
    public DataBarang(int no, String kode, String nama, int harga){
        No = no;
        kd_barang = kode;
        nama_barang = nama;
        harga_barang = harga;
    }
}
