public class Tester{
  public static void main(String[]args){

    Point a = new Point(2, 1);
    Point b = new Point(4, 8);
    Point c = new Point(8, 5);
    Point d = new Point(-10, 10);
    Point e = new Point(10, 10);
    Point f = new Point(0, 0);
    Point g = new Point(-0.1, 0.4);
    Point h = new Point(-0.004, 58);
    Point i = new Point(-3, 0);
    Point j = new Point(3, 0);
    Point k = new Point(0, 3*Math.sqrt(3));

    Triangle first = new Triangle(a, b, c);
    Triangle second = new Triangle(d, e, f);
    Triangle third = new Triangle(i, j, k);
    System.out.println(third);

    System.out.println("distance: " + a.distanceTo(b));
    System.out.println("class: " + first.classify());
    System.out.println("perimeter: " + first.getPerimeter());
    System.out.println("area: " + first.getArea());

    System.out.println("distance: " + d.distanceTo(e));
    System.out.println("class: " + second.classify());
    System.out.println("perimeter: " + second.getPerimeter());
    System.out.println("area: " + second.getArea());

    System.out.println("distance: " + g.distanceTo(h));
    System.out.println("class: " + third.classify());
    System.out.println("perimeter: " + third.getPerimeter());
    System.out.println("area: " + third.getArea());

  }

}
