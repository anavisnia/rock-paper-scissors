/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author anavi
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("1. Akmuo");
        System.out.println("2. Zirkles");
        System.out.println("3. Poperius");
        System.out.println("0. Pabaiga");
        System.out.println();
        System.out.println("Pasirinkite skaiciu:");
        Scanner sc = new Scanner(System.in);
        int zp = sc.nextInt();
        int kp; // generuoja skaiciu nuo 1 iki 3
        int zSuma = 0;
        int zP = 0;
        int kSuma = 0;
        int kP = 0;
        int lygmuo = 0;
        int isVisoZ;
        int isVisoK;
        float isVisoPartiju;
        float panaudojoAkmZ = 0;
        float panaudojoZirZ = 0;
        float panaudojoPopZ = 0;
        float panaudojoAkmK = 0;
        float panaudojoZirK = 0;
        float panaudojoPopK = 0;
        float isVisoZAkm;
        float isVisoZZir;
        float isVisoZPop;
        float isVisoKAkm;
        float isVisoKZir;
        float isVisoKPop;
        do {
            
            if (zp == 1 || zp == 2 || zp == 3) {
                if (zp == 1) {
                    System.out.println("Zaidejas pasirinko: 1. Akmuo");
                    panaudojoAkmZ += 1;
                }
                if (zp == 2) {
                    System.out.println("Zaidejas pasirinko: 2. Zirkles");
                    panaudojoZirZ +=  1;
                }
                if (zp == 3) {
                    System.out.println("Zaidejas pasirinko: 3. Poperius");
                    panaudojoPopZ += 1;
                }
                kp = (int) (Math.random() * 3) + 1;
                if (kp == 1 || kp == 2 || kp == 3) {
                    if (kp == 1) {
                        System.out.println("Kompjuteris pasirinko: 1. Akmuo");
                        panaudojoAkmK += 1;
                    }
                    if (kp == 2) {
                        System.out.println("Kompjuteris pasirinko: 2. Zirkles");
                        panaudojoZirK += 1;
                    }
                    if (kp == 3) {
                        System.out.println("Komjuteris pasirinko: 3. Poperius");
                        panaudojoPopK += 1;
                    }   
                }
                if (zp == 1 && kp == 1 || zp == 2 && kp == 2 || zp == 3 && kp == 3) {
                    System.out.println("Lygmuo!");
                    lygmuo ++;
                }
                if (zp == 1 && kp == 2 || zp == 2 && kp == 3 || zp == 3 && kp == 1) {
                    System.out.println("Zaidejas laimi!");
                    zP ++;
                    zSuma++;
                }
                if (kp == 1 && zp == 2 || kp == 2 && zp == 3 || kp == 3 && zp == 1) {
                    System.out.println("Kompjuteris laimi!");
                    kP ++;
                    kSuma++;
                }
            }
            System.out.println();
            System.out.println("1. Akmuo");
            System.out.println("2. Zirkles");
            System.out.println("3. Poperius");
            System.out.println("0. Pabaiga");
            System.out.println();
            System.out.println("Pasirinkite skaiciu:");
            zp = sc.nextInt();
            if (zp >= 4) {
                System.out.println();
                System.out.println("1. Akmuo");
                System.out.println("2. Zirkles");
                System.out.println("3. Poperius");
                System.out.println("0. Pabaiga");
                System.out.println();
                System.out.println("Pasirinkite skaiciu is naujo:");
                zp = sc.nextInt();
                zSuma += 0;
                kSuma += 0;
                zP += 0;
                kP  += 0;
                lygmuo += 0;
                panaudojoAkmZ += 0;
                panaudojoZirZ += 0;
                panaudojoPopZ += 0;
                panaudojoAkmK += 0;
                panaudojoZirK += 0;
                panaudojoPopK += 0;
            }
            if (zp == 0) {
                isVisoZ = zSuma + lygmuo;
                isVisoK = kSuma + lygmuo;
                isVisoPartiju = zSuma + kSuma + lygmuo;
                isVisoZAkm = (panaudojoAkmZ * 100) / isVisoPartiju;
                isVisoZZir = (panaudojoZirZ * 100) / isVisoPartiju;
                isVisoZPop = (panaudojoPopZ * 100) / isVisoPartiju;
                isVisoKAkm = (panaudojoAkmK * 100) / isVisoPartiju;
                isVisoKZir = (panaudojoZirK * 100) / isVisoPartiju;
                isVisoKPop = (panaudojoPopK * 100) / isVisoPartiju;
                System.out.println("Zaidejas pasirinko: 0. Pabaiga");
                System.out.println("Zaidejas laimejo: " + zSuma + " ir lygmuo:" + lygmuo + ". Is viso: " + isVisoZ);
                System.out.println("Panaudojo Akmuo: " + isVisoZAkm + "%");
                System.out.println("Panaudojo Zirkles: " + isVisoZZir + "%");
                System.out.println("Panaudojo Poperi: " + isVisoZPop + "%");
                System.out.println("Komjuteris laimejo: " + kSuma + " ir lygmuo:" + lygmuo + ". Is viso: " + isVisoK);
                System.out.println("Panaudojo Akmuo: " + isVisoKAkm + "%");
                System.out.println("Panaudojo Zirkles: " + isVisoKZir + "%");
                System.out.println("Panaudojo Poperi: " + isVisoKPop + "%");
            }

        } while (zp != 0);
        
    }

}
