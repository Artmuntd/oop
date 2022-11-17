public class Car {
    private String brand;
    private  String model;
    private double engineVolume;
    private  String color;
    private int productionYear;
    private String productionCountry;

    public  Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume){
        this.brand =brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
    @Override
    public String toString(){
        return brand + model + productionYear + " год выпуска, сборка в" + productionCountry + "," + color + " цвет кузова "
                + "обьем двигателя " + engineVolume;
    }
}
