package Task;

public class Main {
    public static void main(String[] args) {

        HotDrinks capuchino = new HotDrinks("capuchino", 0.5, false, 50, 150);
        HotDrinks espressoItaliano = new HotDrinks("espresso italiano", 0.7, false, 65, 95);
        HotDrinks glintvein = new HotDrinks("glintvein", 0.3, false, 40, 110);
        HotDrinks coffe = new HotDrinks("coffe", 0.2, true, 60, 100);
        HotDrinks latte = new HotDrinks("latte", 0.3, true, 65, 120);
        HotDrinks tea = new HotDrinks("tea", 0.4, true, 80, 40);

        HotDrinkMachine hotdrinks = new HotDrinkMachine();
        hotdrinks.addHotDrinks(espressoItaliano);
        hotdrinks.addHotDrinks(capuchino);
        hotdrinks.addHotDrinks(glintvein);
        hotdrinks.addHotDrinks(coffe);
        hotdrinks.addHotDrinks(latte);
        hotdrinks.addHotDrinks(tea);

        System.out.println(hotdrinks.getHotDrink());

        hotdrinks.shopHotDrinks();
    }
}
