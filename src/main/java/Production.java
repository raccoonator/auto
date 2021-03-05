
import java.util.List;
import java.util.Random;

public class Production {

    public static Automobile auto(List<Details> detailsBody, List<Details> detailsChassis, List<Details> detailsEngine) {
        Model model = kindOfModel(detailsBody.get(0));
        detailsBody.remove(0);
        Details neededChassis = model.equals(Model.JETTA) ? Details.CHASSIS_JETTA : Details.CHASSIS_POLO;
        Details neededEngine = model.equals(Model.JETTA) ? Details.ENGINE_JETTA : Details.ENGINE_POLO;
        int chassis = detailsChassis.indexOf(neededChassis);
        if (chassis == -1) {
            Main.logger.error("Нет подходящих шасси");
            throw new RuntimeException("Не найдено нужное шасси");
        }
        detailsChassis.remove(chassis);
        int engine = detailsEngine.indexOf(neededEngine);
        if (engine == -1) {
            Main.logger.error("Нет подходящих двигателей");
            throw new RuntimeException("Не найден нужный двигатель");
        }
        detailsEngine.remove(engine);
        Random ran = new Random();
        long vin = Math.abs(ran.nextLong());
        Automobile auto = new Automobile(model, vin);
        return auto;
    }

    public static Model kindOfModel(Details detail) {
        if (detail.toString().contains(Model.JETTA.toString())) {
            return Model.JETTA;
        } else {
            return Model.POLO;
        }
    }

}
