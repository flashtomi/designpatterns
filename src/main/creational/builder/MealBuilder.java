package builder;

public class MealBuilder {

    public Meal prepareVegaMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegaBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegaMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
