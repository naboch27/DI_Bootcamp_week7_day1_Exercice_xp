/**
 * MyPoin
 */
public class MyPoint {

    private int x = 0 ;

    private int y = 0 ;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int[] getXY() {

        int tab[] = {this.x,this.y};

        return  tab;

    }

    public void setY(int x,int y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "MyPoint [x=" + x + ", y=" + y + "]";
    }

    public double distance(int x, int y) {

        return this.y-this.x;
        
    }

    public double distance(MyPoint another) {

        return this.y-this.x;
        
    }

    public double distance() {

        return this.y-this.x;
        
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));
        
    }
    
}