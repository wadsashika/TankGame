package tank;

public class CoinPile {

    private int i;
    private int x;
    private int y;
    private int LT;
    private int distance;

    public CoinPile(int i,int x, int y, int LT, int distance) {
        this.i=i;
        this.x = x;
        this.y = y;
        this.LT = LT;
        this.distance=distance;
    }

    public int getLT() {
        return LT;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLT(int LT) {
        this.LT = LT;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
}
