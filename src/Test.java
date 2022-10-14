public class Test {
    public static void main(String[] args) {
        Shape[] list = new Shape[2];
        list[0] = new Circle(2);
        list[1] = new Rectangle(5,10);


        System.out.println("Before resized:");
        for (Shape s:list) {
            if (s instanceof Circle) {
                System.out.println(((Circle) s).getArea());
            } else if (s instanceof Rectangle) {
                System.out.println(((Rectangle) s).getArea());
            }
        }

        System.out.println("After resized:");
        for (Shape s:list) {
            if (s instanceof Circle) {
                ((Circle) s).resize(10);
            } else if (s instanceof Rectangle) {
                ((Rectangle) s).resize(10);
            }
        }
    }
}
