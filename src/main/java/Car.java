import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int price;
    private int weight;
    private int speed;

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}