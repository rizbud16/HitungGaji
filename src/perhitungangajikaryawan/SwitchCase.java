// This is switch case statement
package perhitungangajikaryawan;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
    // Input scanner
        Scanner n = new Scanner(System.in); // input nama
        Scanner gol = new Scanner(System.in);
        Scanner pend = new Scanner(System.in);
        Scanner kerja = new Scanner(System.in);
        
        String name, pendidikan = null;
        int gaji_pokok = 300000, golongan, tunj_jabatan = 0, tunj_pendidikan= 0, jam_kerja_bulan = 8*6*4, total_kerja_bulan, jam_lembur, honor_lembur, honor_lembur_jam = 3500, total;
                
        System.out.println("###############################");
        System.out.println("## PERHITUNGAN GAJI KARYAWAN ##");
        System.out.println("###############################");
        
        System.out.print("Nama: ");
        name = n.nextLine();
        System.out.print("Golongan: ");
        golongan = gol.nextInt();
        System.out.print("Pendidikan: ");
        pendidikan = pend.nextLine();
        System.out.print("Total Jam Kerja dalam sebulan: ");
        total_kerja_bulan = kerja.nextInt();
        
        switch (golongan) {
            case 1:
                tunj_jabatan =  gaji_pokok * 5/100;
                break;
            case 2:
                tunj_jabatan =  gaji_pokok * 10/100;
                break;
            case 3:
                tunj_jabatan =  gaji_pokok * 15/100;
                break;
            default:
                System.out.println("Golongan yang anda masukkan tidak sesuai");
                System.exit(0);
        }
        
        switch(pendidikan) {
            case "sma" :
                tunj_pendidikan = (int) (gaji_pokok * 2.5/100);
                break;
            case "d1" :
                tunj_pendidikan = gaji_pokok * 5/100;
                break;
            case "d3" :
                tunj_pendidikan = gaji_pokok * 20/100;
                break;
            case "s1" :
                tunj_pendidikan = gaji_pokok * 30/100;
                break;
            default:
                System.out.println("Pendidikan yang anda masukkan tidak sesuai");
                System.exit(0);
        }
        
        jam_lembur = total_kerja_bulan - jam_kerja_bulan;
        honor_lembur = jam_lembur * honor_lembur_jam;
        total = (int) (gaji_pokok + tunj_jabatan + tunj_pendidikan + honor_lembur);
        
        System.out.println("");
        System.out.println("Nama             : " + name);
        System.out.println("Gaji Pokok       : Rp" + gaji_pokok);
        System.out.println("Tunj. Jabatan    : Rp" + tunj_jabatan);
        System.out.println("Tunj. Pendidikan : Rp" + tunj_pendidikan);
        System.out.println("Honor Lembur     : Rp" + honor_lembur);
        System.out.println("______________________________ +");
        System.out.println("Total Gaji       : Rp" + total);
    }
}
