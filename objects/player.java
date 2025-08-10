package objects;
public class player{
    private float playerX, playerY, playerSize, playerSpeed;

    public player(float playerX, float playerY){
        this.playerX = playerX;
        this.playerY = playerY;
        this.playerSize = 30; // *** Value to be changed ***
        this.playerSpeed = 5; // *** Value to be changed ***
    }

    public void moveLeft() {
        playerX -= playerSpeed;
    }
    public void moveRight() {
        playerX += playerSpeed;
    }
    public void moveUp() {
        playerY -= playerSpeed;
    }
    public void moveDown() {
        playerY += playerSpeed;
    }


    public float getPlayerX() {
        return playerX;
    }

    public void setPlayerX(float playerX) {
        this.playerX = playerX;
    }

    public float getPlayerY() {
        return playerY;
    }

    public void setPlayerY(float playerY) {
        this.playerY = playerY;
    }

    public float getPlayerSize() {
        return playerSize;
    }

    public void setPlayerSize(float playerSize) {
        this.playerSize = playerSize;
    }
}