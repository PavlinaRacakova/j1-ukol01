package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle turtle;

    public void start() {
        turtle = new Turtle();

        //PARTS 1 AND 2:

        /*
        drawPiglet();
        turtle.penUp();
        turtle.move(100);
        turtle.penDown();
        drawOctagon(50);
        turtle.turnLeft(135);
        turtle.penUp();
        turtle.move(400);
        turtle.penDown();
        drawCircle(15);
        turtle.penUp();
        turtle.move(50);
        turtle.turnLeft(90);
        turtle.move(200);
        turtle.penDown();
        drawSun(30);
        */

        //PARTS 3 AND 4:

        //piglet
        turtle.penUp();
        turnAround();
        turtle.move(200);
        turnAround();
        turtle.penDown();
        drawPiglet();

        //first little house
        turtle.turnRight(45);
        turtle.penUp();
        turtle.move(150);
        turtle.penDown();
        drawLittleHouse();

        //five little houses on top
        drawFiveLittleHouses();

        //last little house
        turtle.turnRight(45);
        turtle.penUp();
        turtle.move(180);
        turtle.turnRight(90);
        goShorterSideOfRectangle();
        turnAround();
        turtle.penDown();
        drawLittleHouse();

        //sun
        turnAround();
        turtle.penUp();
        goLongerSideOfRectangle();
        turtle.turnRight(45);
        turtle.move(250);
        turtle.turnRight(90);
        turtle.move(50);
        turtle.penDown();
        drawSun(10);

        //letters
        turtle.penUp();
        turtle.move(80);
        turtle.turnRight(90);
        turtle.move(60);
        turnAround();
        turtle.penDown();
        drawP();
        drawA();
        drawV();
        drawL();
        drawI();
        drawN();
        drawA();
    }

    private void drawFiveLittleHouses() {
        boolean firstLittleHouse = true;

        for (int i = 0; i < 5; i++) {
            turtle.penUp();

            if (firstLittleHouse) {
                turtle.turnLeft(135);
                turtle.move(180);
                turtle.turnLeft(90);
                goShorterSideOfRectangle();
                firstLittleHouse = false;
            } else {
                turtle.turnRight(135);
                turtle.move(200);
            }

            turnAround();
            turtle.penDown();
            drawLittleHouse();
        }
    }

    public void drawPiglet() {

        //body
        drawRectangle();

        //head
        drawTriangle();

        //legs
        turtle.turnRight(135);
        goShorterSideOfRectangle();
        drawLegs();
        turtle.turnRight(135);
        goLongerSideOfRectangle();
        turtle.turnRight(90);
        drawLegs();

        //tail
        turtle.turnRight(45);
        goShorterSideOfRectangle();
        turtle.turnRight(45);
        turtle.move(20);
        drawCircle(4);
        turtle.move(30);

    }

    public void drawLittleHouse() {
        drawRectangle();
        drawTriangle();
    }

    public void goShorterSideOfRectangle() {
        turtle.move(70);
    }

    public void goLongerSideOfRectangle() {
        turtle.move(90);
    }

    public void turnAround() {
        turtle.turnRight(180);
    }

    public void drawTriangle() {
        turtle.turnLeft(45);
        turtle.move(50);
        turtle.turnRight(90);
        turtle.move(50);
    }

    public void drawRectangle() {
        for (int i = 0; i < 2; i++) {
            goShorterSideOfRectangle();
            turtle.turnRight(90);
            goLongerSideOfRectangle();
            turtle.turnRight(90);
        }
    }

    public void drawLegs() {
        turtle.turnRight(45);
        turtle.move(30);
        turnAround();
        turtle.move(30);
        turtle.turnRight(90);
        turtle.move(30);
        turnAround();
        turtle.move(30);
    }

    public void drawCircle(int size) {
        for (int i = 0; i < 18; i++) {
            turtle.move(size);
            turtle.turnRight(20);
        }
    }

    public void drawOctagon(int size) {
        for (int i = 0; i < 8; i++) {
            turtle.move(size);
            turtle.turnRight(45);
        }
    }

    public void drawSun(int size) {
        int rayCounter = 0;
        for (int i = 0; i < 18; i++) {
            turtle.move(size);
            if (rayCounter % 2 == 0) {
                turtle.turnLeft(80);
                turtle.move(size);
                turtle.turnLeft(180);
                turtle.move(size);
                turtle.turnLeft(80);
            } else {
                turtle.turnRight(20);
            }
            rayCounter++;
        }
    }

    public void drawP() {
        turtle.penDown();
        drawStraightLine();
        turtle.turnRight(90);
        for (int i = 0; i < 9; i++) {
            turtle.move(8);
            turtle.turnRight(20);
        }
        turtle.penUp();
        turtle.turnLeft(135);
        turtle.move(50);
        turtle.turnLeft(45);
        moveToTheNextLetter();
    }

    public void drawA() {
        turtle.penDown();
        turtle.turnRight(20);
        drawStraightLine();
        turtle.turnRight(135);
        turtle.move(40);
        turtle.turnRight(110);
        turtle.move(30);
        turnAround();
        turtle.move(30);
        turtle.turnRight(70);
        turtle.move(40);
        turtle.turnLeft(65);
        turtle.penUp();
        moveToTheNextLetter();
    }

    public void drawV() {
        boolean firstArm = true;
        turtle.turnRight(90);
        turtle.move(40);
        turtle.penDown();
        for (int i = 0; i < 2; i++) {
            if (firstArm) {
                turtle.turnLeft(110);
                firstArm = false;
            } else {
                turtle.turnLeft(135);
            }
            drawStraightLine();
            turnAround();
            drawStraightLine();
        }
        turtle.turnLeft(115);
        turtle.penUp();
        turtle.move(50);
        moveToTheNextLetter();
    }

    public void drawL() {
        turtle.penDown();
        drawStraightLine();
        turnAround();
        drawStraightLine();
        turtle.turnLeft(90);
        turtle.move(50);
        turtle.penUp();
        turtle.move(10);
        moveToTheNextLetter();
    }

    public void drawI() {
        turtle.turnRight(90);
        turtle.move(20);
        turtle.turnLeft(90);
        turtle.penDown();
        drawStraightLine();
        turtle.turnRight(45);
        turtle.penUp();
        turtle.move(20);
        turtle.penDown();
        turtle.move(20);
        turnAround();
        turtle.move(20);
        turtle.penUp();
        turtle.move(20);
        turtle.turnLeft(45);
        drawStraightLine();
        turtle.turnLeft(90);
        turtle.move(20);
        moveToTheNextLetter();
    }

    public void drawN() {
        turtle.penDown();
        drawStraightLine();
        turtle.turnRight(150);
        turtle.move(90);
        turtle.turnLeft(150);
        drawStraightLine();
        turtle.penUp();
        turnAround();
        drawStraightLine();
        turtle.turnLeft(90);
        turtle.move(10);
        moveToTheNextLetter();
    }

    public void moveToTheNextLetter() {
        turtle.move(8);
        turtle.turnLeft(90);
    }

    public void drawStraightLine() {
        turtle.move(80);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
