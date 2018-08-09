package albakag.com.company;

import java.util.ArrayList;
import java.util.List;

//из-за загруженности на работе не смог все до конца продумать...


public class Main {

    //суммарно коты хотят съесть в целочисленных единицах
    static int catEatsTotal = 0;
    Plate plate = new Plate(50);

    public static void main(String[] args) {
        Main main = new Main();

        // вызов метода кормления котов
        main.feedCats();

        //вызов метода добавления еды в миску
        main.plate.addingFood();

        //проверка все ли сыты, с возможность добавить еды в миску
        while (catEatsTotal > main.plate.getFillpPlate()) {
            System.out.println("Этого не хватит чтобы накормить всех, добавьте еще еды...");
            main.plate.addingFood();
        }

    }

    //метод кормления котов
    void feedCats() {

        //создаем массив котов
        Cat[] cat = new Cat[5];
        List<Integer> hungryCats = new ArrayList<>();
        cat[0] = new Cat(12);
        cat[1] = new Cat(23);
        cat[2] = new Cat(15);
        cat[3] = new Cat(14);
        cat[4] = new Cat(30);

        //кормление котов
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].isCatSatiety(plate.getFillpPlate()) && cat[i].satiety != true) {
                plate.countingFood(cat[i].catPlanEat);
                cat[i].satiety = true;
            } else {
                cat[i].satiety = false;
                hungryCats.add(cat[i].catPlanEat);
            }
            System.out.println("Кот " + (i + 1) + " сыт? - " + cat[i].satiety);
        }
        System.out.println("Остаток еды в миске " + plate.getFillpPlate());
        System.out.println("Количество голодных котов " + hungryCats.size());
        for (int i = 0; i < hungryCats.size(); i++) {
            catEatsTotal += hungryCats.get(i);
            System.out.println("Кот остался голоден на " + hungryCats.get(i));
        }
    }
}

