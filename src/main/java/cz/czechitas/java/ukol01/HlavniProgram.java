package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        nakresliPrasatko();
    }

    /**
     * nakreslí prasátko z pohledu směrem nahoru
     */
    public void nakresliPrasatko(){

        //nakreslí tělo
        udelejTelo();
        //nakreslí hlavu
        udelejHlavu();
        //nakreslí nohy
        zofka.turnRight(135);
      //  zofka.penUp();
        jdiKratsiStranuObdelniku();
      //  zofka.penDown();
        udelejNohy();
        zofka.turnRight(135);
     //   zofka.penUp();
        jdiDelsiStranuObdelniku();
        zofka.turnRight(90);
    //    zofka.penDown();
        udelejNohy();

        //nakreslí ocásek
        zofka.turnRight(45);
        jdiKratsiStranuObdelniku();
        zofka.turnRight(45);
        zofka.move(20);
        nakresliKolecko(4);
        zofka.move(30);

    }

    public void jdiKratsiStranuObdelniku(){
        zofka.move(70);
    }

    public void jdiDelsiStranuObdelniku(){
        zofka.move(90);
    }

    public void udelejHlavu(){
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
    }

    public void udelejTelo(){
        for (int i = 0; i < 2; i++) {
            jdiKratsiStranuObdelniku();
            zofka.turnRight(90);
            jdiDelsiStranuObdelniku();
            zofka.turnRight(90);
        }
    }

    public void udelejNohy(){
        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
    }

    public void nakresliKolecko(int velikost){
        for (int i = 0; i < 18; i++) {
            zofka.move(velikost);
            zofka.turnRight(20);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
