package coffee.order;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Order {
    private static final Logger logger = LogManager.getLogger(Order.class);
    String name;
    int number;
    Order(int number,String name) {

        logger.debug("Add new order {} {}",number,name);
        this.name=name;
        this.number=number;
    }
}
