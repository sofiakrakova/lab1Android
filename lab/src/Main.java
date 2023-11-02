import Shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Red", 5),
                new Rectangle("Blue", 4, 6),
                new Triangle("Green", 3, 4, 5),
                new Square("Yellow", 4),
              //  new Shapes.Circle("Orange", 2.5)
        };

        double sum = Geometry.getTotalArea(shapes);
        System.out.println("Сумма площадей всех фигур: " + sum);
    }
}

