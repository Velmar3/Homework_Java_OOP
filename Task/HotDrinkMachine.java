package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotDrinkMachine implements VendingMachine {
    private List<HotDrinks> hotDrinks;

    public HotDrinkMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    // метод добавляющий горячий напиток в список
    public void addHotDrinks(HotDrinks hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public List<HotDrinks> getHotDrink() {
        return hotDrinks;
    }

    @Override
    public void acceptingMoney() {
        System.out.println("Баланс пополнен");
    }

    @Override
    public void productDelivery() {
        System.out.print("Горячий напиток готов:");
    }

    @Override
    public void deliveryOfChange() {
        System.out.println("Заберите вашу сдачу!" );
    }

    public void shopHotDrinks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите горячий напиток из перечисленных!");
        for (HotDrinks hd : hotDrinks) {
            System.out.print(hd.getDrink() + "  ");
        }
        System.out.print("\nПоле для ввода: ");
        String inputHotDrink = scanner.nextLine();
        for (HotDrinks hotDrink : hotDrinks) {
            if (hotDrink.getDrink().equals(inputHotDrink)) {
                System.out.println("Оплатите напиток!\nСтоимость напитка = " + hotDrink.getPrice());
                System.out.print("Внесение суммы: ");
                String enterMoney = scanner.nextLine();
                int intMoney = Integer.parseInt(enterMoney);
                if (intMoney >= hotDrink.getPrice()) {
                    acceptingMoney();
                    productDelivery();
                    System.out.println(hotDrink);
                    int change = intMoney - hotDrink.getPrice();
                    deliveryOfChange();
                    System.out.println("Сдача = " + change);
                } else {
                    acceptingMoney();
                    System.out.println("Вы ввели недостаточно средств!");
                }

            }

        }

    }
}
