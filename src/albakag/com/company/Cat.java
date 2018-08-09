package albakag.com.company;

public class Cat {
    //сытость кота(false)
    boolean satiety;

    //колчиество еды которое планирует съесть кот
    int catPlanEat;

    public Cat(int catPlanEat) {
        this.catPlanEat = catPlanEat;
    }

    //проверка сытости кота
    boolean isCatSatiety(int availableFood) {
        if (catPlanEat > availableFood) {
            return false;
        }
        return true;
    }
}
