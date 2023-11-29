public class Rectangle implements Shape{
    @Override
    public void calculateArea(double base, double heigth) {
        System.out.println("Rectangle area = " + base * heigth);
    }
}
