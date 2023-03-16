package posttest2;

import java.util.ArrayList;
import java.util.Scanner;

public class posttest2 {
    static ArrayList<Data> dataList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while (true) {
            System.out.println("\nProgram Pendataan Barang COffee Shop Tok Aba");
            System.out.println("==============================================");
            System.out.println("|   1. Menambah Data Barang                  |");
            System.out.println("|   2. Lihat Data Barang                     |");
            System.out.println("|   3. Ubah Data Barang                      |");
            System.out.println("|   4. Hapus Data Barang                     |");
            System.out.println("|   5. Keluar Program                        |");
            System.out.println("==============================================");
            System.out.print("Pilihan: ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    addData();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void addData() { 
        System.out.println("\n\tMenu Menambahkan Data ");
        System.out.println("====================================");
        System.out.print("Nama Barang : ");
        scanner.nextLine(); 
        String name = scanner.next();
        System.out.print("Tanggal Masuk Barang (DD/MM/YYYY): ");
        scanner.nextLine();
        String tanggalBrg = scanner.next();
        System.out.print("Harga Beli Barang : ");
        scanner.nextLine();
        String HargaBeli = scanner.next();
        System.out.print("Harga Jual Barang : ");
        scanner.nextLine();
        String HargaJual = scanner.next();
        System.out.print("Stok Masuk Barang : ");
        scanner.nextLine();
        String StokMasuk = scanner.next();

        Data data = new Data(name, tanggalBrg, HargaBeli, HargaJual, StokMasuk);
        dataList.add(data);
        System.out.println("====================================");
        System.out.println("Data berhasil ditambahkan");
    }

    static void showData() {
        System.out.println("\n\tData Barang Tok Aba");
        System.out.println("====================================");
        if (dataList.isEmpty()) {
            System.out.println("Tidak ada data");
        } else {
            for (int i = 0; i < dataList.size(); i++) {
                System.out.println("\nData ke-" + (i + 1));
                System.out.println("====================================");
                System.out.println("Nama            : " + dataList.get(i).getName());
                System.out.println("Tanggal Masuk   : " + dataList.get(i).getTanggalBrg());
                System.out.println("Harga Beli      : " + dataList.get(i).getHargaBeli());
                System.out.println("Harga Jual      : " + dataList.get(i).getHargaJual());
                System.out.println("Stok Masuk      : " + dataList.get(i).getStokMasuk());
                System.out.println("====================================");
            }
        }
    }

    static void updateData() {
        if (dataList.isEmpty()) {
            System.out.println("\nTidak ada data");
        } else {
            showData();
            System.out.print("Nomor data yang akan diubah: ");
            int index = scanner.nextInt() - 1; 

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                System.out.println("\n\tMenu Mengubah Data ");
                System.out.println("====================================");
                System.out.print("Masukkan Nama baru : ");
                String name = scanner.next();

                System.out.print("Masukkan Tanggal Masuk baru : ");
                String tanggalBrg = scanner.next();

                System.out.print("Masukkan Harga Beli baru : ");
                String HargaBeli = scanner.next();

                System.out.print("Masukkan Harga Jual baru : ");
                String HargaJual = scanner.next();

                System.out.print("Masukkan Stok Masuk baru : ");
                String StokMasuk = scanner.next();

                Data data = new Data(name, tanggalBrg, HargaBeli, HargaJual, StokMasuk);
                dataList.set(index, data); //ini setnya
                System.out.println("====================================");
                System.out.println("Data berhasil diupdate");
            }
        }
    }

    static void deleteData() { 
        if (dataList.isEmpty()) {
            System.out.println("\nTidak ada data");
        } else {
            showData();
            System.out.println("\n\tMenu Menghapus Data ");
            System.out.println("====================================");
            System.out.print("Nomor data yang akan dihapus: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                dataList.remove(index);
                System.out.println("====================================");
                System.out.println("Data berhasil dihapus");
            }
        }
    }
}
