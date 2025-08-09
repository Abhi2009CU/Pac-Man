import processing.core.PApplet;
import processing.core.PImage;
//import processing.core.PImage;

public class Main extends PApplet {
    PImage board;
    public void settings(){
        size(1000,600);
    }

    public void setup(){
        board = loadImage("board.png");
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
    }

    public static void main(String[] args) {
        PApplet.main("main");
    }

}