/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas;

/**
 *
 * @author USER
 */
public class Mavenproject8 {

    public static void main(String[] args) {
   System.out.println("Nilai ujian");
        int uts = 80;
        int uas =90;
        int tugas = 80;
        int rata= (uts+uas+tugas)/3;
        System.out.println("Nilai rata-rata ujian = " +rata);
        if(rata>70){
            System.out.println("lulus");
        }
        else{
            System.out.println("tidak lulus");
        }
    }
}

