/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awalan;

/**
 *
 * @author Rhif0053
 */
import java.util.Scanner;
public class KonversiSuhuBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suhuAwal, suhuHasil;
        System.out.println("Menu Konversi Suhu:");
        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Celcius ke Reamur");
        System.out.println("3. Fahrenheit ke Celcius");
        System.out.println("4. Fahrenheit ke Reamur");
        System.out.println("5. Reamur ke Celcius");
        System.out.println("6. Reamur ke Fahrenheit");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("===========================");
                System.out.println("Celsius ke Fahrenheit");
                System.out.println("===========================");
                System.out.print("Masukkan suhu dalam Celcius: ");
                suhuAwal = input.nextDouble();
                KonversiSuhu cf = new KonversiSuhu();
                suhuHasil = cf.celKeFah(suhuAwal);
                System.out.println("Hasil konversi: " +suhuHasil+   " Fahrenheit");
                break;
            case 2:
                System.out.println("===========================");
                System.out.println("Celcius ke Reamur");
                System.out.println("===========================");
                System.out.print("Masukkan suhu dalam Celcius: ");
                suhuAwal = input.nextDouble();
                KonversiSuhu cr = new KonversiSuhu();
                suhuHasil = cr.celKeRe(suhuAwal);
                System.out.println("Hasil konversi: " +suhuHasil+   " Reamur");
                break;
            case 3:
                System.out.println("===========================");
                System.out.println("Fahrenheit ke Celcius");
                System.out.println("===========================");
                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                suhuAwal = input.nextDouble();
                KonversiSuhu fc = new KonversiSuhu();
                suhuHasil = fc.fahKeCel(suhuAwal);
                System.out.println("Hasil konversi: " +suhuHasil+   " Celcius");
                break;
            case 4:
                System.out.println("===========================");
                System.out.println("Fahrenheit ke Reamur");
                System.out.println("===========================");
                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                suhuAwal = input.nextDouble();
                KonversiSuhu fr = new KonversiSuhu();
                suhuHasil = fr.fahKeRe(suhuAwal);
                System.out.println("Hasil konversi: " +suhuHasil+   " Reamur");
                break;
            case 5:
                System.out.println("===========================");
                System.out.println("Reamur ke Celcius");
                System.out.println("===========================");
                System.out.print("Masukkan suhu dalam Reamur: ");
                suhuAwal = input.nextDouble();
                KonversiSuhu rc = new KonversiSuhu();
                suhuHasil = rc.reKeCel(suhuAwal);
                System.out.println("Hasil konversi: " +suhuHasil+   " Celcius");
                break;
            case 6:
                System.out.println("===========================");
                System.out.println("Reamur ke Fahrenheit");
                System.out.println("===========================");
                System.out.print("Masukkan suhu dalam Reamur: ");
                suhuAwal = input.nextDouble();
                KonversiSuhu rf = new KonversiSuhu();
                suhuHasil = rf.reKeFah(suhuAwal);
                System.out.println("Hasil konversi: " +suhuHasil+   " Fahrenheit");
                break;
            
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
