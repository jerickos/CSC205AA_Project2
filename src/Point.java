import java.lang.Math;

public class Point{

    private double x;
    private double y;

    public Point(){
        x=0;
        y=0;
    }

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }


    // using the distance formula to find distance between the two points
    public double distance(Point p2){
        double distance_2p = Math.sqrt( Math.pow((this.x-p2.getX()),2)+Math.pow((this.y-p2.getY()),2));
        return distance_2p;
    }

    //getting and setting for x and y
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }


    public void setPoint(double new_x, double new_y){
        this.x = new_x;
        this.y = new_y;
    }

    // Shifting x by distance
    public void shiftX(double distance_2p){
        this.x = x + distance_2p;
    }

    // Shifting y by distance
    public void shiftY(double distance_2p){
        this.y = y + distance_2p;
    }

    // Rotating the point by using radians
    public void rotate(double radian){
        this.x = (x*(Math.cos(radian)))-(y*(Math.sin(radian)));
        this.y = (x*(Math.sin(radian)))+(y*(Math.cos(radian)));
    }

    // Overriding the toString
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}