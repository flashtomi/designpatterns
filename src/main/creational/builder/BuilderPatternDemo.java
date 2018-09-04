package builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegaMeal = mealBuilder.prepareVegaMeal();
        System.out.println("Vega meal");
        vegaMeal.showItems();
        System.out.println("Total Cost: " + vegaMeal.getCost());

        Meal nonVegaMeal = mealBuilder.prepareNonVegaMeal();
        System.out.println("\n\nNon-Vega Meal");
        nonVegaMeal.showItems();
        System.out.println("Total Cost: " + nonVegaMeal.getCost());
    }
}
