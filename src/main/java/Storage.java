
import java.util.ArrayList;
import java.util.List;

public class Storage {
    List<Details> body;
    List<Details> chassis;
    List<Details> engine;

    public Storage() {
        body = new ArrayList<>();
        chassis = new ArrayList<>();
        engine = new ArrayList<>();

    }

    public List<Details> detailsBody(){
        Details[] details = {Details.BODY_JETTA, Details.BODY_POLO};
        int end = (int) (Math.random()*50);
        for(int i = 0;i<end;i++){
            int ran = (int) (Math.random()*2);
            body. add(details[ran]);
        }
        Main.logger.debug("Создан пакет кузовов");
        return body;
    }

    public List<Details> detailsChassis(){
        Details[] details = {Details.CHASSIS_JETTA, Details.CHASSIS_POLO};
        int end = (int) (Math.random()*15);
        for(int i = 0;i<end;i++){
            int ran = (int) (Math.random()*2);
            chassis. add(details[ran]);
        }
        Main.logger.debug("Создан пакет шасси");
        return chassis;
    }

    public List<Details> detailsEngine(){
        Details[] details = {Details.ENGINE_JETTA, Details.ENGINE_POLO};
        int end = (int) (Math.random()*15);
        for(int i = 0;i<end;i++){
            int ran = (int) (Math.random()*2);
            engine. add(details[ran]);
        }
        Main.logger.debug("Создан пакет двигателей");
        return engine;
    }

    public List<Details> getBody() {
        return body;
    }

    public List<Details> getChassis() {
        return chassis;
    }

    public List<Details> getEngine() {
        return engine;
    }
}
