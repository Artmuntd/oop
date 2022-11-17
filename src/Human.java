public class Human {
    private int yearOfBirth;
   private String name;
   private String town;

   private String job;

   public  Human (String name, String town,  int yearOfBirth, String job) {
       if(name == "" || name == null) {
           this.name = "Информация отсутствует";
       } else {
           this.name = name;
       }
       if(town == "" || name == null) {
           this.town = "Информация отсутствует";
       } else {
           this.town = town;
       }
       if ( yearOfBirth >=0){
       this.yearOfBirth = yearOfBirth;}
       else {
           this.yearOfBirth = Math.abs(yearOfBirth);
       }
       if(job == "" || job == null) {
           this.job = "Информация отсутствует";
       } else {
           this.job = job;
       }
   }




    @Override
    public String toString(){
       return "Привет! Меня зовут  " + name + ". Я из города " + town + ".Я родился в " + yearOfBirth + " мне лет. " +
               "Я работаю на должности " + job +".Будем знакомы";
    }
}
