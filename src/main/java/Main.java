public class Main {
  static   Controller controller = new Controller();
    public static void main(String[] args) {
        Car car1 = new Car(20000,2517,450);
        Car car2 = new Car(70000,250,210);
        Car car3 = new Car(456700,1234,1512);
        //method1
        System.out.println(controller.method1("DIV", 156, 6));
        System.out.println(controller.method1("POW",4,7));
        System.out.println(controller.method1("LOG10",4,8));
        System.out.println(controller.method1("LOG",4,8));
        //method2
        System.out.println(controller.method2("price",car1,4));
        System.out.println(controller.method2("weight",car2,14));
        System.out.println(controller.method2("speed",car3,23));
    }
}
