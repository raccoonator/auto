
public class Automobile {
    private String model;
    private long vin;

    public Automobile(Model model, long vin) {
        this.model = model.toString();
        this.vin = vin;
        Main.logger.trace("Создан автомобиль");
    }

    public void printName() {
        System.out.println(model+" "+vin);
    }
}
