package builder;

/**
 * Builder pattern builds a complex object using simple objects and using a step by step approach.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 *
 * A Builder class builds the final object step by step. This builder is independent of other objects.
 */

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
