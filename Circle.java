/**
 * dinh nghia hinh tron la mot shape
 * co ban kinh va cach de tinh dien tich hinh tron
 */
public class Circle implements IShape {
    private double _radius;
    public Circle(double r) {
        _radius = r;
    }
    public double getArea() {
        return Math.PI * _radius * _radius;
    }
}