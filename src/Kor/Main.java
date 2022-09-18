package Kor;

import Kor.Kor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kor K1=new Kor(20, -10, 5);
        Kor K2=new Kor(60);
        Kor K3=new Kor();

        System.out.println(K1);
        System.out.println(K2);
        System.out.println(K3);

        System.out.printf("A kör kerülete %.2f", K3.Kerulet());
        System.out.printf("A kör területe %.2f", K3.Terulet());

        System.out.println("\nAdja meg a számot amivel méretezni szeretné a kört:  ");
        int szam = sc.nextInt();
        if (K3.Meretezes(szam)<0){
            System.out.println("Hiba");
        }
        else{
            System.out.printf("A sugár %s -re nőtt", K3.Meretezes(szam));
        }


        Kor korok[] = new Kor[10];
        for (int i = 0; i< korok.length; i++){
        korok[i]=new Kor();
        }

        for (Kor k:korok){
            System.out.println(k);
        }

        int legnagyobbTeruletuKor =0;
        for (int i = 0; i < korok.length; i++){
            if(korok[legnagyobbTeruletuKor].Terulet()<korok[i].Terulet()){
                legnagyobbTeruletuKor =i;
            }
        }

        System.out.printf("A legnagyobb területtelrendelkező kör a %s. Területe %.3f cm",korok[legnagyobbTeruletuKor],korok[legnagyobbTeruletuKor].Terulet());
    }
}
