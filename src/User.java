import java.time.LocalDate;

public class User {
    protected   String name;
    protected LocalDate dob;

    protected User(){
        this.name = null;
        this.dob = LocalDate.now();
    }
    protected User(String name , int year , int month , int day){
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }
    protected void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Birthday: "+dob);
    }
    /**protected boolean isBirthday(){
        if(dob){

        }
    }**/
}
