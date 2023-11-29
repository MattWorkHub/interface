public class Triangle  implements Shape {
    @Override
    public void calculateArea(double base, double heigth) {
        System.out.println("Triangle area = " + base * heigth / 2);
    }
}
