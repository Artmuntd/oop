package Transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private  String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final   String typeBody;
    public  String regNumber;
    private final int seatsCount;
    private boolean summerTypes;
    private Key key;
    private  Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gears,
               String typeBody,
               String regNumber,
               int seatsCount,
               boolean summerTypes,
               Key key,
               Insurance insurance) {
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

            this.engineVolume = engineVolume;

        if( color == ""){
            this.color = "белый";
        } else  {
            this.color = color;
        }

            this.productionYear = 2000;
        if( model == ""){
            this.productionCountry = "default";
        } else  {
            this.productionCountry = productionCountry;
        }
        if( gears == ""){
            this.gears ="МКПП";
        } else  {
            this.gears = gears;
        }
        if( regNumber == null) {
            this.regNumber ="х000хх000";
        } else  {
            this.regNumber = regNumber;
        }
        if( typeBody == null) {
            this.typeBody ="седан";
        } else  {
            this.typeBody = typeBody;
        }
        if (key == null){
            this.key = new Key();
        } else {
            this.key = new Key();
        }
        if (insurance == null){
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }


        this.seatsCount =seatsCount;
        this.summerTypes =summerTypes;
    }

    public  Car(String brand,
                String model,
                int productionYear,
                String productionCountry,
                String color,
                double engineVolume
              ){

        this(brand,
              model,
               engineVolume,
             productionCountry,
        productionYear,
        color,
                "МКПП",
                "седан",
                "х000хх000",
                  5,
                  true,
                new Key(),
                new Insurance()
        );

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
      if(gears == null || gears == ""){
          this.gears ="МКПП";
      } else {
        this.gears = gears;
      }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if(regNumber == null){
            this.regNumber ="х000хх000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTypes() {
        return summerTypes;
    }

    public void setSummerTypes(boolean summerTypes) {
        this.summerTypes = summerTypes;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeBody() {

        return typeBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }
    public void changeTypes(){
        summerTypes = !summerTypes;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public  boolean corretRegNumber(){
        //"х000хх000"
        if(regNumber.length()!=9) {
            return false;
        }
         char []chars = regNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4])  || !Character.isAlphabetic(chars[5])){
            return false;
        }
        if(!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7])
                || !Character.isDigit(chars[8])) {
            return  false;
        }
        return  true;
    }
    public  static  class  Key {
        private  final  boolean remoteRunEng;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEng, boolean withoutKeyAccess) {
            this.remoteRunEng = remoteRunEng;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false,false);
        }

        public boolean isRemoteRunEng() {
            return remoteRunEng;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }
    public  static  class  Insurance{
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
           if (expireDate == null){
               this.expireDate = LocalDate.now().plusYears(1);
           } else {
            this.expireDate = expireDate; }
            this.cost = cost;
           if (number == null){
               this.number = "123456789";
           } else {
            this.number = number; }

        }

        public Insurance() {
            this(null,10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
        public  void  checkexp() {
            if(expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println(" Оформить страховку");
            }
        }
        public void checkNumb(){
            if(number.length()!=9){
                System.out.println(" Не правильный номер");
            }
        }
    }

}
