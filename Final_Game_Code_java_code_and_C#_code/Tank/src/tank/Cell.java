package tank;

public class Cell implements Comparable<Cell>{
    private int x;
    private int y;
    int value;
    private Cell parent;
    private boolean isVisited;

    public Cell(int x, int y,int value) {
        this.x = x;
        this.y = y;
        this.value=value;
        parent=null;
    }

    public Cell getparent() {
        return parent;
    }

    public void setparent(Cell parent) {
        this.parent = parent;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int compareTo(Cell o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
