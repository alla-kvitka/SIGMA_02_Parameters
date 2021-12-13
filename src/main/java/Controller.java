import org.jetbrains.annotations.NotNull;

public class Controller {

    public Number method1(@NotNull String operation, int a, int b) {
        switch (operation) {
            case ("DIV"):
                return Math.floorDiv(a, b);
            case ("LOG"):
                return Math.log(a + b);
            case ("LOG10"):
                return Math.log10(a + b);
            case ("POW"):
                return Math.pow(a, b);
            default:
                System.out.println("No operation");
                break;
        }
        return -1;
    }

    public Car method2(@NotNull String field, Car car, double operand) {
        switch (field) {
            case ("price"):
                car.setPrice(car.getPrice() * operand);
                break;
            case ("weight"):
                car.setWeight(car.getWeight() * operand);
                break;
            case ("speed"):
                car.setSpeed(car.getSpeed() * operand);
                break;
            default:
                System.out.println("No field");
                break;
        }
        return car;
    }
}