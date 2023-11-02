import Shapes.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GeometryTest {

    @Test
    public void testGetTotalArea() {
        Shape[] shapes = new Shape[]{
                new Circle("Red", 2.5),
                new Rectangle("Blue", 5, 10),
                new Triangle("Green", 3, 4, 5),
                new Square("Yellow", 7)
        };

        double expectedTotalArea = 124.63495408493621;

        double actualTotalArea = Geometry.getTotalArea(shapes);

        double delta=0.0000001;

        assertEquals(expectedTotalArea, actualTotalArea, delta);
    }

    @Test
    public void testSumAreas_EmptyArray() {
        Shape[] shapes = {};

        double actualTotalArea = Geometry.getTotalArea(shapes);

        double delta=0.0000001;
        assertEquals(0.0, actualTotalArea, delta);
    }

}