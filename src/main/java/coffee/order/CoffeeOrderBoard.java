package coffee.order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CoffeeOrderBoard {
    private static final Logger logger = LogManager.getLogger(CoffeeOrderBoard.class);
    public static void add(Order order){
        logger.debug("Add new order number ={} name= {}",order.number,order.name);
        Main.hashMap.put(Main.position++,order)
        ;
    }
    public void deliver(){
        for (int a:Main.hashMap.keySet()) {
            Main.hashMap.keySet().removeIf(key->key==a);
            logger.debug("Deliver firs in queue order number= {} ",a);
            break;

        }

    }
    public void deliver(int order){
        Main.hashMap.remove(order);
        logger.debug("Deliver in queue order number= {} ",order);
    }
    public void draw() {
        Main.hashMap.forEach((key,value)-> System.out.println(key+"|"+ value.name));
    }
}
