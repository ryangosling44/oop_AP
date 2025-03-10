public class Point {
    public double x;
    public double y;
    public String toString(){
        return "P(x,y) = " + "(" + x + "," + y + ")";
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public String toSvg(){
        return "<svg height=\"100\" width=\"100\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <circle r=\"45\" cx=\""+ x + "\" cy=\"" + y + "\" fill=\"red\" />\n" +
                "</svg>";
    }
    public void translate(double dx, double dy){
        x = x + dx;
        y = y + dy;
    }
    public void translated(double dx, double dy){
        Point nP = new Point(x, y);
        nP.x = x + dx;
        nP.y = y + dy;
    }

}
