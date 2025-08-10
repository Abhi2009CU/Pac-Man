import processing.core.PApplet;
import processing.core.PImage;
import objects.*;

public class Main extends PApplet {
    PImage board;
    boolean movingLeft, movingRight, movingUp, movingDown; //Direction player moves at start, set boolean true in setup()
    player Player;
    public void settings(){
        size(1000,600);
    }

    public void setup(){
        board = loadImage("board.png");
        movingLeft = false;
        movingRight = false;
        movingUp = false;
        movingDown = false;

        Player = new player(500,300);
    }

    public void draw(){
        //Black background
        background(0,222,0);

        //Board Skeleton before creating wall class
        rect(0,0,820,7); //top bar
        rect(0,236-5,820,7); //low bar
        rect(0,77,64,7);
        rect(0,97,64,7);
        rect(0,129,64,7);
        rect(815-65,77,68,7);
        rect(815-65,97,68,7);
        rect(0,0,7,84); //left top bar
        rect(810,0,7,84); //right top bar
        rect(810,236-84,7,84); //right low bar
        rect(0,236-82, 64,7);
        rect(820-70,236-84, 70,7);
        rect(820-70, 132, 70,7);
        rect(0,236-84,7,84);

        rect(34,35,64-34,15);
        rect(92,35,204-92,61-35);
        rect(92,35,120-92,160-35);
        rect(92,133,205-92,160-133);

        //Drawing Player
        ellipse(Player.getPlayerX(),Player.getPlayerY(),Player.getPlayerSize(),Player.getPlayerSize());
        playerMovement();

    }

    public void keyReleased() {
        if (key == 'd' || keyCode == RIGHT){
            movingRight = true;
            movingLeft = false;
            movingUp = false;
            movingDown = false;
        }
        if (key == 'a' || keyCode == LEFT){
            movingRight = false;
            movingLeft = true;
            movingUp = false;
            movingDown = false;
        }
        if (key == 'w' || keyCode == UP){
            movingRight = false;
            movingLeft = false;
            movingUp = true;
            movingDown = false;
        }
        if (key == 's' || keyCode == DOWN){
            movingRight = false;
            movingLeft = false;
            movingUp = false;
            movingDown = true;
        }
    }

    public void playerMovement() {
        if (movingRight) {
            Player.moveRight();
        }
        if (movingLeft) {
            Player.moveLeft();
        }
        if (movingUp) {
            Player.moveUp();
        }
        if (movingDown) {
            Player.moveDown();
        }

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}