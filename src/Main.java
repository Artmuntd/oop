public class Main {
    static     Human [] Human;
    static     Car []Car;
    public static void main(String[] args) {

        Human = new Human[4];
        Human[0] = new Human("Максим","Минск",35,"бренд-менеджер") ;
        Human[1] = new Human("Аня","Москва",29," методист образовательных программ") ;
        Human[2] = new Human("Катя","Каллининград",28, "продакт-менеджер") ;
        Human[3] = new Human("Артем","Москва",27,"директор по развитию бизнеса");
        allInf();
        System.out.println(" ");
        Car = new Car[5];
        Car[0]= new Car("","Grande", 2015, "Россия", "Желтый", 1.7);
        Car[1]= new Car("Audi","A8 50 L TDI quattro", 2020, "Германии", "черный",  3.0);
        Car[2]= new Car("BMW","Z8",  2021, " Германия", "черный", 3.0);
        Car[3]= new Car("Kia ","Sportage 4 поколение", 2018, " Южная Корея", " красны", 2.4);
        Car[4]= new Car("Hyundai","Avante", 2016, "Южная Корея", " оранжевый", 1.6);
       allInfCar();
    }

    public static  void allInf(){
        for (int i = 0; i < Human.length; i++){
            System.out.println(Human[i].toString());
        }
    }
    public static  void allInfCar(){
        for (int i = 0; i < Car.length; i++){
            System.out.println(Car[i].toString());
        }
    }
}

