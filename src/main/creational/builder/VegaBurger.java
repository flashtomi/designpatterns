package builder;

public class VegaBurger extends Burger {

    @Override
    public String name() {
        return "Vega Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
