import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём объект Scanner
        Race race = new Race(); // Объект класса Race. Отслеживает текущего лидера.

        for (int i = 0; i < 3; i++) {
            System.out.println("— Введите название машины №" + (i+1) +":");
            String carName = scanner.nextLine();

            int carSpeed = 0;

            while (true) {
                System.out.println("— Введите скорость машины №" + (i + 1) + ":");

                // Проверяем, состоит ли следующее значение только из цифр и не превышает ли лимит Java
                if (scanner.hasNextInt()) {
                    carSpeed = scanner.nextInt();
                    if (carSpeed >= 0 && carSpeed <= 250) {
                        break;
                    } else {
                        System.out.println("— Неправильная скорость ");
                    }
                } else {
                    System.out.println("Введите скорость от 0 до 250!");
                    scanner.nextLine(); // Чистим сканнер от некорректного ввода
                }
            }
            scanner.nextLine(); // Очистка сканера.

            Car car = new Car(carName, carSpeed);
            race.currentLeader(car);

            System.out.println("Самая быстрая машина: " + race.getLeader().getCarName());
            
        }
        scanner.close(); // Сканер закрыт.
    }
}



/*

    1. Класс-конструктор Car, через который устанавливает параметры с помощью this.
    2. Класс Race хранит лидера гонки.
        1. String имя и его int скорость
        2. Метод определяющий лидера. Вызывается из Main.
    3. Класс Main
        1. Запрашиваем данные 3-х автомобилей, юзая циклы.
        2. Проверяем, что скорость 0-250.
        3. После ввода выводим текущего лидера из Race.


    Крит.
    1. Приложение запрашивает у пользователя все данные: просит ввести названия автомобилей и их скорости.
    2. Приложение умеет обрабатывать неправильно введённую скорость (правильная — от 0 до 250). Оно сообщает об этом пользователю и запрашивает скорость заново.
    3. Весь код не написан в одном классе Main.
    4. Приложение успешно компилируется и выполняется без ошибок.
    5. Приложение корректно вычисляет и выводит победителя гонки.

 */