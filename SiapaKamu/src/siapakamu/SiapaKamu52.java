/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siapakamu;

/**
 *
 * @author ASUS TUF
 * Nama : Salma Nafisa Qurrotu'Aini
 * Nim : 22205038
 * Kelas : Teknik Informatika
 * Matakuliah : PBO1
 * Semester : 3
 */

public class SiapaKamu52 {

  public static void main(String[] args) {
        Dosen dosen;
        Mahasiswa mhs;
        
        dosen = new Dosen();
        System.out.println("NIP Dosen\t: 41227829930");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        mhs = new Mahasiswa();
        System.out.println("NIM Mahasiswa\t: 22205038");
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}