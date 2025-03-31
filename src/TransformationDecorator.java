public class TransformationDecorator extends ShapeDecorator {
    private String transformation;

    public TransformationDecorator(Shape decoratedShape, String transformation) {
        super(decoratedShape);
        this.transformation = transformation;
    }
    public String toSvg(){
        return this.toSvg();
    }
    public String toSvg(String param){
        return
    }
    public static class Builder{
        private String transformation = "";
        public Builder translate(Point p){

        }
        public Builder rotate(float angle, Point center){

        }
        public Builder scale(Point p){

        }
        public TransformationDecorator build(Shape shape){
            return new TransformationDecorator(shape,transformation);
        }
    }
}
