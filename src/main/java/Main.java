import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        List<Automobile> autos = new ArrayList<>();
        Storage storage = new Storage();
        storage.detailsBody();
        storage.detailsChassis();
        storage.detailsEngine();
        while(true){
            try{autos.add(Production.auto(storage.getBody(), storage.getChassis(), storage.getEngine()));}
            catch (RuntimeException e){
                logger.error("Закончились подходящие детали");
                break;
            }
        }
        if(autos.isEmpty()){
            logger.info("Нет созданных автомобилей");
            System.out.println("No autos, try again");
        }
        autos.stream().forEach(x -> x.printName());
    }
}
