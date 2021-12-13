import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private double price;
    private double weight;
    private double speed;

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}