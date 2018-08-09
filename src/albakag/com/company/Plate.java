package albakag.com.company;

import java.util.Scanner;

public class Plate {
    Scanner scanner = new Scanner(System.in);

    //заполненность миски
    private int fillpPlate;

    //геттер для миски
    public int getFillpPlate() {
        return fillpPlate;
    }

    //конструктор класса
    public Plate(int fillpPlate) {
        this.fillpPlate = fillpPlate;
    }

    //высчитываем остаток еды в миске после кота
    int countingFood(int catEat) {
        fillpPlate = fillpPlate - catEat;
        return fillpPlate;
    }

    //добавляем еду в миску
    int addingFood() {
        System.out.println("Введите количество еды которое вы хотели добавить: ");
        int addFood = scanner.nextInt();
        System.out.println("Вы добавили - " + addFood);
        fillpPlate = fillpPlate + addFood;
        return fillpPlate;
    }
}
