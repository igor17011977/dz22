package coffee.order;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static int position;
    static Map<Integer, Order> hashMap = new HashMap<>();

    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard=new CoffeeOrderBoard();
        String[] name = {"Igor", "Aleksandr", "Kolya", "Sveta", "Tania", "Sofia"};
        Arrays.stream(name).forEach(e-> hashMap.put(++position, new Order(position,e)));
        CoffeeOrderBoard.add(new Order(++position,"Stas"));
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(5);
        coffeeOrderBoard.draw();
    }
}