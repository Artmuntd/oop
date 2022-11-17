public class Car {
    private String brand;
    private  String model;
    private double engineVolume;
    private  String color;
    private int productionYear;
    private String productionCountry;

    public  Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume){
        if( brand == ""){
        this.brand = "default";
        } else  {
            this.brand = brand;
        }
        if( model == ""){
            this.model = "default";
        } else  {
            this.model = model;
        }
        if( engineVolume <= 0){
            this.engineVolume = 1.5;
        } else  {
            this.engineVolume = engineVolume;
        }
        if( color == ""){
            this.color = "белый";
        } else  {
            this.color = color;
        }
        if( productionYear <= 0){
            this.productionYear = 2000;
        } else  {
            this.productionYear = productionYear;
        }
        if( model == ""){
            this.productionCountry = "default";
        } else  {
            this.productionCountry = productionCountry;
        }
    }
    @Override
    public String toString(){
        return brand + " " + model + " " + productionYear + " год выпуска, сборка в" + productionCountry + "," + color + " цвет кузова "
                + "обьем двигателя " + engineVolume;
    }
}
