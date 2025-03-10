import static java.lang.Math.*;

public class Segment {
    public Point p1 = new Point();
    public Point p2 = new Point();
    public double length(Point p1, Point p2){
        return sqrt(pow(abs(p1.x - p2.x), 2) + pow(abs(p1.y - p2.y), 2));
    }
}
