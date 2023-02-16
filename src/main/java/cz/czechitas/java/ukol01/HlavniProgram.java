package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle zofka;
    private boolean prvniDomecek = true;

    public void start() {
        zofka = new Turtle();

        //CAST 1 A 2:

        /*nakresliPrasatko();
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        nakresliOsmiuhelnik(50);
        zofka.turnLeft(135);
        zofka.penUp();
        zofka.move(400);
        zofka.penDown();
        nakresliKolecko(15);
        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.penDown();
        nakresliSlunicko(30);*/

        //CAST 3 A 4:

        //prasátko
       /* zofka.penUp();
        otocSe();
        zofka.move(200);
        otocSe();
        zofka.penDown();
        nakresliPrasatko();

        //prvni domecek dole
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();
        nakresliDomecek();

        //cyklus pro domecky nahore
        for (int i = 0; i < 5; i++) {

            zofka.penUp();

            if (prvniDomecek){
                zofka.turnLeft(135);
                zofka.move(180);
                zofka.turnLeft(90);
                jdiKratsiStranuObdelniku();
                prvniDomecek = false;
            } else {
                zofka.turnRight(135);
                zofka.move(200);
            }

            otocSe();
            zofka.penDown();
            nakresliDomecek();
        }

        //druhý domecek dole
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(180);
        zofka.turnRight(90);
        jdiKratsiStranuObdelniku();
        otocSe();
        zofka.penDown();
        nakresliDomecek();

        //slunícko
        otocSe();
        zofka.penUp();
        jdiDelsiStranuObdelniku();
        zofka.turnRight(45);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penDown();
        nakresliSlunicko(10);*/

        //písmena
        //zofka.turnLeft(90);

        nakresliP();
        nakresliA();

        nakresliL();
        nakresliA();
        nakresliV();
        nakresliA();

    }

    public void nakresliPrasatko(){

        //nakreslí tělo
        udelejObdelnik();

        //nakreslí hlavu
        udelejTrojuhelnik();

        //nakreslí nohy
        zofka.turnRight(135);
        jdiKratsiStranuObdelniku();
        udelejNohy();
        zofka.turnRight(135);
        jdiDelsiStranuObdelniku();
        zofka.turnRight(90);
        udelejNohy();

        //nakreslí ocásek
        zofka.turnRight(45);
        jdiKratsiStranuObdelniku();
        zofka.turnRight(45);
        zofka.move(20);
        nakresliKolecko(4);
        zofka.move(30);

    }

    public void nakresliDomecek(){
        udelejObdelnik();
        udelejTrojuhelnik();
    }

    public void jdiKratsiStranuObdelniku(){
        zofka.move(70);
    }

    public void jdiDelsiStranuObdelniku(){
        zofka.move(90);
    }

    public void otocSe(){
        zofka.turnRight(180);
    }

    public void udelejTrojuhelnik(){
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
    }

    public void udelejObdelnik(){
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
        otocSe();
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        otocSe();
        zofka.move(30);
    }

    public void nakresliKolecko(int velikost){
        for (int i = 0; i < 18; i++) {
            zofka.move(velikost);
            zofka.turnRight(20);
        }
    }

    public void nakresliOsmiuhelnik(int velikost){
        for (int i = 0; i < 8; i++) {
            zofka.move(velikost);
            zofka.turnRight(45);
        }
    }

    public void nakresliSlunicko(int velikost){
        int pocitadloRamen = 0;
        for (int i = 0; i < 18; i++) {
            zofka.move(velikost);
            if (pocitadloRamen % 2 == 0){
                zofka.turnLeft(80);
                zofka.move(velikost);
                zofka.turnLeft(180);
                zofka.move(velikost);
                zofka.turnLeft(80);
            } else {
                zofka.turnRight(20);
            }
           pocitadloRamen++;
        }
    }

    public void nakresliP(){
        zofka.penDown();
        udelejRovnouCaru();
        zofka.turnRight(90);
        for (int i = 0; i < 9; i++) {
            zofka.move(8);
            zofka.turnRight(20);
        }
        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(50);
        zofka.turnLeft(45);
        presunSeKDalsimuPismenu();
    }

    public void nakresliA(){
        zofka.penDown();
        zofka.turnRight(20);
        udelejRovnouCaru();
        zofka.turnRight(135);
        zofka.move(40);
        zofka.turnRight(110);
        zofka.move(30);
        otocSe();
        zofka.move(30);
        zofka.turnRight(70);
        zofka.move(40);
        zofka.turnLeft(65);
        zofka.penUp();
        presunSeKDalsimuPismenu();
    }

    public void nakresliV(){
        boolean prvniRameno = true;
        zofka.turnRight(90);
        zofka.move(40);
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            if (prvniRameno){
                zofka.turnLeft(110);
                prvniRameno = false;
            } else {
                zofka.turnLeft(135);
            }
            udelejRovnouCaru();
            otocSe();
            udelejRovnouCaru();
        }
        zofka.turnLeft(115);
        zofka.penUp();
        zofka.move(50);
        presunSeKDalsimuPismenu();
    }

    public void nakresliL(){
        zofka.penDown();
        udelejRovnouCaru();
        otocSe();
        udelejRovnouCaru();
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.penUp();
        zofka.move(10);
        presunSeKDalsimuPismenu();
    }

    public void presunSeKDalsimuPismenu(){
        zofka.move(8);
        zofka.turnLeft(90);
    }

    public void udelejRovnouCaru(){
        zofka.move(80);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
