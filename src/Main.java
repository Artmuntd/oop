import Transport.Car;

public class Main {
    static     Human [] Human;

    public static void main(String[] args) {

        Human = new Human[5];
        Human[0] = new Human("Максим","Минск",1986,"бренд-менеджер") ;
        Human[1] = new Human("Аня","Москва",29," методист образовательных программ") ;
        Human[2] = new Human("Катя","Каллининград",28, "продакт-менеджер") ;
        Human[3] = new Human("Артем","Москва",27,"директор по развитию бизнеса");
        Human[4] = new Human("Владимир","Казань",21, null);
        allInf();
        System.out.println(" ");


        Transport.Car audi= new Car("Audi", "A5",2022, "Германия", "черный",3.0);

        allInfCar(audi);
       Flower rosa = new Flower(null, "Голандия", 35.59);
        Flower hrizantema = new Flower(null, null, 15);
        hrizantema.lifeSpan = 5;
        Flower pion = new Flower(null, "Англия",69.9);
        pion.lifeSpan = 1;
        Flower gipsofila = new Flower(null, "Турция",19.5);
        gipsofila.lifeSpan = 10;
       printInfo(rosa);
        printInfo(hrizantema);
        printInfo(gipsofila);
        printInfo(pion);
        calculate(
                rosa,rosa,rosa,
                hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,
                gipsofila
        );


    }

    public static  void allInf(){
        for (int i = 0; i < Human.length; i++){
            System.out.println(Human[i].toString());
        }
    }
    public static  void allInfCar(Car car){
        System.out.println(
                car.getBrand() + " " + car.getModel() + " " + car.getColor() +
                " " + car.getProductionCountry() + " " + car.getProductionYear() +
                " " + car.getEngineVolume()+ " " + car.getSeatsCount() + car.getRegNumber() + car.getTypeBody()
                + car.getGears()+ ", " +  (car.isSummerTypes()? "летняя" : "зимняя ") +  " резина" + " "
                + (car.getKey().isWithoutKeyAccess()? " безключевой" : "ключевой") +  " "
                + (car.getKey().isRemoteRunEng()? "удаленный " : " не удаленный") + " "
                + car.getInsurance().getExpireDate() + " " + car.getInsurance().getNumber() + " " + car.getInsurance().getCost()
        );
    }

   private  static void printInfo(Flower flower) {

        System.out.println( " цвет " + flower.getFlowerColor() + ", Страна" + flower.getCountry() + " стоимость за штуку" + flower.getCost() +
                " срок стояния" + flower.lifeSpan );
    }

    private static void calculate ( Flower... flowers){
        double totalCost = 0;
        int minMinLifeSpan = Integer.MAX_VALUE;
        for( Flower flower: flowers) {
            if( flower.lifeSpan< minMinLifeSpan){
                minMinLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("стоимость букета"+ totalCost + " будет стоять" + minMinLifeSpan);
    }

}

