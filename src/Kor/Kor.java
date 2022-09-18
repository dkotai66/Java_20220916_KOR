package Kor;

import java.util.Random;
import java.util.Scanner;

public class Kor {
    private int x;
    private int y;
    private int sugar;

    Random rnd = new Random();

    public Kor(int x, int y, int sugar){
        this.x = x;
        this.y = y;
        this.sugar = sugar;
    }

    public Kor(int sugar){
        this.x = 0;
        this.y = 0;
        this.sugar = sugar;
    }

    public Kor(){
        this.x =  rnd.nextInt(50+10)-30;
        this.y =  rnd.nextInt(50+10)-30;
        this.sugar = rnd.nextInt(30);

    }

    public int getX(int x){
        return x;
    }

    public int getY(int y){
        return y;
    }

    public void setX(){
        this.x = x;
    }

    public void setY(){
        this.y = y;
    }

    public int getSugar(int sugar){
        return sugar;
    }

    public void getSugar(){
        this.sugar = sugar;
    }

    private int koordinataGeneralasa(int n) {
        return (int) (Math.random() * (2 * n + 1)) - n;
    }

    public double Kerulet(){
        return (this.sugar*2)*Math.PI;
    }

    public double Terulet(){
        return (this.sugar*this.sugar)*Math.PI;
    }

    public double Meretezes(int szam){
        return this.sugar+szam;
    }


    @Override
    public String toString(){
        return String.format("(%d,%d) koordinátájú, %d sugarú kör",this.x, this.y, this.sugar);
    }

}
