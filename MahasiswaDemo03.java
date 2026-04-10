import java.util.Scanner;
public class MahasiswaDemo03 {
    public static void main(String[] args) {

        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();
        Scanner sc = new Scanner (System.in);
        int jumMhs = 5;
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Kelas: ");
            String kelas = sc.next();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.println("--------------------"); 

            Mahasiswa03 m = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        list.selectionSort();
        list.tampil();
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("--------------------");
        System.out.println("Menggunakan binary search");
         System.out.println("--------------------");
         double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
