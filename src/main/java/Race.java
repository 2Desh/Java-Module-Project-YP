import java.util.ArrayList;
import java.util.List;

public class Race {
    private Car leader;

    public void currentLeader(Car car) { // Принимает новый автомобиль Car.
        if (leader == null || car.getCarSpeed() > leader.carSpeed) {leader = car;}
    } // Проверяем, что значение не равно пустышке. Если скорость новой машины > текущего лидера, то новая машина == лидер.


    public Car getLeader() {return leader;}
}