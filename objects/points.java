package objects;

public class points {
    private float pointX, pointY, pointSize;
    public points(float pointX, float pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
        pointSize = 2; // *** Value to be changed ***
    }

    public float getPointX() {
        return pointX;
    }

    public void setPointX(float pointX) {
        this.pointX = pointX;
    }

    public float getPointY() {
        return pointY;
    }

    public void setPointY(float pointY) {
        this.pointY = pointY;
    }

    public float getPointSize() {
        return pointSize;
    }

    public void setPointSize(float pointSize) {
        this.pointSize = pointSize;
    }
}
