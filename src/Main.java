public class Main {
    public static void main(String[] args) {

        Square square = new Square();
        Circle circle = new Circle();
        Polygon square1 = new Square();
        Polygon circle1 = new Circle();
        Polygon polygon = new Polygon();

        square.render();
        circle.render();
        square1.render();
        circle1.render();
        polygon.render();

        System.out.println("*******************************************");

        Polygon circle2 = new Circle();
        Polygon square2 = new Square();
        Draw draw = new Draw();
        draw.drawFigure(circle2);
        draw.drawFigure(square2);
    }
}