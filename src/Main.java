import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
   //     Point start = new Point(0, 40.0);
    //    Point end = new Point(30, 70.0);
    //    Segment line = new Segment(new Point(start), new Point(end));
        //    start.setY(200.0);
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(0,0));
        points.add(new Point(20, 50));
        points.add(new Point(15, 80));
        Polygon poly = new Polygon(points);

    }
}